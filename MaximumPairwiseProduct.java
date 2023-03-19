import java.util.Scanner;
import java.util.Arrays;

public class MaximumPairwiseProduct {

public static int pairwiseProduct(int b[], int length){
int max_index1= -1;

for (int i =0 ;i < length; ++i){

if ((max_index1 == -1) || (b[i] > b[max_index1]))
max_index1 = i;
}

int max_index2 = -1;
for (int j =0 ;j < length; ++j){

if (b[j]!=b[max_index1] && ((max_index2 == -1) || (b[j] > b[max_index2])))
max_index2 = j;
}
return b[max_index1]*b[max_index2];
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
}