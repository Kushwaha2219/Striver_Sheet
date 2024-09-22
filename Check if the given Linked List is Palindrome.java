public class Solution {
    public static boolean isPalindrome(Node head) {
        // write your code here
        ArrayList <Integer> list = new ArrayList<>(); 
        while(head!=null){
            list.add(head.data);
            head = head.next;
        }
        ArrayList <Integer> list1 = new ArrayList<>();
        for(int i = list.size()-1 ; i>= 0 ; i--){
            list1.add(list.get(i));
        }
        for(int i = 0 ; i < list.size() ; i++){
            if(!list.get(i).equals(list1.get(i))){
                return false;
            }
        }
        return true;
    }
}
