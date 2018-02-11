import java.util.*;

public class pattern{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    for(int i=0;i<a;i++){
      if(i%2==0){
        for(int j=0;j<a-i; j++){
          System.out.print(j+1);
        }
        System.out.println();
      }else{
        for(int j=a-i;j>0; j--){
          System.out.print(j);
      }
      System.out.println();
    }
  }
}
}
