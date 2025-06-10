import java.util.ArrayList;
import java.util.Scanner;

class Transaction{
    String type;
    double amount;
    public Transaction(String type,double amount){
        this.type=type;
        this.amount=amount;
    }
}
class Account {
    private String name;
    private int accountNumber;
    private double balance;

    public Account(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    ArrayList<Transaction> transactions = new ArrayList<>();

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add( new Transaction("Deposit",amount));
            System.out.println("Deposit sucessfully");
        }
    }
    public void withdraw(double amount){
        if (amount >0 && amount<=balance){
            balance-=amount;
            transactions.add( new Transaction("withdraw",amount));
            System.out.println("withdraw sucessfully");
        }else {
            System.out.println("Insufficient amount ");
        }
    }
    public  void checkBalance(){
        System.out.println("Current Balance. Rs:"+balance);
    }
    public void viewTransaction(){
        if (transactions.isEmpty()){
            System.out.println("Transaction not yet");
        }else {
            for (Transaction t:transactions){
                System.out.println(t);
            }
        }
    }
   public String getname(){
        return name;
   }
   public int getAccountNumber(){
        return accountNumber;
   }
}
public class BankApp {
    static Scanner sc=new Scanner(System.in);
    static Account account;
    public static void main(String[] args) {
     System.out.println("Enter account holder name");
     String name=sc.nextLine();
     account= new Account("Riya",453677,0);
     System.out.println("Account created sucessfully");
     int choice;
     do {
         System.out.println("\n1.Deposit \n2.withdraw\n3.checkBalance\n4.viewTransaction\n5.Exit");
         System.out.println("Enter your choice");
         choice=sc.nextInt();
         switch (choice){
             case 1:
                 System.out.println("Enter ammount to deposit");
                   double dep=sc.nextDouble();
                    account.deposit(dep);
             break;
             case 2:
                 System.out.println("Enter ammount to withdraw");
                 double with=sc.nextDouble();
                 account.withdraw(with);
                 break;
             case 3:
                 account.checkBalance();
                 break;
             case 4:
                 account.viewTransaction();
                 break;
             case 5:
                 System.out.println("Thank you for using this app");
                 break;
             default:
                 System.out.println("Invaild choice");
         }
     }while (choice!=5);
    }
}

