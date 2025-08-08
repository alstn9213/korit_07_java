package ch07_loops;

public class Loop {
    public static void main(String[] args) {
        for(int i = 1; i < 101; i++) {
            System.out.println(i + " " + (i+1) + " " + (i+2) + " " + (i+9));
            i+=10;
        }
    }
}
