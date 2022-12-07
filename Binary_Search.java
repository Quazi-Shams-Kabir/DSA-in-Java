public class Binary_Search {
    public static void main(String[] args) {
        int[] arr ={1,3,5,7,9,20,45};  //notice it's a sorted array
        int target=9;  //return index if present else -1
        System.out.println(binary_search(arr,target));

    }

    static int binary_search(int[] arr, int target) {
        int start=0;
        int end =arr.length-1;

        while (start<=end){
            //in B.S. we need the mid-element to work on
            int mid = start+(end-start)/2;   //same as start+end/2 but that find exceeds the range of int so its more efficient formula
            if (target>arr[mid]){
                start = mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else return mid;
        }
        return -1;
    }
}
