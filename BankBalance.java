import java.util.*;

class Account1 {
  private
  int accountNumber=0;
  double  balance=0.0;

Account1(){

}

Account1(int a,double b)
  {
    this.accountNumber = a;
    this.balance = b;

  }

Account1(int a){
    this.accountNumber = a;
  }

  public int getAccountNumber(){
    return accountNumber;
  }
  public double balance(){
    return balance;

  }
  public void setBalance(double b){
    this.balance = b;
  }


  public void credit(double amt){

    balance = amt + balance;
    System.out.println(amt + " is added and now your balance is " + balance);
  }

  public void debit(double amt){
    if(balance >= amt){
      balance = balance - amt;
      System.out.println(amt  + " is debited from your account");
    }else{
      System.out.println("Amount withdrawn exceeds the current balance");
      }
  }

  public String getString(){

    return ("Account No " + accountNumber + " Balance is " + String.format("%.2f",balance));
  }

}


public class BankBalance{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the account Number");
    int a = scan.nextInt();
    System.out.println("Enter the balance");
    double b = scan.nextDouble();
    Account1 a1 = new Account1(a,b);

    System.out.println("Enter the amount to credit");
    double amt = scan.nextDouble();
    a1.credit(amt);
    a1.debit(amt);
    System.out.println(a1.getString());
  }
}
