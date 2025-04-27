public class Variable {
    //int a=12;
    //static int a=23;
    static void Maximum(){
        int[]arr={2,5,5,6};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            }
            System.out.println(max);
        }
    
    public static void main(String[] args) {
       // Variable obj=new Variable();
        Maximum();
}
}
