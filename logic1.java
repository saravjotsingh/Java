import java.util.*;

public class logic1{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    char a = scan.next().charAt(0);
    char b = scan.next().charAt(0);
    int start = (int)a;
    int c = (int)b;
    int count = 0;
    //#65 and #90
    if(c>90){
      System.out.println("Invalid Input");
    }else{
      for(int i=start; i<=c;i++){
        for(int j=start;j<=c-count;j++){
          char z = (char)j;
          System.out.print(z);
        }
        System.out.println("");
        count++;

      }
    }

    //System.out.println(c);
  }
}
