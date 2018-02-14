import java.util.*;

class ExceptionCaused extends Exception{

  ExceptionCaused(String message){
    super(message);
  }
}


public class MyException{
  public static void main(String[]args){
    try{
      int a = 0;
      //int c = 24/a;
      throw new ExceptionCaused("hello");

    }catch(ExceptionCaused e){
      System.out.println(e);
    }
  }
}
