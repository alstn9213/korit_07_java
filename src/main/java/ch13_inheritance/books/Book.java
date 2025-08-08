package ch13_inheritance.books;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void getTitle() {
        System.out.println("이 책의 제목은 " + this.title +"입니다.");
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void getAutor() {
        System.out.println("이 책의 저자는 " + this.author + "입니다.");
    }

    public void setAutor(String autor) {
        this.author = author;
    }

    public void showInfo() {
        System.out.println("제목 : " + this.title);
        System.out.println("저자 : " + this.author);
    }
}
