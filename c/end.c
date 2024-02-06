/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* removeNthFromEnd(struct ListNode* head, int n){
  
    struct ListNode* slow=head;
    struct ListNode* fast=head;
    
    while(n>0){
        fast=fast->next;
        n--;
    }
    if(fast==NULL){
        return head->next;
    }
    
    
    while(fast->next!=NULL){
        fast=fast->next;
        slow=slow->next;
    }
    
    slow->next=slow->next->next;
    
    
    
    
    
    return head;
}