package Arrays;

public class Secondlarbetter {
  public static void main(String[] args) {
      int[] arr={1,13,1673,5686,2457};
      int largest=0;
      int slargest=-1;
      for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
          largest=arr[i];
        }
      }
      for(int i=0;i<arr.length;i++){
        if(arr[i]>slargest && arr[i]!=largest){
          slargest=arr[i];
        }
      }
      System.out.println("Second largest:" + slargest);


  }
}
