package ch12_arrays;

public class Array08 {


    public int calcSum(int[] intArray) {
        int sum = 0;
        for(int i=0;i<intArray.length;i++){
            sum += intArray[i];
        }
        return sum;
    }

    public double calcAvg(int[] intArray) {
        double avg = 0;
        int sum = calcSum(intArray);
        return avg = (double)sum/intArray.length;

    }
    public static void main(String[] args) {
        Array08 array08 = new Array08();
        int[] scores = {100, 97, 83, 85, 77, 76, 64, 64, 58, 59, 92, 100};
        System.out.println("총합 : "+array08.calcSum(scores) + "점");
        System.out.println("평균 : "+array08.calcAvg(scores) + "점");
    }
}
