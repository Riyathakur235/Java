//class Parent{
//    void eat(){
  //      System.out.println("maggie");
    //}
//}  
//class Child extends Parent{
  //void eat(){
    //System.out.println("pastaa");
 // }
//}
class Person{
    void Name(){
   System.out.println("raj");
} 
}
 class Child extends Person{
    void Name(){
        System.out.println("gajal");
    }
    void Age(int a){
        System.out.println(a);
    }
 }

public class MethodoverWrite {
   public static void main(String[] args) {
   // Parent obj=new Child();
//    obj.eat();
Person obj=new Child();
  obj.Name();
   } 
  }
