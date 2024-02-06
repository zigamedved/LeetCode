/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* reverseList(struct ListNode* head){
    
    if(head==NULL)return NULL;
    
    struct ListNode* prejsnji=NULL;
    struct ListNode* curr=head;
    struct ListNode* iter;
    
    
    while(curr!=NULL){
        iter=curr->next;
        curr->next=prejsnji;
        prejsnji=curr;
        curr=iter;
    }
    
    
    return prejsnji;

}