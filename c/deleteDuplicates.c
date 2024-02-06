/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* deleteDuplicates(struct ListNode* head){
    if(!head)return NULL;
    struct ListNode* curr = head;
    struct ListNode* prev=head;
    curr=curr->next;
 
    
    if(curr==NULL){
        prev->next=NULL;
        return head;
    }
    
    while(true){
        while(prev->val==curr->val){
                if(curr->next==NULL){
                if(curr->val==prev->val){
                    prev->next=NULL;
                    return head;
                }else{
                    prev->next=curr;
                    return head;
                }
            }
            
            curr=curr->next;
        }
        
        if(curr==NULL){
            prev->next=NULL;
            return head;
        }
        
        if(curr->next!=NULL){
            prev->next=curr;
            prev=prev->next;
            curr=curr->next;
          
        }
        if(curr->next==NULL){
            if(curr->val==prev->val){
                prev->next=NULL;
                return head;
            }else{
                prev->next=curr;
                return head;
            }
        }
        
    }
        
   
    return head;
}