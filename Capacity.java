//public class Capacity {
    //static void sum(int a){
      //  int sum=0;
        //while (a>0) {
          //  int digit=a%10;
            //a=a/10;
            //sum=sum+digit;
        //}
        //System.out.println(sum);       
   //}
    //public static void main(String[] args) {
      //  sum(123);

    //}
//}
//without using static we call class creating object
//Capacity obj=new Capacity();
//obj.sum();
                // mutable string 
       // StringBuilder str= new StringBuilder(10);
       // str.append("hello hii byy ");
        //old capacity*2+2
      //  System.out.println(str.length());
       // System.out.println(str.capacity());
                // using int call the function 
       public class Capacity{
        static int sum (int a,int b){
            return a+b;
        }
        public static void main(String[] args) {
            int output = sum(3,4);
            System.out.println(output);
        }
       }
       