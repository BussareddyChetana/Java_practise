//package Arrays;

public class optimallargest {
  public static void main(String[] args) {
      int[] arr={1,23,45,78,99};
      int largest=arr[0];
      for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
          largest=arr[i];
        }
      }
      System.out.println("Largest Array using Optimal:" +largest);
  }
}
