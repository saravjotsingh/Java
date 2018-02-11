import java.util.*;
public class maximum{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int [] arr = new int[n];
    int largest = -99999999;
    for(int i=0;i<n;i++){
        arr[i] = scan.nextInt();
        if(largest<arr[i]){
          largest = arr[i];
        }
    }
    System.out.println(largest);
  }
}
