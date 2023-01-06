import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {3,5,8,6,4,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean isSwapped;
        //run the outer loop n-1 times
        for (int i = 0; i <arr.length ; i++) {
            isSwapped=false;
            // for each step the max item will come at the last respective index
            for (int j = 1; j < arr.length-i ; j++) {           //arr.length-1 will ensure it'll not run the loop for the sorted position
                //swap if the index element is smaller than the previous index element
                if (arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSwapped=true;
                }
                //it'll ensure the loop will break if no swapping occur, which eventually mean the array is sorted
                if (!isSwapped){
                    break;
                }
            }
        }
    }
}
