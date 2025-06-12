import java.util.Arrays;
public class Sort {
    public static void Sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] data = {12, 11, 13, 5, 6};
        System.out.println("Before sorting: " + Arrays.toString(data));
        Sort(data);
        System.out.println("After sorting:  " + Arrays.toString(data));
    }
}