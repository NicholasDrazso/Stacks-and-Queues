
public class Node {

	private Object item;
	private Node next;
	private Node prev;
	
	public Node(Object o) {
		item = o;
		next = null;
	}
	
	public void setNext(Node n) {
		next = n;
	}
	
	public void setPrev(Node p) {
		prev = p;
	}
	
	public Node getNext() {
		return next;
	}
	
	public Node getPrev() {
		return prev;
	}
	
	public Object getItem() {
		return item;
	}
	
	public void setItem(int o) {
		item = o;
	}
	
	public boolean hasNext() {
		return (next != null);
	}
	
	
}
