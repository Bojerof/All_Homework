package Homework_2;

public class Task_3 {
    public static boolean truth(int[] numberArray){
        for (int i = 0; i < numberArray.length - 1; i++) {
            if (numberArray[i] == 0 && numberArray[i + 1] == 0)
                return true;
        }
        return false;
    }
}
