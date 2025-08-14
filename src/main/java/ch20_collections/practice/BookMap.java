package ch20_collections.practice;

import java.util.*;

public class BookMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String book = "";
        int bookNum = 0;
        boolean endOfProgram = false;


        System.out.println("---도서 재고 관리 프로그램---");
        while(!endOfProgram) {
            System.out.println("1. 도서추가");
            System.out.println("2. 재고수정");
            System.out.println("3. 재고 목록");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");
            String numstr = scanner.nextLine();
            switch (numstr) {
                case "1":
                    System.out.print("새 도서명을 입력하세요 >>> ");
                    book = scanner.nextLine();
                        if(map.containsKey(book)) {
                            System.out.println("이미 재고에 있는 도서입니다.");
                        }
                    System.out.print("재고 수량을 입력하세요 >>>");
                    bookNum = scanner.nextInt();
                    scanner.nextLine();
                    map.put(book, bookNum);
                    System.out.println(book+"도서가 "+ bookNum +" 권 추가되었습니다.");
                    break;
                case "2":
                    System.out.print("재고를 변경할 도서명을 입력하세요 >>> ");
                    book = scanner.nextLine();
                        if(!map.containsKey(book)){
                            System.out.println("해당 도서가 재고에 없습니다.");
                            continue;
                        }
                    System.out.print("새로운 재고 수량을 입력하세요 >>>");
                    bookNum = scanner.nextInt();
                    map.replace(book, bookNum);
                    System.out.println(book+"도서가 "+bookNum+" 권으로 변경되었습니다.");
                    break;
                case "3":
                    List<String> bookNumList = new ArrayList<>();
                    Set<String> keySet = map.keySet();

                    bookNumList.addAll(keySet);
                    System.out.println("---현재 재고 목록---");

                    for(String key: keySet) {
                        System.out.println("도서명 : "+key+" 재고 수량 : " + map.get(key)+ " 권");
                    }
                    break;
                case "4":
                    System.out.println("프로그램을 종료합니다.");
                    endOfProgram = true;
                    break;
            }

        }
    }
}
