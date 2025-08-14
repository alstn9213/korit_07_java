package ch20_collections.practice;

import java.util.*;

/*
* */
public class Meeting {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        List<String> meetingList = new ArrayList<>();
        String name = "";
        System.out.println("--- 모임 참석자 명단 관리 ---");
        System.out.println("[ 종료 ]를 입력하면 프로그램을 종료합니다.");
        while(true) {
            System.out.print("참석자 이름을 입력하세요 >>> ");
            name = scanner.nextLine();
            if(name.equals("종료")) {
                break;
            }
            set.add(name);
        }
        System.out.println("프로그램이 종료되었습니다.");
        System.out.println("---최종 참석자 명단---");
        meetingList.addAll(set);
//        System.out.println(meetingList);
        for(int i=0; i<meetingList.size();i++){
            if(i==meetingList.size()-1) {
                System.out.println(meetingList.get(i));
                break;
            }
            System.out.println(meetingList.get(i)+", ");
        }
    }

}
