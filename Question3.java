import java.util.Scanner;
class Account{
    Long balance;
    String bname;//Bank Account name;
    public Account(){

    }
    public Account(Long balance,String bname){
        this.balance=balance;
        this.bname=bname;
    }
    public void deposit(int amount){
        this.balance=this.balance+amount;
    }
    public void withdraw(int amount){
        if(amount>balance){
            System.out.println("Withdrawal amount is greater than balance amount");
        }else{
            this.balance=this.balance-amount;
        }
    }
    public void display(){
        System.out.println("The amount balance in the Bank Account is:"+balance);
    }
}

public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the initial balance in the account:");
        Long initialBalance=sc.nextLong();
        sc.nextLine();//consume the new line character
        //System.out.println();
        System.out.println("Enter the bank name:");
        String bname=sc.nextLine();

        Account account=new Account(initialBalance,bname);//assuming initial balance as 200
        account.deposit(800);
        account.display();//prints 1000=800+200
        account.withdraw(300);
        account.display();//prints 700=1000-300
        
    }
    
}
