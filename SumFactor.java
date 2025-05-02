public class SumFactor {
    static void find(int n,int sum){
    for(int i=1;i<=n;i++){
        if(n%i==0){
            System.out.println(i+" ");
            sum+=i;
        }
    }
    System.out.println(sum);
}
public static void main(String[] args) {
    System.out.println("Factors of "+":");
    
    find(12, 0);
}
}
    

