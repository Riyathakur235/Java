public class Case {
    public static void main(String[] args) {
      char  ch='a';
        if(ch>='A'&& ch<='Z'){
            System.out.println("uppercase");
        }else if(ch>='a'&& ch<='z'){
            System.err.println("lowercase");
        }else
        System.err.println("Not an alphabet");
    }
}
