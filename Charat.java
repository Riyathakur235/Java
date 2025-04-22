public class Charat {
    public static void main(String[] args) {
        String str1="racecar";
        String str2="racecarww";
        //  for(int i=0;i<str.length();i++){
        //System.out.println(str.charAt(i));
    //}
   // for(int i=str.length()-1;i>=0;i--){
     //   System.out.println(str.charAt(i));
    //} 
    
    for(int i=0;i<str1.length();i++){
        System.out.println(str1.charAt(i));
    }
    for(int i=str1.length()-1;i>=0;i--){
        System.out.println(str1.charAt(i));
    }
    if(str1==str2){
        System.out.println("palindrom");
    }else{
        System.out.println("Not  palindrom");
    }

 }
}

