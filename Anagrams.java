import java.util.Arrays;

public class Anagrams {
  public static boolean Are(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }


    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(Are(str1, str2));
    }
}  
    

