package data_structures;

public class Main {
	public static void main(String[] args) {
		MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
		
		myLinkedList.add("element 1");
		myLinkedList.addFirst("Nu dees vanvoor");
		myLinkedList.add(1, "int midden zegt");
		
		System.out.println(myLinkedList);
		
		System.out.println(myLinkedList.isEmpty());
	}
}
