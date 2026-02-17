package Arrays;
public  class Largest {

  public static void main(String[] args) {
    int[] arr = {10,20,30,40,50};
    System.out.println(fun(arr));
  }

    private static int fun(int[] arr) {
      int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
          if(max<arr[i]){
            max = arr[i];
          }
          
        }
        return max;
    }
}
