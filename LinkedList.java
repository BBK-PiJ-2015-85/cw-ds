public class LinkedList implements List {
	private LinkedListNode head;
	private LinkedListNode tail;
	private int size;
	
	public LinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public ReturnObject get(int index) {
		if (index < 0 || index >= size) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			if (index > size() / 2) {
				//item to find is closer to tail so start search from there
				LinkedListNode temp = tail;
				while (temp != null) {
					if (temp.getIndex() == index) {
						break;
					} else {
						temp = temp.getPrev();
					}
				}
				return new ReturnObjectImpl(temp.getItem());
			} else {
				//item to find is closer to head so start search from there
				LinkedListNode temp = head;
				while (temp != null) {
					if (temp.getIndex() == index) {
						break;
					} else {
						temp = temp.getNext();
					}
				}				
				return new ReturnObjectImpl(temp.getItem());
			}			
		}
	}

	public ReturnObject remove(int index) {
		if (index < 0 || index >= size) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			//encapsulate item to remove as return object
			ReturnObject removedElement = get(index); 
			if (head.getIndex() == index) {
				//element to remove is the first item
				if (head.getNext() == null) {
					//only element in list so set head and tail to null
					head = null;
					tail = null;
				} else {
					head.getNext().setPrev(null);
					head = head.getNext();					
				}
			} else {
				LinkedListNode temp = head;
				while (temp.getNext() != null) {
					//enter this loop to find element to remove
					if (temp.getNext().getIndex() == index) {
						//found element to remove
						if (temp.getNext().getNext() != null) {
							//element to remove has elements either side of it
							//change pointers so that element to remove is skipped
							temp.setNext(temp.getNext().getNext());
							temp.getNext().setPrev(temp);
							break;
						} else {
							//element to remove is last in the list							
							temp.setNext(null);
							tail = temp;
							break;
						}						
					}
					temp = temp.getNext();
				}
			}
			//if this is not the only element then call method to adjust indices
			if (size > 1) {
				removeIndexAdjust(index + 1);
			}									
			size--;
			return removedElement;
		}
	}

	public ReturnObject add(int index, Object item) {
		if (index < 0 || index >= size) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}
		LinkedListNode newNode = new LinkedListNode(item, index);
		if (index == 0) {
			//insert at start of list
			head.setPrev(newNode);
			newNode.setNext(head);
			head = newNode;
		} else {
			//insert mid list
			LinkedListNode temp = head;
			while (temp.getNext() != null) {
				if (temp.getNext().getIndex() == index) {
					newNode.setNext(temp.getNext());
					newNode.setPrev(temp);
					temp.getNext().setPrev(newNode);
					temp.setNext(newNode);
					break;
				}
				temp = temp.getNext();
			}
		}
		insertIndexAdjust(index);
		size++;
		return new ReturnObjectImpl(ErrorMessage.NO_ERROR);	
	}

	public ReturnObject add(Object item) {
		if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}
		if (head == null) {
			//list is empty
			head = new LinkedListNode(item, 0);
			tail = head;
		} else {
			//list not empty so add at end
			LinkedListNode newNode = new LinkedListNode(item, tail.getIndex() + 1);
			newNode.setPrev(tail);
			tail.setNext(newNode);
			tail = newNode;
		}
		size++;
		return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
	}
	
	//after an element has been removed this method adjusts the remaining indices accordingly
	//first it finds the element specified by index and then adjusts the indices
	private void removeIndexAdjust(int index) {		
		LinkedListNode temp = head;
		if (temp.getIndex() == index) {
			//element to find is first in list, so change this index
			temp.setIndex(index - 1);
			while (temp.getNext() != null) {
				//now change all the remaining indices
				temp.getNext().setIndex(temp.getNext().getIndex() - 1);
				temp = temp.getNext();
			}
		} else {
			//find specified index
			while (temp.getNext() != null) {
				if (temp.getNext().getIndex() == index) {
					break;					
				}
				temp = temp.getNext();				
			} 
			//now the next element is the specified one, so change all indices after
			while (temp.getNext() != null) { 
				temp.getNext().setIndex(temp.getNext().getIndex() - 1);
				temp = temp.getNext();
			}			
		}		
	}
	
	//method to adjust the indices after a new item has been inserted to the list
	private void insertIndexAdjust(int index) {
		LinkedListNode temp = head;
		if (index == 0) {
			//it was inserted at the start so adjust all indices after head			
			while (temp.getNext() != null) {
				temp.getNext().setIndex(temp.getNext().getIndex() + 1);
				temp = temp.getNext();
			}
		} else {			
			while (temp.getNext() != null) {
				//enter this loop to find the inserted element
				if (temp.getIndex() == index) {
					//temp is now the element that was inserted so exit loop					
					break;
				}
				temp = temp.getNext();
			}
			while (temp.getNext() != null) {
				//adjust all indices after temp
				temp.getNext().setIndex(temp.getNext().getIndex() + 1);
				temp = temp.getNext();
			}
		}
	}
	
	//returns the specified elements item (not encapsulated in a return object)
	public Object getItem(int index) {
		LinkedListNode temp = head;
		while (temp != null) {
			if (temp.getIndex() == index) {
				break;
			}
			temp = temp.getNext();
		}
		return temp.getItem();
	}
	
	//converts list to string, used for testing purposes
	//also states each item's index in brackets
	public String toString() {
		String str = "";
		LinkedListNode temp = head;
		for (int i = 0; i < size(); i++) {
			str += getItem(i) + " (" + temp.getIndex() + ")";
			if (i < size() - 1) {
				str += ", ";
			}
			temp = temp.getNext();
		}
		return str;
	}
	
	
}