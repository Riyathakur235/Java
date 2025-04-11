import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.err.println("Enter your 1st no.");
        int a =in.nextInt();
        System.err.println("Enter your 2nd no.");
        int b = in.nextInt();
        System.out.println("Enter your comand");
        int c = in.next().charAt(0);
        switch (c) {
            case '+':
            System.err.println(a+b);
                break;
                case '-':
                System.err.println(a-b);
                break;
                case'*':
                System.err.println(a*b);
                break;
                case'/':
                System.err.println(a/b);
                break;
        
            default:
            System.err.println("o");
                break;
        }

    }
}
