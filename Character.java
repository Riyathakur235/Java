public class Character {
    public static void main(String[] args) {
     //  String str =" Hello World  ";
       //System.out.println(str.charAt(7));
        //System.out.println(str.trim().charAt(7));
           int arr[]={2,4,55,6,7,74};
        for(int i=0;i<arr.length;i++){
            int digit=arr[i];
        
        for(int j=2;j<arr[i];j++){
            if(digit % j==0){
                System.out.println("prime");
            }else{
                System.out.println("Not prime");
            }
        }
        
    }
}
}
