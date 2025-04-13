import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        boolean IsPrime =true;
        for(int i =2;i<=a/2;i++)
        {
            if(a%i == 0){
                IsPrime=false;
                break;

            }
        }
          System.out.println(IsPrime ? "Prime" :"Not Prime");
    }
}
