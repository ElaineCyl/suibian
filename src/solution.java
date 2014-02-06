


public class solution {
	
public ListNode reverse(ListNode head, int m, int n){
		
		ListNode newhead = new ListNode(0);
		newhead.next=head;
		
		for(int i=1;i<m;i++){
			newhead=newhead.next;
		}
		
		ListNode prevNode = newhead;
		ListNode current = prevNode.next;
		ListNode tail = prevNode.next;
		
		ListNode next = null;
		ListNode prev = null;
		int count = 1;
		while(count <=n-m+1){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		 prevNode.next = prev;//为什么prev得到的结果就是倒叙的
		 tail.next=next;//tail 和current 到底是什么关系 为什么要有这一步
		 return newhead.next;//为什么可以直接返回newhead，newhead和prevNode是一回事么？
	}

}
