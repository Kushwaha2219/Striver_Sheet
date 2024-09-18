public class Solution
{
    public static Node deleteLastNode(Node head) {
        // Write your code here

        Node temp = head;
        if(head.next == null){
            return null;
        }
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}
