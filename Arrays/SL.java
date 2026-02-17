package Arrays;

public class SL {
  public static void main(String[] args) {
      int[] arr={10,20,30,40,50};
      int largest=0;
      int slargest=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
          slargest=largest;
          largest=arr[i];

        }else if(arr[i]<largest && arr[i]>slargest){
          slargest=arr[i];
        }
      }
      System.out.println("Second Largest: "+slargest);
  }
}
