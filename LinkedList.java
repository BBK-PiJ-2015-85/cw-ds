public class LinkedList implements List {
	public LinkedListNode head;
	public LinkedListNode tail;
	public int size;
	
	public LinkedList() {
		head = null;
		size = 0;
	}
	/**
	 * Returns true if the list is empty, false otherwise. 
	 * 
	 * @return true if the list is empty, false otherwise. 
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Returns the number of items currently in the list.
	 * 
	 * @return the number of items currently in the list
	 */
	public int size() {
		return size;
	}

	/**
	 * Returns the element at the given position. 
	 * 
	 * If the index is negative or greater or equal than the size of
	 * the list, then an appropriate error must be returned.
	 * 
	 * @param index the position in the list of the item to be retrieved
	 * @return the element or an appropriate error message, 
	 *         encapsulated in a ReturnObject
	 */
	public ReturnObject get(int index) {
		if (index < 0 || index >= size) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
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
	

	/**
	 * Returns the elements at the given position and removes it
	 * from the list. The indeces of elements after the removed
	 * element must be updated accordignly.
	 * 
	 * If the index is negative or greater or equal than the size of
	 * the list, then an appropriate error must be returned.
	 * 
	 * @param index the position in the list of the item to be retrieved
	 * @return the element or an appropriate error message, 
	 *         encapsulated in a ReturnObject
	 */
	public ReturnObject remove(int index) {
		if (index < 0 || index >= size) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			ReturnObject removedElement = new ReturnObjectImpl(get(index)); 
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
					if (temp.getNext().getIndex() == index) {
						//found element to remove
						if (temp.getNext().getNext() != null) {
							//change pointers so that element to remove is skipped
							temp.setNext(temp.getNext().getNext());
							temp.getNext().setPrev(null);
							temp.getNext().setPrev(temp);
							break;
						} else {
							//element to remove is last in the list so set next to null
							temp.setNext(null);
							tail = tail.getPrev();
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

	/**
	 * Adds an element to the list, inserting it at the given
	 * position. The indeces of elements at and after that position
	 * must be updated accordignly.
	 * 
	 * If the index is negative or greater or equal than the size of
	 * the list, then an appropriate error must be returned.
	 * 
	 * If a null object is provided to insert in the list, the
	 * request must be ignored and an appropriate error must be
	 * returned.
	 * 
	 * @param index the position at which the item should be inserted in
	 *              the list
	 * @param item the value to insert into the list
	 * @return an ReturnObject, empty if the operation is successful
	 *         or containing an appropriate error message otherwise
	 */
	public ReturnObject add(int index, Object item) {
		return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
	}

	/**
	 * Adds an element at the end of the list.
	 * 
	 * If a null object is provided to insert in the list, the
	 * request must be ignored and an appropriate error must be
	 * returned.
	 * 
	 * @param item the value to insert into the list
	 * @return an ReturnObject, empty if the operation is successful
	 *         or containing an appropriate error message otherwise
	 */
	public ReturnObject add(Object item) {
		if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}
		if (head == null) {
			//list is empty
			head = new LinkedListNode(item, 0);
			tail = head;
		} else {
			LinkedListNode newNode = new LinkedListNode(item, tail.getIndex() + 1);
			tail.setNext(newNode);
			newNode.setPrev(tail);
			tail = newNode;
		}
		size++;
		return new ReturnObjectImpl(null);
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
	
	public void printList() {
		LinkedListNode temp = head;
		while (temp != null) {
			System.out.print(temp.getItem() + ", ");
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	
}