public class LinkedListNode {
	private Object item;
	private LinkedListNode nextNode;
	private LinkedListNode prevNode;
	private int index;
	
	public LinkedListNode(Object item, int index) {
		this.item = item;
		nextNode = null;
		prevNode = null;
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public Object getItem() {
		return item;
	}
	
	public void setItem(Object item) {
		this.item = item;
	}
	
	public LinkedListNode getNext() {
		return nextNode;
	}
	
	public void setNext(LinkedListNode next) {
		nextNode = next;
	}
	
	public LinkedListNode getPrev() {
		return prevNode;
	}
	
	public void setPrev(LinkedListNode prev) {
		prevNode = prev;
	}
}