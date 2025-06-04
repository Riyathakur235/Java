//class MyRunnable implements Runnable{
//    public void run(){
//        System.out.println("Thread using Runnable interface");
//    }
//}
//public class Demo2 {
//    public static void main(String[] args) {
//        MyRunnable obj=new MyRunnable();
//        Thread t1= new Thread(obj);
//        t1.start();
//        System.out.println("Main thread is running");
//    }
//}

class MyRunnable implements Runnable{
    public void run(){
       System.out.println("Thread using Runnable interface");
    }
}
public class Demo2 {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}






