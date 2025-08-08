package ch13_inheritance.books;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석", "남궁성");
        book1.getTitle();
        book1.getAutor();
        book1.showInfo();
        System.out.println();
        EBook ebook1 = new EBook("스프링 입문","이강준", 5.2, "EPUB");
        ebook1.setFormat("PDF");
        ebook1.showInfo();

    }
}
