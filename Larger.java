public class Larger {
    public static void main(String[] args) {
        int a=10;
        int b=28;
        int c=39;
        if(a>b&&a>c){
            System.out.println("a is largest number");
        }
        else if(b>c){
            System.err.println("b is largest number");
        }else
        System.err.println("c is largest number");
    }
    
}
