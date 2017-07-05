/*
 * Author: Rahat Hossan
 * Date: 4/6/17
 * Generic class Node that takes any element as a field.
 */

public class Node<E> {
	//Node link sets link between Nodes.
	private Node<E> link;
	//Generic data field holds data for Nodes.
	private E data;
	
	//Generic constructor for Node that takes any element and link is automatically set to null.
	//@param Generic Data
	public Node(E data) {
		this.data = data;
		link = null;
	}
	
	//Generic setter to set Data
	//@param Generic data
	public void setData(E data) {
		this.data = data;
	}
	
	//Generic getter returns data of Node.
	public E getData() {
		return data;
	}
	
	//Sets link between two nodes
	//@param Node 
	public void setLink(Node<E> newLink) {
		this.link = newLink;
	}
	
	//Returns link of Node
	public Node<E> getLink() {
		return link;
	}
}
