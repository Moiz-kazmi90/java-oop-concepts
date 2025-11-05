public class methods{
    public static void main(String[] args){
      int[] a ={1,2,3,4,5};
      System.out.println(sumofarray(a));

      String res = upparray(" moiz ");
      System.out.println(res);



}
    public static int sumofarray(int[] arr){
        int sum =0;
      for(int i=0;i<=arr.length-1;i++){
          sum += arr[i];
      }
      return sum;
    }

    public static String upparray(String str){
        return str.trim().toUpperCase();
    }

   
    }
