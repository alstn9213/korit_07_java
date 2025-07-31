package ch08_methods;

import java.util.Scanner;

public class Method02 {

//    call4() 유형으로 작성예정. 몇 줄짜리인지 어떤 유형의 별찍기인지를 main에서 받을예정
    public static String getStar(int rows, int option) {
        String result = "임시";
//       이 사이에 별찍기 관련 로직이 들어갈 예정
        return result;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowOfStars = 0;
        int choice = 0;
        String starResult = "";

        System.out.print("몇줄짜리 별을 생성할까요? >>> ");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("선택하세요 >>> ");
        choice = scanner.nextInt();

        starResult = getStar(rowOfStars, choice);

        System.out.println(starResult);

    }
}
