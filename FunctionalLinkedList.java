public class FunctionalLinkedList extends LinkedList implements FunctionalList {
	
    /**
     * Returns the element at the beginning of the list. 
     * 
     * If the list is empty, an appropriate error is returned. 
     *
     * @return a copy of the element at the beginning of the list or 
     *         an error if the list is empty.
     */
    public ReturnObject head() {
		if (size() == 0) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return get(0);
		}
	}

    /**
     * Returns a list with the elements in this list except the
     * head. The elements must be in the same order. The original list
     * must not change or be affected by changes in the new list. 
     * 
     * If the list is empty, another empty list is returned. 
     */
    public FunctionalList rest() {
		FunctionalLinkedList rest = new FunctionalLinkedList();
		if (size() > 1) {
			for (int i = 1; i < size(); i++) {
				rest.add(getItem(i));
			}
		}
		return rest;
	}
	
	public String toString() {
		String str = "";
		for (int i = 0; i < size(); i++) {
			str += getItem(i);
			if (i < size() - 1) {
				str += ", ";
			}
		}
		return str;
	}
}