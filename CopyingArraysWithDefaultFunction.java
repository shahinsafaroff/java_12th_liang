import java.lang.System;
import java.util.Arrays;
public class CopyingArraysWithDefaultFunction {
    public static void main(String[] args) {
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[5];
        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
        System.out.println(Arrays.toString(targetArray));
    }
}

