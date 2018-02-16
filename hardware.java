import java.util.*;

class Invoice{
String partNumber;
String description;
int quantity;
double price;

  Invoice(){

  }
  Invoice(String p,String d,int q,double price)
{
  this.partNumber = p;
  this.description =d;
  this.quantity = q;
  this.price = price;
}

  void setPartNumber(String p){
    this.partNumber = p;

  }
  String getPartNumber(){
    return this.partNumber;

  }
  void setDescription(String d){
    this.description = d;
  }
  String getDescription(){
    return this.description;
  }
  void setQuantity(int q){
    this.quantity = q;
  }
  int getQuantity(){
    return quantity;
  }
  void setPrice(double p){
    this.price = p;
  }
  double getPrice(){
    return this.price;
  }
  double getInvoiceAmount(){
    double amount ;
    if(quantity < 0){
      return 0;
    }else if(price <0){
      return 0.0;
    }else{
      amount = price * quantity;
      return amount;
      }
  }
}

  public class hardware{
    public static void main(String[]args){
      Scanner scan = new Scanner(System.in);
    Invoice[] c =  new Invoice[100];
     System.out.println("Enter the number of hardwares");
     int a = scan.nextInt(); 

       for(int i=0;i<a;i++){
         System.out.println("Enter the product number,desc,quantity,price " + (i+1));
         String part = scan.next();
         String d = scan.next();
         int q = scan.nextInt();
         double price  = scan.nextDouble();

          c[i] = new Invoice(part,d,q,price);

       }

       for(int i=0;i<a;i++){
         double amount=0.0;
         amount = c[i].quantity * c[i].price;
         System.out.println("Part Number" + c[i].partNumber + " " +c[i].description + " " + c[i].quantity + " " + c[i].price + " " + c[i].getInvoiceAmount());
       }
     }
    }
