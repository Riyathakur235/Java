//class Parent{
  //  void sum(int a,int b){
    //    System.out.println(a+b);
    //}
    //void sum(int a,int b,int c){
      //  System.out.println(a+b+c);
    //}
//}
class Area{
    void circle(int r){
        System.out.println(3.14*r*r);
    }
    void triangle(int b,int h){
        System.out.println(1/2*b*h);
    }
    void Rectangle(int l,int w ){
        System.out.println(l*w);
    }
}
public class Methodoverload {
    public static void main(String[] args) {
     // Parent obj = new  Parent();
      //obj.sum(2,4); 
      Area obj=new Area();
      obj.circle(8);
      obj.Rectangle(5,6); 
      obj.triangle(6,9);
    }
}
