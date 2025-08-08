package ch13_inheritance.products;

public class ProductMain {
    public static void main(String[] args) {
        Item item1 = new Item("일반 상품", "일반 카테고리");
        String name1 = item1.getName();
        String category1 = item1.getCategory();
        System.out.println("이 상품은 "+name1+"입니다.");
        System.out.println("이 상품은 "+category1+"입니다.");
        Product product1 = new Product("전자제품", "가전 제품", 100000, 10);
        product1.setCategory("백색 가전 제품");
        String category2 = product1.getCategory();
        System.out.println("해당 제품은 " + category2 + "입니다.");

    }
}
