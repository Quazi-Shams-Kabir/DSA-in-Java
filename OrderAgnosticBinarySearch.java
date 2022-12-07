public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr ={1,3,5,7,9,20,45};
        int[] arr1 ={45,20,9,7,5,3,1};
        int target=9;
        System.out.println(binary_search(arr1,target));
    }

    static int binary_search(int[] arr, int target) {
        int start=0;
        int end =arr.length-1;
        //check whether ascending or not
        boolean isAsc = arr[start]<arr[end];

        while (start<=end){

            int mid = start+(end-start)/2;

            if (target==arr[mid])return mid;

            if (isAsc){
                if (target>arr[mid]){
                    start = mid+1;
                } else if (target<arr[mid]) {
                    end=mid-1;
                }
            }
            else {
                if (target<arr[mid]){
                    start = mid+1;
                } else if (target>arr[mid]) {
                    end=mid-1;
                }
            }

        }
        return -1;
    }
}
