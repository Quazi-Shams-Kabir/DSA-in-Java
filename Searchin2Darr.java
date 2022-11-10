import java.util.Arrays;

public class Searchin2Darr {
    public static void main(String[] args) {
        int[][] arr = {{14, 15, 18}, {25, 26, 29}, {36, 38, 34}};
        int target = 34;
        System.out.println(isPresent(arr, target));
        int[] ans = indexIfPresent(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static boolean isPresent(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    static int[] indexIfPresent(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};

    }
}
