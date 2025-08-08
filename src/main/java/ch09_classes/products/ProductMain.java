package ch09_classes.products;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "LG엘패드";
        product1.num = 123456;

        Product product2 = new Product(9876564);
        product2.name = "다이소충전기";

        Product product3 = new Product("USB-C 케이블");
        product3.num = 159357;

        Product product4 = new Product("GFlip6",951753);


        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();

    }
}
