public class Solution {
    public static void nTriangle(int n) {
        // Write your code here
        for(int i = 0 ;i < n ; i++){
            int m = 1;
            for(int j = 0 ; j <= i ; j++){
                System.out.print(m + " ");
                m++;
            }
        System.out.println();
        }
    }
}
/*

Input: ‘N’ = 3

Output: 
1
1 2 
1 2 3

  */
