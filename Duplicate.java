public class Duplicate {
    public static void main(String[] args) {
       // String str="hhllo";
        //String newstr="";
        //for(int i=0;i<str.length();i++){
          //  char c=str.charAt(i);
            //if(newstr.indexOf(c)==-1){
              //  newstr=newstr+c;
            //}
        //}
        //System.out.println(newstr +" ");
        //first repeat 
       // String str="helllooo";
        //char[]ch=str.toCharArray();
        //for(int i=0;i<ch.length;i++){
          //  for(int j=i+1;j<ch.length;j++){
            //    if(ch[i]==ch[j]){
              //      System.out.println(ch[i]);
              //system.out.println(ch[j]);    last l
                //    return;
                //}
            //}
        //}
       String str="helololl";
       char[]ch=str.toCharArray();
       for(int i=0;i<str.length();i++){
        for(int j=i+2;j<ch.length;j++){
          if(ch[i]==ch[j]){
            System.out.println(ch[i]);
            return;
          }  
        }
       }
    }
}
