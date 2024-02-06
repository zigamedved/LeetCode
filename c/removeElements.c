/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* removeElements(struct ListNode* head, int val){
    if(head==NULL)return NULL;
    
    while(head!=NULL && head->val==val){
        head=head->next;
    }
    if(!head)return NULL;
    
    struct ListNode* result=head;
    
    while(result!=NULL && result->next!=NULL){
        if(result->next->val==val){
            result->next=result->next->next;
        }else{
            result=result->next;
        }
    }
    
    
    return head;

}