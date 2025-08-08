package ch12_arrays;

public class Array01 {
    public static void main(String[] args) {
        int[] arr01 = {1,2,3,4,5};
//        int i = 1;
//        System.out.println(i); // 결과값 : 1
//        System.out.println(arr01); // 결과값: [I@36baf30c
//
//        System.out.println(arr01[0]); // 배열명[index]의 형태로 내부 데이터를 직접 확인가능
//        System.out.println(arr01[1]);
//        System.out.println(arr01[2]);
//        System.out.println(arr01[3]);
//        System.out.println(arr01[4]);
//
//        System.out.println();
//        for(int j=0;j<5;j++) {
//            System.out.print(arr01[j] + " ");
//        }
//        System.out.println();
//
//        for(int j=0;j<arr01.length;j++) {
//            System.out.print(arr01[j] + " / ");
//        }
        // 필드를 참조할 때 객체명.필드형태로 참조한다. feild를 직접 참조했다는 것은 length필드는 public이라는 것이다.

//        그렇다면 배열은 객체인가 -> 완전히 그렇지는 않지만 field로 length를 가진다.
        int[] arr02 = new int[10];

//        배열명.length쓰는 것을 생활화하자
//
        arr01[0] = 10; // 재대입
        System.out.println(arr01[0]); // 결과: 10

//        for( int i=0;i<arr02.length;i++) {
//            System.out.println(arr02[i]);
//        }

//        빈 배열에 값대입
        for( int i=0;i<arr02.length;i++) {
            arr02[i] = 21 + i;
            System.out.print(arr02[i] + " / ");
        }

        System.out.println();
        for(int i=0;i<arr02.length;i++) {

            arr02[i] *= 2;
            System.out.print(arr02[i] + ", ");
        }

        String[] strArray01 = {"안", "녕", "하", "세", "요"};
        System.out.println(strArray01[0]);
    }
}
