package self;

public class ArrayStudy {
    public static void main(String[] args) {
        String[] persons = {"김일","김이","김삼","김사","김오"};
        System.out.println();
        int count = 0;

        for(String name : persons) {
            int count2 = 0; // 반복문을 돌릴때마다 0으로 초기화되기 때문에 아래에서 ++count2를 해줘도 1만 반복된다.
            System.out.println(++count2 + "번 : "+ name);
        }
        System.out.println();
        for(String name : persons) {
            System.out.println(++count + "번 : "+ name);
        }
    }
}
