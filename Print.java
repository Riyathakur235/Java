import java.util.*;

public class Print {
    public static void main(String[] args) {
   Scanner in = new  Scanner(System.in);
   int a =in.nextInt();
   //for(int i=1;i<=a;i++){
    //System.out.println(i);
   //}
   int sum=0;
   int i=0;
   while(i<=a){
    sum=sum+i;
    i++;
   }
   System.out.println(sum);
    }
}
