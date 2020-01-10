import java.util.ArrayList;
import java.util.Arrays;

public class Chapter1 {
    // 1.1 Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional
    // data structures?

    /*
     * Thought Process:
     * If the string is empty, it is unique. Otherwise:
     * Normalized string first and created a dynamic array (arraylist) and added a letter (char) from the string if it
     * did not exist inside the array. If it did exist, return false, showing that the string does not have unique
     * characters; Else, return true showing that all the characters in the string are unique.
     */
    public static boolean isUnique(String str){
        if(str.isEmpty()){
            return true;
        }
        str = str.trim().toLowerCase();
        ArrayList<Character> charList = new ArrayList<Character>();
        for(char c: str.toCharArray()){
            if(charList.contains(c)){
                return false;
            } else {
                charList.add(c);
            }
        }
        return true;
    }

    /*
     * Thought Process:
     * If the string is empty, it is unique. Otherwise:
     * Normalized string first and converted string to a char array (does that count as an additional data structure?)
     * and sorted it. Then checked if adjacent characters are the same. If they are, return false. Otherwise, return
     * true.
     */
    public static boolean isUniqueNoStruct(String str){
        if(str.isEmpty()){
            return true;
        }
        str = str.trim().toLowerCase();
        char[] charArray =  str.toCharArray();
        Arrays.sort(charArray);
        for(int i = 0; i < str.length() - 1; i++){
            if(charArray[i] == charArray[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String test1 = "hello";
        String test2 = "helo";
        System.out.println(isUnique(test1));
        System.out.println(isUnique(test2));
        System.out.println(isUniqueNoStruct(test1));
        System.out.println(isUniqueNoStruct(test2));
    }
}
