import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of arr");
        int n = in.nextInt();
        int[]arr =new int[n];
        System.out.println("enter value of arr");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt(); 
           }
           for(int k=n;k<=0;k--){
            System.out.println(arr[k]); 
           }
        }
    }

