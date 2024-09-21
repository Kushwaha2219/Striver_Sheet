public class Solution
{
    static int findLength(Node slow, Node fast){
        
    
        int cnt = 1;
        
        
        fast = fast.next;
        
        
        while(slow!=fast){
            
            
            cnt++;
            fast = fast.next;
        }
        
        
        return cnt;
    }

    public static int lengthOfLoop(Node head) {
        // Write your code here

        Node temp = head;

        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return findLength(slow, fast);
            }
        }
        return 0;
    }
}
