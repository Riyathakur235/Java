import java.util.ArrayList;
import java.util.Collections;

//import java.util.Collections;

class Students implements Comparable<Students> {
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public  String toString(){
    return age +" "+ name;
    }
//[12,11]->[11,12]

    public int compareTo(Students s){
        return this.age-s.age;
    }
}

public class List {
    public static void main(String[] args) {
        ArrayList<Students> list = new ArrayList<>();
//        list.add(1);
//        list.add(0);
//        list.add(4);
//        Collections.sort(list);
        list.add(new Students(12, "Rahul"));
        list.add(new Students(11, "Rohit"));
        list.add(new Students(6, "mohit"));
        Collections.sort(list);
        for (Students s : list) {
            System.out.println(list);
        }
    }
}
