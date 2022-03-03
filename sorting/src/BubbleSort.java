import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = { 2, 8, 1, 3, 11, -1};

        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
