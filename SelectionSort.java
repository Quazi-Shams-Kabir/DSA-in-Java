import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //find the max item in remaining array and swap it with its correct index, i.e. max element at last , second max at second last and so on
        int[] arr = {3,58,1,4,8,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int last = arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static int getMaxIndex(int[] arr,int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first,int second){
            int temp = arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
    }
}

//time complexity = O(n^2) best and worst both
//this works well in small array
