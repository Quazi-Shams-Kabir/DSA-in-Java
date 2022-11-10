public class isPresent {
    public static void main(String[] args) {
        int[] arr = {18,1,84,15,484,5,48,15};  //if there is an unsorted array you have to do linear search
        int target = 84;
        System.out.println(isPresent(arr,target));
    }
    static boolean isPresent(int [] arr,int target){
        for (int i : arr) {
            if (i == target) {
                return true;
            }
        }
            return false;
    }

    //we can search in range too just add the starting point and end point in the for loop
}
