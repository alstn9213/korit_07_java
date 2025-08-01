package ch09_classes;

public class ClassAMain {
    public static void main(String[] args) {
        ClassA classA1 = new ClassA();

        classA1.num = 1;
        classA1.name = "김일";
        classA1.score = 4.2;

        System.out.println(classA1.name + " 학생의 학번은 "+classA1.num+"번 이고, 점수는 "+classA1.score+"입니다.");

        classA1.callName();
    }
}
