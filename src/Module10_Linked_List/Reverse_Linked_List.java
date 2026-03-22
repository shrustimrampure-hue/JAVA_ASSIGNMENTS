package Module10_Linked_List;

public class Reverse_Linked_List {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int v){val=v;}
    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
    public static void main(String[] args){
        ListNode a=new ListNode(1);
        a.next=new ListNode(2);
        a.next.next=new ListNode(3);
        ListNode res=reverse(a);
        while(res!=null){
            System.out.print(res.val+" ");
            res=res.next;
        }
    }
}