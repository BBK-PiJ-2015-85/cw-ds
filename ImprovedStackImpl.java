public class ImprovedStackImpl implements ImprovedStack {
	private List internalList;
	
	public ImprovedStackImpl (List list) {
		this.internalList = list;
	}
	
	/**
	 * Returns true if the stack is empty, false otherwise. 
	 * 
	 * @return true if the stack is empty, false otherwise. 
	 */
	public boolean isEmpty() {
		return internalList.isEmpty();
	}

	/**
	 * Returns the number of items currently in the stack.
	 * 
	 * @return the number of items currently in the stack
	 */
	public int size() {
		return internalList.size();
	}

	/**
	 * Adds an element at the top of the stack. 
	 * 
	 * @param item the new item to be added
	 */
	public void push(Object item) {
		internalList.add(item);
	}

	/**
	 * Returns the element at the top of the stack. The stack is
	 * left unchanged.
	 * 
	 * @return If stack is not empty, the item on the top is returned. If the
	 *         stack is empty, an appropriate error.
	 */
	public ReturnObject top() {
		if (internalList.size() == 0) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return internalList.get(size() - 1);
		}
	}

	/**
	 * Returns the element at the top of the stack. The element is
	 * removed frmo the stack.
	 * 
	 * @return If stack is not empty, the item on the top is returned. If the
	 *         stack is empty, an appropriate error.
	 */
	public ReturnObject pop() {
		if (internalList.size() == 0) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return internalList.remove(size() - 1);
		}
	}
	
	
	/**
	 * Returns a copy of this stack with the items reversed, the top
	 * elements on the original stack is at the bottom of the new
	 * stack and viceversa.
	 * 
	 * @return a copy of this stack with the items reversed. 
	 */	
	public ImprovedStack reverse() {
		ArrayList revInternalList = new ArrayList();
		for (int i = size() - 1; i >= 0; i--) {
			ReturnObject ro = internalList.get(i);
			revInternalList.add(ro.getReturnValue());
		}
		ImprovedStack reverse = new ImprovedStackImpl(revInternalList);
		return reverse;
	}

	/**
	 * Removes the given object from the stack if it is
	 * there. Multiple instances of the object are all removed.
	 *
	 * Classes implementing this method must use method .equals() to
	 * check whether the item is in the stack or not.
	 * 
	 * @param object the object to remove
	 */
	public void remove(Object object) {
		for (int i = 0; i < size(); i++) {
			ReturnObject ro = internalList.get(i);
			if (ro.getReturnValue().equals(object)) {
				internalList.remove(i);
				i--;
			}
		}
	}
	
	public String toString() {
		String str = "";		
		for (int i = 0; i < size(); i++) {
			ReturnObject ro = internalList.get(i);
			str += ro.getReturnValue();
			if (i < size() - 1) {
				str += ", ";
			}
		}		
		return str;
	}
}