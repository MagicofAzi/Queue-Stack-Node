/*
 * Author: Rahat Hossan
 * Date: 4/6/17
 * Generic class MyStack that takes Nodes of any type and element.
 */
import java.util.*;
public class MyStack<E> { 
	private Node<E> top;
	
	public MyStack() {
		top = null;
	}
	
	//Tests if this stack is empty.
	public boolean empty() {
		return (top == null);
	}
	
	//Returns the element at the top of this stack without removing it from the stack.
	public E peek() {
		if (top == null) {
			throw new EmptyStackException();
		}
		else 
			return top.getData(); //return top or data
	}
	
	//Removes the element at the top of this stack and returns that element as the value of this function.
	public E pop() {
		if(top == null) {
			throw  new EmptyStackException();	
		}
		else {
		E data = top.getData();
		top = top.getLink();
		return data;
		}
	}
	
	//Pushes an item onto the top of this stack. Returns the item itself.
	//@param Generic item, Node element.
	public E push(E item) {
		Node<E> newNode = new Node<E>(item);
		newNode.setLink(top);
		top = newNode;
		return top.getData();
		
	}
	
}
