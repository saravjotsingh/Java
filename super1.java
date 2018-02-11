import java.util.*;

class Customer{
private
  String name;
  String address;
  int age;
  int mobileNo;

  Customer(){

  }
  Customer(String n,String a,int age,int m){
    this.name = n;
    this.address = a;
    this.age = age;
    this.mobileNo = m;
  }

  public void displayCustomer(){
    System.out.println(name + " " + address + " " + age +" "+ mobileNo);
  }
}

class SeniorCitizen extends Customer{

  SeniorCitizen(){

  }

  SeniorCitizen(String n,String a,int age,int m){
    super(n,a,age,m);
  }

    public double getBillAmount(double amount){
      return amount*0.12;
    }
}

class PrivilegeCustomer extends Customer{

  PrivilegeCustomer(){

  }

  PrivilegeCustomer(String n,String a,int age,int m){
    super(n,a,age,m);
  }
  public double getBillAmount(double amount){
    return amount*0.30;
  }
}

public class super1{
  public static void main(String [] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("1)Privilege Customer");
      System.out.println("2)SeniorCitizen Customer");
      System.out.println("Enter the Customer type");
      int a = scan.nextInt();
      if(a==1){
        System.out.println("Enter the Name");
        String name = scan.next();
        System.out.println("Age");

        int age = scan.nextInt();
        System.out.println("Enter address");
        String address = scan.next();
        System.out.println("Enter Mobile");
        int mobile = scan.nextInt();
        System.out.println("Enter Amount");
        double amount = scan.nextDouble();
        PrivilegeCustomer p = new PrivilegeCustomer(name,address,age,mobile);
        p.displayCustomer();
        System.out.println("So the amount is" + amount + " and discount value is " + p.getBillAmount(amount));


      }else if(a==2){
        System.out.println("Enter the Name");
        String name = scan.next();
        System.out.println("Age");

        int age = scan.nextInt();
        System.out.println("Enter address");
        String address = scan.next();
        System.out.println("Enter Mobile");
        int mobile = scan.nextInt();
        System.out.println("Enter Amount");
        double amount = scan.nextDouble();
        SeniorCitizen p = new SeniorCitizen(name,address,age,mobile);
        p.displayCustomer();
        System.out.println("So the amount is" + amount + " and discount value is " + p.getBillAmount(amount));


      }else{
        System.out.println("Invalid Choice");
      }
  }
}
