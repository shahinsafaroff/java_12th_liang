public class CopyingArrays {
    public static void main(String[] args) {
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[sourceArray.length];
        int i = 0;
        for (; i < sourceArray.length; i++){
            targetArray[i] = sourceArray[i];
        }
        for (i = 0; i < sourceArray.length; i++){
            System.out.print(" " + sourceArray[i]);
        }
        System.out.println("\n");

        for (i = 0; i < targetArray.length; i++){
            System.out.print(" " + targetArray[i]);
        }
    }
}
