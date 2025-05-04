public class HCF {
    public static void two(int x,int y) {
      while(y!=0){
        int temp=y;
        y=x%y;
        x=temp;
      }
      System.out.println(x);
       }  
    public static void main(String[] args) {
        System.out.print("HCF is"+" ");
      two(12,15);
      
    }

}
