public class cutTheRod{

  static int rodCutting(int arr[],int n){
    // System.out.println(n);
    // return n;

    if(n<=0){
      return 0;
    }

    int max = -9999999;
    for(int i=0;i<n;i++){
       max = Math.max(max,price[i] + rodCutting(arr,n-i-1));

    }
    return max;
  }


  public static void main(String []args){
    int length [] = {1,2,3,4,5,6,7,8};
    int profit [] = {1, 5, 8, 9, 10, 17, 17, 20};
    int max = rodCutting(profit,profit.length);
    System.out.println(max);
  }
}
