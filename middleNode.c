/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* middleNode(struct ListNode* head){
    
    struct ListNode* result=head;
    struct ListNode* iter=head;
    
    if(head->next==NULL)return result;

    while(iter!=NULL && iter->next!=NULL && iter->next->next!=NULL){
        result=result->next;
        iter=iter->next->next;
        
    }
    if(iter->next==NULL)return result;
    if(iter->next->next==NULL)return result->next;
    
    return result;

}