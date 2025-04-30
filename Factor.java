

public class Factor {
    public static void find(int n) {
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+" ");
                if(i!=n/i){
                   System.out.println(n/i+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Factors of "+":");
        find(12);
    }
}
