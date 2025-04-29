//class Student{
  //  String firstname="rahul";
   // String lastname="jain";
    //void fullName(){
      //  System.out.println(firstname+ "  "+lastname);
    //}
//}
class Area{
    int area;
    void Rectangle(int l,int w){
        area=l*w;
        System.out.println(area);
    }
}

public class Class {
    public static void main(String[] args) {
        Area obj= new Area();
        obj.Rectangle(3,5);
    }
    
}
