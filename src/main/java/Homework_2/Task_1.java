package Homework_2;

public class Task_1 {
    public static int countEvens(int[] numberArray){
        int sum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] % 2 == 0){
                sum += numberArray[i];
            }
        }
        return sum;
    }
}
