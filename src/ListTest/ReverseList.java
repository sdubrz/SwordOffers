package ListTest;

import java.util.*;

/***
 * 倒着输出一个链表
 * 题目地址
 * https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035?tpId=13&tqId=11156&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * 
 * @author sdu20
 *
 */
public class ReverseList {
	
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		ListNode currentNode = listNode;
		while(currentNode != null) {
			list2.add(currentNode.val);
			currentNode = currentNode.next;
		}
		
		int n = list2.size();
		for(int i=0; i<n; i++) {
			list.add(list2.get(n-1-i));
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseList obj = new ReverseList();
		ListNode listNode = new ListNode(1);
		ListNode lastNode = listNode;
		for(int i=2; i<8; i++) {
			ListNode temp = new ListNode(i);
			lastNode.next = temp;
			lastNode = lastNode.next;
		}
		ArrayList<Integer> list = obj.printListFromTailToHead(listNode);
		System.out.println(list.toString());
	}

}

