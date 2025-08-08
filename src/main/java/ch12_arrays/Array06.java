package ch12_arrays;

public class Array06 {
    public static void main(String[] args) {
        int[] scores = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        int sum = 0;
        double avg = 0;
        for(int i=0;i<scores.length;i++){
            sum += scores[i];
        }
        avg = sum/scores.length;

        System.out.println(sum);

        System.out.println(avg);

    }
}
