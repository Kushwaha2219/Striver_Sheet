public class Solution {
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        int k = 0;
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            if(a[i]!=0){
                arr[k] = a[i];
                k++; 
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(a[i]==0){
                arr[k] = a[i];
                k++; 
            }
        }
        return arr;
    }
}
