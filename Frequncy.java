public class Frequncy {
    public static void main(String[] args) {
        String str="racecarjhdgahaha";
        int count=0;
        //char[] arr=str.toCharArray();
       // for(int i=0;i<str.length();i++){
         //   if(str.charAt(i)==target.charAt(0)){ 
           //    count++;
            //} 
            //System.out.println(count);
            //}
       for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch=='a'|| ch=='A'|| ch=='i'|| ch=='I'||ch=='o'|| ch=='O'|| ch=='u'|| ch=='U'){
       count++;
        }
       }
         System.out.println(count);
         System.out.println(str.length()-count);   
         
        }
    }

