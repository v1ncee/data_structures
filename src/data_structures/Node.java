package data_structures;

public class Node<T> {
	
	private T data;
	private Node<T> nextNode;
	
	public Node (T o, Node<T> n) {
		data = o;
		nextNode = n;
	}
	
	public T getObject() {
		return data;
	}
	
	public Node<T> getNextNode() {
		return nextNode;
	}
}
