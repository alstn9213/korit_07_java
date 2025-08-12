package ch18_static.singleton.products;

public class ProductViewMain {
    public static void main(String[] args) {
        ProductView.getInstance(); // 생성자가 private 이라 생성자 호출 불가능
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();


    }
}
