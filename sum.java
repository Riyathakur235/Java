public class sum {
    public static void main(String[] args) {
        int a=123;
       // int res =0;
        int sum=0;
        while(a>0){
         int digit = a%10;
        // res=res*10+digit;
         
         if(a%2==0){
             System.out.println("Even");
         }else{
            System.out.println("odd");
         }a=a/10;
         sum=sum+digit;
        } 
         System.out.println(sum);

        }
    }

