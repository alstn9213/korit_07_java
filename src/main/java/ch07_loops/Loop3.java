package ch07_loops;

public class Loop3 {
    public static void main(String[] args) {

//        int day = 1;
//
//        while(day<6) {
//            int lesson = 1; // 지역변수 while 반복문이 끝남과 동시에 변수가 사라짐
//
//            while(lesson < 4) {
//                System.out.println(day+"일차 " + lesson + "교시 입니다.");
//                lesson++;
//            }
//            day++;
//        }

        int dan = 2;
        while(dan < 10) {
            int i = 1;
            while(i<10){
                System.out.println(dan + " x " + i + " = " + dan*i);
                i++;
            }
            dan++;
        }

    }
}
