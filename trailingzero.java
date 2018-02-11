import java.util.*;

public class trailingzero{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    int count = 0;
    while(a!=0){
      if(a%10==0){
          count++;
      }else{
        break;
      }
      a=a/10;
    }
    System.out.println(count);

  }
}
