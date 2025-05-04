import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int i= in.nextInt();
        int n=i;
        int s=0;    
        while(n>0){
            int j=n%10;
             s=s+j*j*j;
            n/=10;
        }
        if(s==i){
           System.out.println("Number is amstrong ");
        }else{
            System.out.println("Number is not amstrong");
        }
    }
}
