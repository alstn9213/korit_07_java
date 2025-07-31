package ch07_loops;

public class Loop2 {
    public static void main(String[] args) {
//        int i = 0;
//        while (i < 10) {
//            ++i;
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        while (i < 20) {
//            ++i;
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        while (i < 30) {
//            ++i;
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        while (i < 40) {
//            ++i;
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        while (i < 50) {
//            ++i;
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        while (i < 60) {
//            ++i;
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        while (i < 70) {
//            ++i;
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        while (i < 80) {
//            ++i;
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        while (i < 90) {
//            ++i;
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        while (i < 100) {
//            ++i;
//            System.out.print(i + " ");
//        }

//      내가 한 지저분한 방법
//        int j = 0;
//        int k = 0;
//
//        while(j<100) {
//            ++j;
//            System.out.print(j + " ");
//            ++k;
//            if(k%10==0 && k < 101) {
//                System.out.println();
//            }
//        }

//        깔끔한 방법. 하지만 연산이 많아진다.
//        int i = 0;
//        while(i<100){
//            ++i;
//            System.out.print(i);
//            if(i%10==0){
//                System.out.println();
//            }
//        }
//
        int j = 1;

        while(j<101) {

            System.out.println(j+" "+(j+1) + " "+(j+2) + " "+(j+3)+ " "+(j+4)+ " "+(j+5)+ " "+(j+6)+ " "+(j+7)+ " "+(j+8)+ " "+(j+9));
            j += 10;
        }
    }
}
