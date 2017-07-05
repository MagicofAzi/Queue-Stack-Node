/*
 * Author: Rahat Hossan
 * Date: 4/6/17
 * Generic class MyQueue that takes Nodes of any type and element.
 */

public class MyQueue<E> {
	
	private Node<E> front; //reference to the front of queue
	private Node<E> rear; //reference to the end of queue
	
	//Constructor, sets front and rear to null
	public MyQueue() {
		front = null;
		rear = null;
	}

	//Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
	public E peek() {
		return front.getData();
	}
	
	//Retrieves and removes the head of this queue, or returns null if this queue is empty.	
	public E poll() {
		if(this.isEmpty() == true) {
			return null;
		}
		Node<E> temp = front;
		front = front.getLink();
		if(front == null) {
			rear = null;
		}
		return temp.getData();
	}
	
	//Inserts the specified element into this queue if it is possible to do so immediately without violating
	//capacity restrictions.
	//@param Generic item
	public boolean offer(E item) {
		if (item == null) {
			throw new NullPointerException();
		}
		Node<E> newNode = new Node<E>(item);
		if(rear == null) {
			front = newNode;
			rear = newNode;
		}
		else {
			rear.setLink(newNode);
		}
		rear = newNode;
		
		if(this.peek() == newNode) {
			return true;
		}
		else {
			return false;
		}
	}
	//Returns true if Queue is empty.
	private boolean isEmpty() {
		return (front == null);
	}

}

