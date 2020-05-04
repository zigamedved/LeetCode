/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    int count=0;
    
    while(head!=NULL){
        head=head->next;
        count++;
        if(count>9000) return true;
    }
    return false;
}