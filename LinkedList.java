/**
 * LinkedList
 *
 * 		a linked list of nodes that contain integer values and a link to another node
 */

public class LinkedList extends Node {
	private Node head;
/**
 * Constructors
 * 
 */
	public LinkedList(Node head) {
		this.head = head;
	}
	public LinkedList() {
		this(null);
	}

	public static void main(String[] args) {

	}
	/**
	 * Push Method
	 *
	 * 		creates a node and links it to the node the head is linked to then links the head to itself
	 */
	public void push() {
		Node a = new Node(7, head);
		head.setNext(a);
	}
	/**
 	* length		
 	*
 	* 		it returns the length of the linked list
 	*/
	public int length() {
		int count = 1;
		Node temp = new Node(1, head);
		while(temp.getNext() != null) {
			push();
			count++;
			temp.setNext(temp.getNext());
		}
		return count;
	}
	/**
	 * buildOneTwoThree
	 *
	 * 		sets the value of the LinkedList to {1,2,3}
	 *
	 */
	public void buildOneTwoThree() {
		Node a = new Node(1, head);
		head.setValue(2);
		head.getNext().setValue(3);

	}

	public int countNumbers(int value) {
		return 0;
	}

}