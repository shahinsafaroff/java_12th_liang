public class LinearSearch {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 4, 2, 5, -3, 6, 2};
        int searchNumber = linearSearch(list, -3);
        System.out.println(searchNumber);
    }
    public static int linearSearch(int[] list, int key){
        for (int i = 0; i < list.length; i++){
            if (key == list[i])
                return i;
        }
        return -1;
    }
}
