import java.util.*;

public class palindrome{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int sum = 0;
    int b =0,original = a;
    while(a>0){
      b = a%10;
      sum = sum*10+b;
      a = a/10;

    }
    if(original==sum){
        System.out.println("prime");
    }else{
      System.out.println("not prime");
    }

  }
}
