package DataStructure;

import java.util.ArrayList;

public class Stack<T> {


	private ArrayList<T> stack = new ArrayList<T>();
	private int top = 1;
	
	public void push(T data) {
		stack.add(data);
		top++;
	}
	
	public T pop() {
		if(stack.isEmpty()) {
			return null;
		} else {
			return stack.remove(stack.size() -1);
		}
	}
	
	
	
}
