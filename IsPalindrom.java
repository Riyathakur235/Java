public class IsPalindrom {
    public  static boolean palindrom(int x) {
      if (x < 0) {
          return false;
      }
      String str = String.valueOf(x);
      int left = 0, right = str.length() - 1;
      while (left < right) {
          if(str.charAt(left)!=str.charAt(right)){
              return  false;
          }
          left++;
          right--;
      }
      return true;
  }

    public static void main(String[] args) {
        System.out.println(palindrom(121));
        System.out.println(palindrom(-121));
        System.out.println(palindrom(10));
    }
}

