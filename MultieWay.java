import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int rolno;
    String name;
    int age;
    public Student(int rolno,String name,int age){
        this.rolno=rolno;
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return age+" "+name+" "+rolno;
    }
}
class sortByName implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}
class sortByrolno implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.rolno-s2.rolno;
    }
}
public class MultieWay {
    public static void main(String[] args) {
        ArrayList<Student>list=new ArrayList<>();
        list.add(new Student(53,"Rohit",12));
        list.add(new Student(32,"Jain",14));
        list.add(new Student(23,"Mohit",11));
        Collections.sort(list,new sortByName());
        for (Student s:list){
            System.out.println(s);
        }
        Collections.sort(list,new sortByrolno());
        for (Student s:list){
            System.out.println(s);
        }
    }
}
