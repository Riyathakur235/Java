class Animal{
    void eat(){
        System.out.println("eateeeeee");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barkkkk");
    }
}
//class Puppy extends Dog{
  //  void cute(){
    //    System.out.println("cutiesssss");
    //}
//}
class Cat extends Animal {
   void sleep(){
    System.out.println("sleeppp");
   }      
}
public class Inheritence {
  public static void main(String[] args) {
    //Puppy obj=new Puppy();
     Dog obj=new Dog();
     obj.bark();
  }  
}Q
