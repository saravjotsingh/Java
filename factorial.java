import java.util.*;

public class factorial{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = 0;
    while(5<a){
      b=b+a/5;
      a = a/5;


    }
    System.out.println(b);
  }
}
