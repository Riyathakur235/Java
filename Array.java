import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
       // int arr[]={1,2,4,5,6};
        //for(int i=0;i<arr.length;i++){
          //  System.out.println(arr[i]);
        //}
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of arr");
        int n = in.nextInt();
        int[]arr= new int[n];
        System.out.println("Enter value of arr");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(k);
        }
    }
}
