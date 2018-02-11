import java.util.*;

public class Main{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the sale in first month");
    int a = scan.nextInt();
    System.out.println("Enter the sale in second month");
    int b = scan.nextInt();
    System.out.println("Enter the sale in third month");
    int c = scan.nextInt();
    System.out.println("Enter the sale in fourth month");
    int d = scan.nextInt();
    System.out.println("Enter the sale in fifth month");
    int e = scan.nextInt();
    System.out.println("Enter the average sales in 6 month");
    float average = scan.nextFloat();

    float result = (average*6)-(a+b+c+d+e);
    System.out.printf("The sale in the sixth month is Rs.%.2f",result);
  }
}
