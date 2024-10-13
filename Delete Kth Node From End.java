public class Solution
{
    public static Node removeKthNode(Node head, int K)
    {
        // Write your code here.
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int nodeToDelete = count - K ;
        count = 0 ;
        temp = head;

        while(temp != null){
            count++;
            if(nodeToDelete == 0){
                head = head.next;
                return head;
            }

            
            if(count == nodeToDelete){
                temp.next = temp.next.next;
            }

            
            temp = temp.next;
        }
        return head;
    }
}
