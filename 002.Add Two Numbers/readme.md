# 002.Add Two Numbers
##question
You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. 

Add the two numbers and return it as a linked list.
###eaxmple
	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	Output: 7 -> 0 -> 8
##solution

| Test case	         | Explanation |
|:-------------------|-----------|
|l1=[0,1] l2=[0,1,2]|	When one list is longer than the other.|
|l1=[] l2=[0,1]     |	When one list is null, which means an empty list.|
|l1=[9,9] l2=[1]    |The sum could have an extra carry of one at the end, which is easy to forget.|

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

时间复杂度：O(max(m,n))
空间复杂度：O(max(m,n))

###solition 2
What if the the digits in the linked list are stored in non-reversed order? 

For example:
(3→4→2)+(4→6→5)=8→0→7

解：使用头插法。

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode twosum = l3;
        ListNode temp=null;
        int jinwei = 0;
        while(l1!=null||l2!=null){
            int x =(l1==null)?0:l1.val;
            int y =(l2==null)?0:l2.val;
            int sum = x+y+jinwei;
            temp=new ListNode(sum%10);
            if(l3.next==null)
            	l3.next=temp;
            else {
            	temp.next=l3.next;
            	l3.next=temp;
            }
            jinwei=sum/10;
            if(l2!=null)l2=l2.next;
            if(l1!=null)l1=l1.next;
        }
        if(jinwei>0){
        	temp=new ListNode(jinwei);
        	temp.next=l3.next;
        	l3.next=temp;
        }  
        return twosum.next;
    }
##Tag
linked-list