import java.util.Scanner;

public class Bits {
  public static void main(String[] args) {
    //  int n=5;
    // int pos =2;
    // int bitMask=1<<pos;
    // Get  bit operatuon
    // if((bitMask & n)==0){
    //     System.out.println("bit was zero");
    // }else{
    //    System.out.println("bit was one");
    // }

    //Set bit operation
    //  int newwNumber=bitMask|n;
    //  System.out.println(newwNumber);
    
    //Clear bit operation
    // int notBitMask=~(bitMask);
    // int newwNumber= notBitMask & n;
    // System.out.println(newwNumber);

    //Update bit operation
    Scanner sc =new Scanner(System.in);
    int oper=sc.nextInt();
    int n=5;
    int pos=1;
    int bitMask=1<<pos;
    if(oper==1){
        int newwNumber= bitMask|n;
        System.out.println(newwNumber);
    }else{
        int newBitMask=~(bitMask);
        int newwNumber=newBitMask&n;
        System.out.println(newwNumber);
    }
  }  
}
