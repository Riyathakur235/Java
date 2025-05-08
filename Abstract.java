//abstract class Payment{
  //  abstract void pay(int a);
    //void print(){
      //  System.out.println("payment done");
    //}
//} 
//class upiPayment extends Payment{
  //  void pay(int a){
    //    System.out.println("Payment doen via upi"+a);
    //}
//} 
//class CardPayment extends Payment{
  //  void pay(int b){
    //    System.out.println("Payment done"+b);
    //}
//}
 // abstract class Shape{
   // abstract void area(int a,int w);
  //}
  //class Circle extends Shape{
    //void area(int a,int w){
      //  System.out.println(3.14*a*a);
    //}
/*  }
  class Rectangle extends Shape{
    void area(int a,int w){
    System.out.println(a*w);
    }
  } */
 abstract class Animal{
    abstract  void Sound();
}
 class Dog extends Animal{
    void Sound(){
        System.out.println("barkkk");
    }
 }
 class Cat extends Animal{
    void Sound(){
        System.out.println("meoww");
    }
 }
public class Abstract {
    public static void main(String[] args) {
      // Payment obj=new upiPayment();
       //obj.pay(40000);
       //obj.print();
      // Payment obj1 =new CardPayment();
       //obj1.pay(800);
       //obj1.print();
      // Shape obj=new Circle();
       //obj.area(34,0);
       //Shape obj1=new Rectangle();
       //obj1.area(23,12);
       Animal obj=new Dog();
       obj.Sound();
       Animal obj1=new Cat();
       obj1.Sound();
    }
}
