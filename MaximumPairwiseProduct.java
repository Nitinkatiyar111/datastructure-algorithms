import java.util.Scanner;
import java.util.Arrays;

public class MaximumPairwiseProduct {

public static int pairwiseProduct(int b[], int length){
int r = 0;
  for (int i=0; i<length; i++){
   for( int j =i+1; j < length; j++){
    if (b[i] * b[j] > r){
      r = b[i] * b[j];
    }
   } 

  }
  return r;
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0; i< n;i++){
      a[i] = sc.nextInt();
    }
   int result = pairwiseProduct(a,n);
   System.out.println(result);
}

}