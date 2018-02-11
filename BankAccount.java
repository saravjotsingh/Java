import java.util.*;

class Account{
  private
    String accountNumber;
    double amount;
    String accountHolder;

    Account(){

    }
    Account(String a,double amount,String aH){
      this.accountNumber = a;
      this.amount = amount;
      this.accountHolder = aH;
    }

    public String getAccountNumber(){
      return accountNumber;
    }

    public double getamount(){
      return amount;

    }

    public String getAccountHolder(){
      return accountHolder;
    }

}

class SavingsAccount extends Account{
  private
  double interestRate;

  SavingsAccount(){

  }
  SavingsAccount(String a,double amount,String aH,double i){
    super(a,amount,aH);
    this.interestRate = i;

  }

  public void showInfo(){
    System.out.println("Hi "+ getAccountHolder() + " Currently you are using Saving Account.Your Account Number is" + getAccountNumber() + ""+ getamount() + ""+ interestRate );
  }
}

class FixedAccount extends Account{
  int numberOfyears;

  FixedAccount(){

  }
  FixedAccount(String a,double amount,String aH,int n){
    super(a,amount,aH);
    this.numberOfyears = n;

  }


}

class checkingAccount extends Account{
  checkingAccount(){

  }
  checkingAccount(String a,double amount,String aH){
    super(a,amount,aH);
  }

  public void showInfo(){
    System.out.println("Hi "+getAccountHolder()+" Currently you are using Checking Account.Your Account Number is " +  getAccountNumber() +" And Having an Amount " + getamount());
  }

}


class BankAccount{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("1) Checking Account");
    System.out.println("2) Saving Account");
    System.out.println("3) Fixed Account");
    System.out.println("Enter Account Type");
    int n = scan.nextInt();
    if(n==1){
      System.out.println("Enter Account Number");
      String a = scan.next();
      System.out.println("Enter the Account Holder");
      String c = scan.next();
      System.out.println("Enter the Amount");
      double b = scan.nextDouble();

      checkingAccount c1 = new checkingAccount(a,b,c);
      c1.showInfo();
    }else if(n==2){
      System.out.println("Enter Account Number");
      String a = scan.next();
      System.out.println("Enter the Account Holder");
      String c = scan.next();
      System.out.println("Enter the Amount");
      double b = scan.nextDouble();
      System.out.println("Enter the Amount");
      double d = scan.nextDouble();

      SavingsAccount f = new SavingsAccount(a,b,c,d);
      f.showInfo();

    }else if(n==3){

    }else{
      System.out.println("Invalid Choice"); 
    }
  }
}
