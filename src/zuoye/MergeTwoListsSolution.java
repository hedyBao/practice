package zuoye;

public class MergeTwoListsSolution {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
    public ListNode MergeTwoLists (ListNode l1,ListNode l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }

        ListNode dummy= new ListNode(0);
        ListNode ln=l1;
        ListNode rn=l2;
        if(rn.val<ln.val){
            ListNode tn= ln;
            ln=rn;
            rn=tn;
        }
        dummy.next=ln;
        while (null!=ln && null!=rn){
            while (null!=ln.next && ln.next.val<=rn.val){
                ln=ln.next;
            }
            ListNode tn= ln.next;
            ln.next=rn;
            ln=rn;
            rn=tn;
        }

        return dummy.next;

    }

}
