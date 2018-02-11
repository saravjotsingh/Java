import java.util.*;

public class logic2{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int a = scan.nextInt();

    int [] array = new int[a];
    for(int i=0;i<a;i++){
      int b = scan.nextInt();
      array[i] = b;
      //System.out.println(array[i]);
    }
    if(a==1){
      System.out.println(array[0]);
    }else{

    for(int i=0;i<a;i++){
      if(i==0){
          if(array[i]>array[i+1]){
            System.out.println(array[i]);
            break;
          }

      }if(i==a-1){
        if(array[i]>array[i-1]){
          System.out.println("No is " + array[i]);
          break;
        }
      }
        if(i>0 && i<a){
          if(array[i]>array[i-1] && array[i]>array[i+1]){
            System.out.println("No is " + array[i]);
            break;
        }


        }
      }
    }
    }

  }
