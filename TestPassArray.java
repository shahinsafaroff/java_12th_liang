public class TestPassArray {
    public static void main(String[] args) {
        int[] array = {1,2};
        System.out.println("Before invoking array:");
        System.out.println("array is {" + array[0] + ", " + array[1] + "}");
        swapFirstTwoIndexInArray(array);
        System.out.println("After invoking swap");
        System.out.println("array is {" + array[0] + ", " + array[1] + "}" );
        }
    public static void swapFirstTwoIndexInArray(int[] array){
        int temp = array[0];
        array[0]= array[1];
        array[1] = temp;
    }
}
