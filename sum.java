public class sum {
    public static void main(String[] args) {
        int a=789;
       // int res =0;
        int sum=0;
        while(a>0){
         int digit = a%10;
        // res=res*10+digit;
         a=a/10;
         sum=sum+digit;
        } 
         System.out.println(sum);

        }
    }

