import java.util.*;
import java.lang.*;

class multithreading extends Thread{
    public void run(){
      boolean arr [] = new boolean[5];
      Arrays.fill(arr,Boolean.FALSE);
      System.out.println(arr[1]);
      for(int i=0;i<5;i++){
        if(arr[4]==true){
          System.out.println("Sorry buffer is full");
        }else if(arr[i]==false){
          System.out.println("Added to "+ i);
          arr[i] = true;
        }
      }

      for(int i=4;i>=0;i--){
        if(arr[0]==false){
          System.out.println("Empty");
        }else if(arr[i]==true){
          System.out.println("Removed from" + i);
          arr[i]=false;
        }
      }
    }

    public static void main(String [] args){
      Thread object = new Thread(new multithreading());
      Thread object1 = new Thread(new multithreading());

      object.start();
      object1.start();

    }
}
