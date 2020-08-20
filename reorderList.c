/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


void reorderList(struct ListNode* head){
    if(!head)return;
    
    struct ListNode* first=head;
    int count=0;
    while(first){
        count++;
        first=first->next;
    }
    first=head;
    
    struct ListNode** tab = malloc(count*sizeof(struct ListNode*));
    
    for(int i = 0; i<count; i++){
        tab[i]=first;
        first=first->next;
    }
    
    int zero=0;
    int prev=count-1;
    struct ListNode* res;
    res=tab[zero];
    struct ListNode* last=tab[count-1];
    
    for(int i = 0; i<count/2; i++){
        res->next=last;
        zero++;
        res=tab[zero];
        last->next=res;
        prev--;
        last=tab[prev];
    }
    res->next=NULL;
    return;
}