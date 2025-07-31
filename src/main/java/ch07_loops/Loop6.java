package ch07_loops;

public class Loop6 {
    public static void main(String[] args) {

//        직각삼각형
        for(int i=0;i<6;i++){
            for(int j=0;j<i;j++){ // 첫번째 for문은 0 < 0 이라서 중단돼서 첫번째 별은 안찍히고 바로 개행
                System.out.print("*");
            }
            System.out.println();
        }
//      역 직각삼각형
        for(int i=0;i<5;i++){
            for(int j=5;j-i>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

//        1부터 100까지 역순으로 출력
//        for(int i=100;i>0;i--){
//            System.out.println(i);
//        }


    }
}
