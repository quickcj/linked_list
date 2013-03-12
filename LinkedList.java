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
		Node a = new Node(7, this.head);
		this.head.setNext(a);
	}
	/**
 	* length		
 	*
 	* 		it returns the length of the linked list
 	*
 	* @param	given an array of nodes
 	*/
	public int length() {
		return 0;
	}
	/**
	 * buildOneTwoThree
	 *
	 * 		sets the value of the LinkedList to {1,2,3}
	 *
	 * @param	takes an array of nodes
	 * return - returns a list of nodes of length 3
	 */
	public void buildOneTwoThree() {
		
	}

	public int countNumbers(int value) {
		return 0;
	}

}