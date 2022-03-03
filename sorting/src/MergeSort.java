import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = { 2, 8, 1, 3, 11, -1};

        sort(arr, 0, arr.length-1);

        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void sort(int[] arr, int start, int end) {

        if(start < end)
        {
            int mid = start + (end-start)/2;

            sort(arr, start, mid);
            sort(arr, mid+1, end);

            merge(arr, start, end, mid);
        }
    }

    // Merges two subarrays of arr[].
    // First subarray is arr[start..mid]
    // Second subarray is arr[mid+1..end]
    private static void merge(int[] arr, int start, int end, int mid) {

        int LArr[] = new int[mid-start+1];
        int RArr[] = new int[end-mid];

        int i=0,j=0;
        for(int c=start;c<=mid;c++) {
            LArr[i++] = arr[c];
        }
        for(int c=mid+1;c<=end;c++) {
            RArr[j++] = arr[c];
        }

        i=0; j=0;
        int k=start;

        while(i<LArr.length && j<RArr.length){

            if(LArr[i]<RArr[j]) {
                arr[k] = LArr[i];
                i++;
            } else {
                arr[k] = RArr[j];
                j++;
            }
            k++;
        }

        while(i<LArr.length) {
            arr[k] = LArr[i];
            i++;
            k++;
        }
        while (j<RArr.length) {
            arr[k] = RArr[j];
            j++;
            k++;
        }
    }
}
