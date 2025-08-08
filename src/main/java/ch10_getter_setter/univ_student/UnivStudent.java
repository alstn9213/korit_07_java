package ch10_getter_setter.univ_student;

public class UnivStudent {
    String name;
    int grade;
    double score;

    public UnivStudent() {
    }

    public UnivStudent(String name) {
        this.name = name;
    }

    public UnivStudent(int grade) {
        this.grade = grade;
    }

    public UnivStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public UnivStudent(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public void setName(String name) {
        if(name.length() > 4) {
            System.out.println("불가능한 입력입니다.");
            return;
        }
        this.name = name;
    }

    public void setGrade(int grade) {
        if(grade > 4.5 || grade < 1) {
            System.out.println("불가능한 입력입니다.");
            return;

        }
        this.grade = grade;
    }

    public void setScore(double score) {
        if(score < 0.0 || score > 4.5) {
            System.out.println("불가능한 입력입니다.");
            return;
        }
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public int getGrade() {
        return grade;
    }

    public void showInfo() {
        System.out.println("이름 :" + name);
        System.out.println("학년 :" + grade + "학년");
        System.out.println("점수 :" + score);
    }
}
