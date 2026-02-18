//package Arrays;
import java.util.Arrays;

public class sortarraybrute {
  public static void main(String[] args) {
      int[] arr={1,12,35,66,77,23,19};
      Arrays.sort(arr);
       //Arrays.sort(arr);
      for(int i=0;i<arr.length;i++){
        System.out.println("Sorted Array:" +arr[i]);
      }
  }
}
