package ch20_collections;

import java.util.*;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stuNum = 0;
        String fieldTrip;
        List<String> fieldTrips = new ArrayList<>();
        Set<String> fieldTripSet = new HashSet<>();

        System.out.print("몇 명의 학생이 수학여행지를 입력하시겠습니까? ");
        stuNum = scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<stuNum;i++) {
            System.out.print((i+1) + " 번 학생의 수학 여행지를 입력하세요 >>> ");
            fieldTrip = scanner.nextLine();
            fieldTrips.add(fieldTrip);
        }

        for(int i=0;i<fieldTrips.size();i++) {
            System.out.println((i+1) + "번 학생의 후보지 " + fieldTrips.get(i));
        }

        fieldTripSet.addAll(fieldTrips);
        List<String> modifiedFieldTrips = new ArrayList<>();
        modifiedFieldTrips.addAll(fieldTripSet);

        System.out.println("수학여행 후보지는 ");
        for(String str : modifiedFieldTrips) {
            System.out.println(str);
        }
        System.out.println("입니다.");
    }
}
