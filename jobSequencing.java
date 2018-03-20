import java.util.*;
public class jobSequencing{

  //static int m[] = new int[11];
  static int x = 0;
  static int y = 0;
  static int z = 0;

    static int minTo1(int n){

    //System.out.println(x +" "+ y + " " +  z);

    if(n==1){
      System.out.println("Enter1");
      return 1;

    }

    if(n%3==0){
      System.out.println("enter3" + x);
      x = 1 + minTo1(n/3);

    }
    if(n%2==0){
      System.out.println("enter2" + y);
      y =   1+minTo1(n/2);

    }
    System.out.println("bahar" + z);
    z = 1 + minTo1(n-1);
    System.out.println(x +" "+ y + " " +  z);
    return 1 + Math.min(x,Math.min(y,z));
  }


  public static void main(String[] args){

    int a = minTo1(17);
    System.out.println(a);

   }
}
