package Homework_2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Task_2 {
    public static int diff(int[] numberArray){
//        int max = Arrays.stream(numberArray).max().getAsInt();
//        int min = Arrays.stream(numberArray).min().getAsInt();
        int min = numberArray[0];
        int max = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (max < numberArray[i]){
                max = numberArray[i];
            } else if (min > numberArray[i]){
                min = numberArray[i];
            }
        }
        return max - min;
    }
}
