//import java.util.Scanner;

// public class Block {
//     public static void main(String[] args) {
//         //int a=10; int b=0;
//         Scanner in= new Scanner(System.in);
//         int a= in.nextInt();
//          System.out.println("enter the value b")
//         int b= in.nextInt();
//         try{
//             int c=a/b;
//             System.out.println(c);
//         } catch (Exception e) {
//             System.out.println("we can not divide by zero");
//         }
//         System.out.println("hello");
//         System.out.println("hii");
//     }
// }


// class Tryblock{
//     public static void main(String[] args) {
//        int[] arr={1,2,3,4};
//        try {
//         System.out.println(arr[6]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//         System.out.println(e);
//        } finally{
//         System.out.println("everything is fine");
//        }
//        System.out.println("hello");
//     }
// }

class Tryblock{
    public static void main(String[] args) {
                
        int arr[]={1,2,3,4,5}; 
      int maxsum=arr[0];
      int currMax=arr[0];
      for(int i=0;i<arr.length;i++){
        currMax+=arr[i];
       maxsum=Math.max(currMax,currMax);
      } try {
        System.out.println("Max Subarray sum="+maxsum);  
      } catch (ArithmeticException e) {
        System.out.println("currsum not find ");
      }   
 }
}