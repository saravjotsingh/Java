import java.util.*;



public class binarySearch{


       int search(int []arr,int s,int e){
        if(e>=s){
          int mid = s + (e - s)/2;
          System.out.println("MID" + arr[mid]);
          System.out.println("MID-1" + arr[mid-1]);
          System.out.println("MID+1" + arr[mid+1]);
      //     if(arr[mid]==x){/
      //       return arr[mid];
      //     }
      //     if(arr[mid]>x){
      //       return search(arr,s,mid-1,x);
      //     }
      //
      //     return search(arr,mid+1,e,x);
      //   }
      //   return -1;

        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
          System.out.println("yes");
            return arr[mid];
        }
        //search(arr,s,mid);
      search(arr,mid,e);
      }
      return -1;
    }



  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int [] arr = new int[a];
    binarySearch bS = new binarySearch();

    for(int i=0; i<a;i++){
      arr[i] = scan.nextInt();
    }

      //int g = scan.nextInt();

    int ab = bS.search(arr,0,a);
    System.out.println("AA" + ab);


  }

}
