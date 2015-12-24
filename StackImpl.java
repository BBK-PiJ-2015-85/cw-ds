public class StackImpl extends AbstractStack {
	
	public StackImpl(List list) {
		super(list);
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