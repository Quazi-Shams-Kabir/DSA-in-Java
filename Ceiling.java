public class Ceiling {
    public static void main(String[] args) {
        int[] arr ={1,3,5,7,9,20,45};
        int target=10;
        System.out.println(ceiling(arr,target));  //ceiling: smallest num in the array which is greater than equal to target
    }
    static int ceiling(int[] arr,int target){
        if (target>arr[arr.length-1]){
            return -1;
        }
        int start =0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if (target>arr[mid]){
                start=mid+1;
            }
            else if (target<arr[mid]){
                end=mid-1;
            }
            else return mid;
        }
        return start;
    }
}
