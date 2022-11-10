import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name="Shams";
        char target = 'm';
        System.out.println(isPresent(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));   //this will print the string in character array, and you can use it in for each loop, coz for each loop only works in collection of array.
    }
    static boolean isPresent(String name, char target){
        if (name.length()==0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {      //.length() is a method which return count of char in string, not same as .length
            if (target==name.charAt(i)){
                return true;
            }
        }
        return false;

    }

}
