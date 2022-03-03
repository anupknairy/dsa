import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = { 20, 80, 10, 30, 40, 70};

        quicksort(arr, 0, arr.length-1);

        Arrays.stream(arr).forEach(System.out::println);

    }

    private static void quicksort(int[] arr, int left, int right) {

        if(left < right) {

            int pIndex = partition(arr, left, right);

            quicksort(arr, left, pIndex-1);
            quicksort(arr, pIndex+1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {

        int pivot = arr[right];

        int i = left-1;

        for(int j = left; j < right; j++){
            if(arr[j] < pivot){
                i++;

                if(i != j) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        i++;

        if(i != right)
        {
            int temp = arr[right];
            arr[right] = arr[i];
            arr[i] = temp;
        }

        return i;

    }
}
