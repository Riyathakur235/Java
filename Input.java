import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
             int a=in.nextInt();
             switch (a) {
                case 1:
                System.out.println("Monday");
                    break;
             case 2:
             System.err.println("Tuesday");
             break;
             case 3:
             System.err.println("Wenesday");
             break;
             case 4:
             System.out.println("Thursday");
             break;
             case 5:
             System.out.println("Friday");
             break;
             case 6:
             System.out.println("Saturday");
             break;
             case 7:
             System.out.println("Sunday");
             break;

                default:
                System.out.println("0");
                    break;
             }
    }
}
