package ch09_classes.products;

public class Product {
    int num;
    String name;

    public Product() {
    }

    public Product(int num) {
        this.num = num;
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, int num) {
        this.name = name;
        this.num = num;
    }

    void showInfo() {
        System.out.println("시리얼 넘버 : " + num + " " + "제품 타이틀 : " + name);
    }
}
