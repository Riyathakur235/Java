import java.util.Scanner;

class Bank{
    int accountNumber=374484;
    String accountHolder="rahul";
    double balance;
    int withdraw;
    int deposit;
    Scanner in =new Scanner(System.in);
    int a= in.nextInt();
    void Account(){
        System.out.println(accountHolder);
          if(a<balance){
            balance-=withdraw;
            System.out.println(balance);
          }else{
            balance+=deposit;
            System.out.println(balance);
          }
    }
}
public class BankAccount {
    public static void main(String[] args) {
      System.out.println("Enter a number");
        Bank obj=new Bank();
        obj.Account();
    }
    
}
