import java.util.ArrayList;

public class Solution {
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        ArrayList <Integer> pos = new ArrayList<>();
        ArrayList <Integer>  neg = new ArrayList<>();

        for(int num : a){
            if(num < 0) neg.add(num);
            else pos.add(num);
        }
        int i = 0 , j = 0, k = 0;
        while(i < pos.size() && j < neg.size()){
            a[k++] = pos.get(i++);
            a[k++] = neg.get(j++);
        }
        while(i < pos.size() ){
            a[k++] = pos.get(i++);
        }
        while(j < neg.size() ){
            a[k++] = neg.get(i++);
        }
        return a;
    }
}
