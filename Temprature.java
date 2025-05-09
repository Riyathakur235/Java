class Value{
    private float celsius;
    float fehrenheit;
    public void SetTemprature(float celsius){
      this.celsius=celsius;
    }
    public float getTemprature(){
        return(celsius*9/5)+32;
    }
    
}
public class Temprature {
    public static void main(String[] args) {
     Value obj=new Value();
     obj.SetTemprature(23);
     System.out.println(obj.getTemprature()); 
    }
}
