import java.util.*;

public class primenumber{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int flag = 0;
    for(int i=2;i<a;i++){
      if(a%i==0){
        flag = 1;
        break;
      }
    }
    if(flag==0){
        System.out.println("prime number");
    }else{
      System.out.println("Not");
    }

  }
}
