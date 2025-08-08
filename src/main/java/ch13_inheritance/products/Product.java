package ch13_inheritance.products;

public class Product extends Item{
//    자식 고유의 필드 정의
    private int price;
    private int stock;

    public Product(String name, String category, int price, int stock) {
        super(name, category);
        this.price = price;
        this.stock = stock;
    }
// 자식 고유의 필드에 대한 getter / setter 정의
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void showInfo() {
        System.out.println("제품명 : " + this.getName()); // 부모 필드는 getter로 조회
        System.out.println("카테고리 : " + this.getCategory());
        System.out.println("가격 : " + price); // 자식 필드라서 필드로 직접조회
        System.out.println("재고 : " + stock);
    }

}
