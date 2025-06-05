
  class SimplewaitNotify{
    private  boolean isSignal=false;
    public synchronized void sendSignal(){
        isSignal=true;
        System.out.println("Producer: Sending Signal..");
        notify();
    }
    public synchronized void waitForSignal(){
        while (!isSignal){
            try {
                System.out.println("consumer: waiting for signal");
                wait();
            }catch (InterruptedException e){
            }
        }
        System.out.println("Consumer: Get the signal! Proceeding");
    }
}


public class Data {
    public static void main(String[] args) {
 SimplewaitNotify obj=new SimplewaitNotify();
 Thread consumer =new Thread(()->{
     obj.waitForSignal();
 });
 Thread producer =new Thread(()->{
     try {
         Thread.sleep(2000);
     }catch (InterruptedException e) {
     }
     obj.sendSignal();
 });
 consumer.start();
 producer.start();
    }
}
  
    

