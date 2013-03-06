/**
 * LinkedList
 *
 * 		a linked list of nodes that contain integer values and a link to another node
 */

public class LinkedList {
	private Node[] nodes;
	private Node head;

	public LinkedList() {

	}
	/**
	 * Push Method
	 *
	 * 		creates a node and linds it to the node the head is linked to then links the head to itself
	 */
	public void push() {
		Node a = null;
		a.next = head.next;
		head.next = a;
	}
	/**
 	* length		
 	*
 	* 		it returns the length of the linked list
 	*
 	* @param	given an array of nodes
 	*/
	public int length(Node[] nodes) {
		return nodes.length;
	}

	public void buildOneTwoThree() {

	}

	public int countNumbers(int value) {

	}

}