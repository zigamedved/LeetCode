/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


bool isPalindrome(struct ListNode* head){
   if(head==NULL)return true;
    
    int len=0;
    
    
    struct ListNode* first=head;
    while(first!=NULL){
        len++;
        first=first->next;
    }
    if(len==1)return true;
    
    char arr[len+1];
    
    for(int i = 0;i<len; i++){
        arr[i]=head->val;
        head=head->next;
    }
    
    for(int i = 0;i<len; i++){
        if(arr[i]==arr[len-1-i]){
            continue;
        }else return false;
    }
    
    return true;
}