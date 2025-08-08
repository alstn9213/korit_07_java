package ch07_loops;

public class Loop01 {
    public static void main(String[] args) {
//        1부터 100까지 출력
//        int i = 1;
//        while(i<101){
//            System.out.println(i); //i가 먼저 출력
//            i++; // 더해주기. 이후에는 101이 실행부에서 쓰이지않고 머무름
//            if(i>100) System.out.println(i); // 101
//        }
//        int j = 0;
//        while(j<100){
//            System.out.println(++j); // j를 더해주고 출력
//        }

        int num1= 1;
        int sum = 0;

        while(num1<101){
            sum += num1;
            ++num1;
//            sum += num1++; // 실행부의 또다른 방식
        }
        System.out.println(sum);


        sum = 100 * 101 / 2; // 등차수열 이용
        System.out.println(sum);

        int j = 0;
        int sum2 = 0;
//        while(j<100){
//            if(j%2==0) {
//                sum2 += j;
//            }
//            j++;
//        }
        while(j<101) {
            sum2 += j;
            j += 2;
        }
        System.out.println(sum2);

//        1부터 100까지 가로로 출력
        int k = 0;

        while(k<100){
            System.out.print(++k+" ");
        }





    }
}
