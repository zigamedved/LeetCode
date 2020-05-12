/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* removeNthFromEnd(struct ListNode* head, int n){
    struct ListNode* first=head;
    int count=0;
    
    while(first!=NULL){
        first=first->next;
        count++;
    }
    
    if(head==NULL)return head;
    if(count==1)return NULL;
    
    first=head;
    
    int delete = count-n;
    if(delete==0){
        head=head->next;
        return head;
    }
    delete--;
    
    while(delete>0){
        delete--;
        first=first->next;
    }
    first->next=first->next->next;
    
    return head;

}