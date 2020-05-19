/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* removeNthFromEnd(struct ListNode* head, int n){
    struct ListNode* fast=head;
    struct ListNode* slow=head;
    
    if(n==0)return head;
    
    for(int i = 0;i<n; i++){
        fast=fast->next;
    }
    //ko moramo odstraniti prvi element...
    if(fast==NULL){
        head=head->next;
        return head;
    }
    
    while(fast->next!=NULL){
        fast=fast->next;
        slow=slow->next;
    }
    
    slow->next=slow->next->next;
    
    return head;
}