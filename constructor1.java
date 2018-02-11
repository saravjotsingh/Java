import java.util.*;

class Customer{
  String customerName;
  String customerEmail;
  String customerType;
  String customerAddress;

  Customer(){
      this.customerName = "";
      this.customerEmail = "";
      this.customerType = "";
      this.customerAddress = "";
  }
  Customer(String cName,String cEmail,String cType,String cAddress){
    this.customerName = cName;
    this.customerEmail = cEmail;
    this.customerType = cType;
    this.customerAddress = cAddress;
  }

  public void displayDetails(){
    System.out.println(customerName + "  "  + customerType + "  " + customerEmail + "  " + customerAddress);
  }
}

public class constructor1{
  public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      String cname = scan.next();
      String cEmail = scan.next();
      String cType = scan.next();
      String cAddress = scan.next();
        Customer c1 = new Customer(cname,cEmail,cType,cAddress);
      c1.displayDetails();
  }
}
