package ch18_static.singleton.products;

public class ProductView {
//    정적변수선언
    private static ProductView instance; // ProductView 클래스의 정적 필드

//    private으로 생성자를 선언
    private ProductView() {
        int counter = 1;
        System.out.println(counter + " 번 째 객체가 생성되었습니다.");
        counter++;
    }

    public static ProductView getInstance() {
        if(instance == null) {
            instance = new ProductView();
        }
        return instance;
    }

}
