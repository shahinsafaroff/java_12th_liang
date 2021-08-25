public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 4, 2, 5, -3, 6, 2};
        int searchNumber = binarySearch(list, 2);
        System.out.println(searchNumber);
    }
    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;

        while (high >= low){
            int middle = (low + high) / 2;
            if (key <list[middle])
                high = middle - 1;
            else
                low = middle + 1;
        }
        return low -1;
    }
}
