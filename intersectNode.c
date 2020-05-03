/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
    struct ListNode *result=NULL;

    struct ListNode *first=headA;
    struct ListNode *second=headB;
    
    while(first!=NULL){
        while(second!=NULL){
            if(first==second)return first;
            second=second->next;
        }
        first=first->next;
        second=headB;
    }
     
    return result;
        
        
}