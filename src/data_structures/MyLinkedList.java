package data_structures;

public class MyLinkedList<T> {
	
	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	public MyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public void add(T data) {
		// Next node doesn't exist, null
		Node<T> newNode = new Node<>(data, null);
		
		if (isEmpty()) {
			head = newNode;
			// Make sure tail and head are pointing to the same node if empty
			tail = head;
		} else {
			// Set the next node to added one and change the tail after
			tail.setNextNode(newNode);
			tail = newNode;
		}
		size++;
	}
	
	public void addFirst(T data) {
		Node<T> newNode = new Node<>(data, null);
		// Set the current head as next node
		newNode.setNextNode(head);
		// And set the newly node as head
		head = newNode;
		size++;
	}
	
	public void add(int index, T data) {
		Node<T> newNode = new Node<>(data, null);
		Node<T> currentNode = head;
		if (head != null && index <= size()) {
			// Traverse list until index is reached
			for (int i = 1; i < index; i++) {
				currentNode.setNextNode(currentNode);
			}
			// Insert new node
			newNode.setNextNode(currentNode.getNextNode());
			currentNode.setNextNode(newNode);
			size++;
		}
	}
	
	@Override
	public String toString() {
		String ans = "[";
		Node<T> currentNode = head;
		for (int i = 0; i < this.size; i++) {
			ans += currentNode.getData();
			if (currentNode.getNextNode() != null) {
				ans += ", ";
			}
			currentNode = currentNode.getNextNode();
		}
		return ans + "]";
	}
}

