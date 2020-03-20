package StackTest;

import java.util.Stack;

/***
 * 用两个栈实现队列
 * @author brz
 *
 */

public class Stack2 {
	
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void push(int node) {
		stack1.add(node);
	}
	
	public int pop() {
		while(!stack1.empty()) {
			stack2.add(stack1.pop());
		}
		
		int a = stack2.pop();
		
		while(!stack2.empty()) {
			stack1.add(stack2.pop());
		}
		
		return a;
	}

}
