//class Atm{
  //  private int a;
    //public void setRupees(int a){
       // this.a=a;
    //}
 //public int getRupees(){
   // return a;
 //}
//}
class Student{
    private String name;
    int marks;
    public  void setDetail(String name){
        this.name=name;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public String getDetail(){
        return name;
    }
    public int gettMarks(){
        return marks;
    }
}
public class Rupees {
    public static void main(String[] args) {        //Encapsulation Problem
      //  Atm obj=new Atm();
        //obj.setRupees(501);
        //System.out.println(obj.getRupees());
        Student obj=new Student();
        obj.setDetail("Raghv");
        System.out.println(obj.getDetail());
        obj.setMarks(356);
        System.out.println(obj.gettMarks());
}
}
