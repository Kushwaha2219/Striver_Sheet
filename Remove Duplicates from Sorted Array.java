mport java.util.ArrayList;

public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        int count = 0;
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n-1 ; i++){
            if(arr[i]!=arr[i+1]){
                list.add(arr[i]);
            }
        }
        list.add(arr[n-1]);
        return list.size();
    }
}
