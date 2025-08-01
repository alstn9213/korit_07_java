package ch09_classes.students;

public class Student {
    int studentCode;
    String name;
    double score;

    Student() {
        System.out.println("기본 생성자로 객체를 생성했습니다.");
    }
    Student(int studentCode) {
        System.out.println("int 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
    }
    Student(String name) {
        System.out.println("String 매개변수 생성자로 객체를 생성했습니다.");
        this.name = name;
    }
    Student(int studentCode,String name) {
        System.out.println("int, String 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
        this.name = name;
    }
    Student(int studentCode, String name, double score) {
        System.out.println("int, String, double 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }
    void showInfo() {
        System.out.println(name+"학생의 정보입니다.");
        System.out.println("학번 : "+studentCode);
        System.out.println("이름 : "+name);
        System.out.println("점수 : "+score);
    }


}
