import java.util.*;

public class knapsack{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of weight");
      int a = scan.nextInt();
      int [] weight = new int[a];
      int[] price = new int[a];

      for(int i=0;i<a;i++){
        weight[i] = scan.nextInt();
        price[i] = scan.nextInt();
      }

      Integer [] fraction = new Integer[a];
      for(int i=0;i<a;i++){
        fraction[i] = price[i]/weight[i];
      }

      //Arrays.sort(fraction,Collections.reverseOrder());
      for(int j=0;j<a;j++){
      for(int i=0;i<a-1;i++){
        //System.out.println(fraction[i]);
        if(fraction[i]<fraction[i+1]){
          int temp  = fraction[i];
          fraction[i] = fraction[i+1];
          fraction[i+1] = temp;

          int temp1 = weight[i];
          weight[i] = weight[i+1];
          weight[i+1] = temp1;

          int temp2 = price[i];
          price[i] = price[i+1];
          price[i+1] = temp2;
        }
      }
}
        System.out.println("Enter the max weight");
        int weighty = scan.nextInt();
////
        int sum=0;
        int maxweight=0;
      for(int i=0;i<a;i++){

          maxweight += weight[i];
          if(maxweight<=weighty){
              sum += price[i];
          }else{
            int excess = weight[i]-(maxweight-weighty);
            sum += fraction[i]*excess;
            break;

          }

          }
      System.out.println(sum);
  }
}
