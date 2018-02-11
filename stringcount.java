import java.util.*;

public class stringcount{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    StringBuilder str = new StringBuilder();
    int j = 0;
    int count = 1;
    int z = 0;
     char [] result = a.toCharArray();
     //result[result.length] = null;
     //System.out.println(result.length);
     for(int i=0;i<result.length-1;i++){
       //System.out.println(result[i] + " " + result[i+1]);
        if(result[i]==result[i+1]){
          count++;
        }else{
            //System.out.println(result[i]+ " " + count);
            str.append(result[i]);
            str.append(count);
            count=1;
}




     }
     //System.out.print(a.charAt(a.length()-1));
     str.append(a.charAt(a.length()-1));
     str.append(count);
     System.out.println(str);

  }
}
