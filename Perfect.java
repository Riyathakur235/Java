public class Perfect {
    static void Number(int a,int b,int sum){
        for(int i=a;i<b;i++){
            int num=i;
            if(num%i==0){
                 sum=sum+num;
                 System.out.println(sum);
            }
        }
        
    }
    public static void main(String[] args) {
        Number(1,100,0);
    }
    
}
