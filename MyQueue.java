//Name: Nicholas Drazso
//Date: June 9, 2019
//Program Description: Implementation of queue interface using linked lists
public class MyQueue implements Queue {

	//Member variables representing the front and back of the queue aswell as how many elements are in the queue
	private Node head;//Remove this
	private Node tail;//Add to end of this
	private int count;
	
	
	//Constructor initializes count
	public MyQueue() {
		this.count = 0;
		this.head = null;
		this.tail = null;
	}
	
	//Adds item to end of queue
	public void enqueue(Object item) {
		
		//Temporary node to hold item
		Node temp = new Node(item);
		
		//As long as the queue is not empty, add onto the end of the list
		if (this.head != null) {
			tail.setNext(temp);
			tail = temp;
		}
		
		//If the queue is empty
		else {
			this.head = temp;
			this.tail = temp;
		}
		
		//increase size of queue
		this.count++;
		
	}

	//Removes the head of the queue and returns the new head if the queue is not empty, but if the queue is empty returns null
	public Object dequeue() {
		
		//The front of the queue is the old fronts next
		this.head = this.head.getNext();
		
		//One element was removed so size of queue decreases
		this.count --;
		
		//If the queue is empty, set tail to null and return null
		if (this.head == null) {
			this.tail = null;
			return null;
		}
		
		//If the queue is not empty, return the new front of the queue
		else {
			return this.head;
		}
		
		
	}

	//Returns true if the queue is empty, false otherwise
	public boolean isEmpty() {
		
		//If the queue is empty, return true
		if (this.head == null) {
			return true;
		}
		
		//If the queue is not empty, return false
		return false;
	}

	//Returns number of elements in the queue
	public int size() {
		
		return this.count;
	}

}
