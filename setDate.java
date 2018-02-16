import java.util.*;

class Date{
  private
  int day;
  int month;
  int year;

  Date(){

  }
  Date(int y,int m,int d){
    this.day = d;
    this.month = m;;
    this.year = y;

  }

  int getYear(){
    return this.year;
  }
  int getMonth(){
    return this.month;
  }
  int getDay(){
    return this.day;
  }

  void setYear(int y){
    this.year = y;
  }
  void setMonth(int m){
      this.month = m;
  }
  void setDay(int d){
    this.day = d;
  }

  void setDate(int y,int m,int d)
{
  this.day = d;
  this.month = m;;
  this.year = y;
}

  String getString(){

    return (String.format("%02d",day) +"/" + String.format("%02d",month) + "/" + String.format("%04d",year)).toString();
  }


}

public class setDate{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Date");
    int d = scan.nextInt();
    System.out.println("Enter the month");
    int m = scan.nextInt();
    System.out.println("Enter the year");
    int y = scan.nextInt();

    Date d1 = new Date();
    d1.setDate(y,m,d);
    System.out.println(d1.getString());
  }
}
