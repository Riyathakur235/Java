// interface Client{
//     void print();
//     void show();
// }
// class Dev implements Client{
//     public void print(){
//         System.out.println("hii");
//     }
//     public void show(){
//         System.out.println("helloooo");
//     }
// }


// public class Implement {
// public static void main(String[] args) {
//     Dev obj=new Dev();
//     obj.show();
// }
    
// }
// interface Client1 {
//     void show(); 
// }
// interface Client2{
//     void show();
//     void print();
// }
// public class Implement implements Client1,Client2{
//  public void show(){
//  System.out.println("hiii");
//  }
//   public void print(){
//   System.out.println("hello");
//   }
//    public static void main(String[] args) {
//      Implement obj=new Implement();
   //  obj.show();
     //obj.print();
   //} 
//}
interface walkable{
    void walk();
    void run();
}  
interface runable{
    void walk();
    void run(); 
}
public class Implement  implements walkable,runable {
    public void walk(){
        System.out.println("walkkk");
    }
    public void run(){
        System.out.println("runnn");
    }
    public static void main(String[] args) {
        Implement obj=new Implement();
        obj.walk();
        obj.run();
    }
}