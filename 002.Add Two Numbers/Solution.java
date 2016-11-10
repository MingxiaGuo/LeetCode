
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode twosum = l3;
        int jinwei = 0;
        while(l1!=null||l2!=null){
            int x =(l1==null)?0:l1.val;
            int y =(l2==null)?0:l2.val;
            int sum = x+y+jinwei;
            l3.next=new ListNode(sum%10);
            jinwei=sum/10;
            l3=l3.next;
            if(l2!=null)l2=l2.next;
            if(l1!=null)l1=l1.next;
        }
        if(jinwei>0){
            l3.next=new ListNode(jinwei);
        }  
        return twosum.next;
    }
    public static void main(String[] args){
    	Solution s= new Solution();
    	ListNode l1 = new ListNode(2);
    	ListNode l12 = new ListNode(4);
    	ListNode l13 = new ListNode(3);
    	ListNode l2 = new ListNode(5);
    	ListNode l22 = new ListNode(6);
    	ListNode l23 = new ListNode(4);
    	l1.next=l12;
    	l12.next=l13;
    	l2.next=l22;
    	l22.next=l23;
    	ListNode sum = s.addTwoNumbers(l1, l2);
    	while(sum!=null){
    		System.out.print(sum.val+",");
    		sum=sum.next;
    	}
    	
    }
}