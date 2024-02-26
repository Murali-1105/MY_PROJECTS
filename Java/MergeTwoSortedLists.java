class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }
}


 public class MergeTwoSortedLists { 
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){ 
         
        if(l1==null) return l2; 
        if(l2==null) return l1; 
         
        ListNode curr=null; 
        ListNode result=null; 
         
        while(l1 !=null && l2 !=null) 
        { 
            if(l1.val <= l1.val){ 
                if(curr==null){ 
                    curr=l1; 
                    result=curr; 
                }else{ 
                    curr.next=l1; 
                    curr=curr.next;
                } 
                l1=l1.next;
            }else{ 
                if(curr==null){ 
                    curr=l2; 
                    result=curr; 
                }else{ 
                    curr.next=l2; 
                    curr=curr.next;
                } 
                l2=l2.next;
            }
        } 
         
        while(l1 !=null){ 
            curr.next =l1; 
            curr=curr.next; 
            l1=l1.next; 
        } 
         
        while(l2 !=null){ 
            curr.next =l2; 
            curr=curr.next; 
            l2=l2.next; 
        } 
         
    return result; 
  }  
}