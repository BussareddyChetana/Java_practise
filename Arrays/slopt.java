package Arrays;

public class slopt {
  public static void main(String[] args) {
      int[] a={10,9,11,13,7,24,56,12};
      int largest=a[0];
      int slargest=-1;
      for(int i=1;i<a.length;i++){
        System.out.println("check : "+a[i]+" > "+largest +" "+ (a[i]>largest));
        if(a[i]>largest){
          System.out.println("second largest:"+(slargest=largest));
          System.out.println("largest:"+(largest=a[i]));
          

        }
        // else if(a[i]<largest && a[i]>slargest){
        //   slargest=a[i];
        // }
      }
  }
}
