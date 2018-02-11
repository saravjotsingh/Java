import java.util.*;
import java.lang.*;

public class compliment{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
     StringBuilder str = new StringBuilder();
     StringBuilder str1 = new StringBuilder();
    int a = scan.nextInt();
    while(a>0){
      str.append(a%2);
      //System.out.println(a%2);
      a = a/2;
    }
    str.reverse();
    System.out.println("Binary Number " + str);

    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='0'){
          str1.append(1);
        }else{
          str1.append(0);
        }

        //System.out.println(str.charAt());
    }
    System.out.println("1's Compliment " + str1);

  }
}
