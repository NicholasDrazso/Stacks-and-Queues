//Name: Nicholas Drazso
//Date: June 9, 2019
//Program Description: Implementation of stack interface using linked lists
public class MyStack implements Stack{

	//Member variable that references the top of the stack
	private Node top;

	//Adds to the "top" of the stack
	public void push(Object item) {

		//If there is nothing in the stack, make item the beginning
		if (this.top == null) {
			this.top = new Node(item);
		}

		//If the stack does contain elements, add item to the "top" of the stack
		else {
			Node temp = new Node (item);
			temp.setNext(this.top);
			this.top = temp;
		}
	}

	//Takes away from the "top" of the stack
	public Object pop() {

		//Sets the "top" of the stack 1 element below the existing "top"
		this.top = this.top.getNext();

		//Returns null if the stack is empty
		if (this.top == null) {
			return null;
		}

		//Returns the top of the stack if it exist
		return this.top.getItem();

	}

	//Returns the object that is at the top of the stack
	public Object peek() {

		//If the stack is empty return null
		if (this.top == null) {
			return null;
		}

		//Returns a reference to the "top" of the stack
		return this.top.getItem();
	}

	//Returns true if the stack is empty, otherwise false
	public boolean isEmpty() {

		//If the top of the stack does not exist then the stack is empty
		if (this.top == null) {
			return true;
		}
		
		//Otherwise the stack has objects in it
		return false;
	}

}
