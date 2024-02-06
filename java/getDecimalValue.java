/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        
        int length=0;
        ListNode count=head;

        while(count!=null){
                count=count.next;
                length++;
        }


        int sum=1;

        for(int i = 0;i<length-1;i++){
            sum*=2;
        }


        count=head;
        int result=0;
        int current=0;

        while(count!=null){
            current=count.val;
            result+=current*sum;
            count=count.next;
            sum/=2;
        }

        return result;
   
    }
}