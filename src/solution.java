


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
		 prevNode.next = prev;//Ϊʲôprev�õ��Ľ�����ǵ����
		 tail.next=next;//tail ��current ������ʲô��ϵ ΪʲôҪ����һ��
		 return newhead.next;//Ϊʲô����ֱ�ӷ���newhead��newhead��prevNode��һ����ô��
	}

}
