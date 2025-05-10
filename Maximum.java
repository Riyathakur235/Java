//import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
      // Scanner in = new Scanner(System.in);
       //System.out.println("enter the size of array" );
       //int n = in.nextInt();
      // int[]arr = new int[n];
      // System.out.println("Enter the value of array"); 
      // for(int i=0;i<n;i++){
        //arr[i] = in.nextInt();
      // }
       //int max=arr[0];
       //for(int i=0;i<n;i++){
        //if(arr[i]>max){
          //  max=arr[i];
         // }
         //}
         // System.out.println("maximum element:" +max);
         int[]arr={3,5,6,2};
      int min=arr[0];
      for(int i=0;i<4;i++){
        if(arr[i]<min){
            min=arr[i];

        }
      }
      System.out.println("Minimam element:" +min);
    }
}
