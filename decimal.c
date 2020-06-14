/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


int getDecimalValue(struct ListNode* head){
    int num=0;
    struct ListNode* curr=head;
    
    while(head!=NULL){
        num++;
        head=head->next;
    }
    head=curr;
    int tab[num];
    num=0;
    
    while(head!=NULL){
        tab[num]=head->val;
        num++;
        head=head->next;
    }
    
    int base=1;
    int sum=0;
    
    for(int i = num-1;i>=0; i--){
        sum=sum+tab[i]*base;
        base=base*2;
    }
    
    return sum;

}