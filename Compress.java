public class Compress {
    public static void main(String[] args) {
         String  str ="aaabbbccc";
         StringBuilder newstr= new StringBuilder();
         int count=1;
         for(int i=1;i<=str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
               count++;
            }
            else{
                newstr.append(str.charAt(i-1)).append(count);
                count=1;
            }
         }
         System.out.println(newstr);
    }
}
