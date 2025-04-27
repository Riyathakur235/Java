//public class Loop {
  //  public static void main(String[] args) {
       // for(int i=0;i<5;i++){
          //  System.err.println(i);
       // }
    
    // for(int i=1;i<=5;i++){
      //  for(int j=1;j<=i;j++){
           // System.out.println("*");
        //}
     //}
    //}
//}
public class Loop {
  static void sum(int a,int b){
   int c=a+b;
   int count=0;
   while(c>0){
    int digit =c%10;
    if(digit>=count){
     c=c/10;
    }
    count++;
   }
   System.out.println(count);
   }
 public static void main(String[] args) {
   sum(6,3);
 }  
}

