/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
    if(headA==NULL||headB==NULL)return NULL;
    
    struct ListNode* a=headA;
    struct ListNode* b=headB;
    
    while(a){
        while(b){
            if(a==b)return a;
            b=b->next;
        }
        b=headB;
        a=a->next;   
    }
    
    return NULL;
}