public class ArrayList implements List {
	private Object[] myArray;
	private final static int DEFAULT_SIZE = 20;
	private int size;
	
	public ArrayList() {
		myArray = new Object[DEFAULT_SIZE];
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
			return new ReturnObjectImpl(myArray[index]);
		}
	}

	public ReturnObject remove(int index) {
		if (index < 0 || index >= size) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			//encapsulate the element as a ReturnObject
			ReturnObject removedElement = new ReturnObjectImpl(myArray[index]);
			//move every element after it down one index
			for (int i = index; i < size - 1; i++) {
				myArray[i] = myArray[i + 1];
			}
			//set the now obsolete last element to null
			myArray[size - 1] = null;
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
		} else {
			//check array is not full
			checkSize();
			//move every element after the insertion up one index
			for (int i = size; i > index; i--) {
				myArray[i] = myArray[i-1];
			}
			myArray[index] = item;
			size++;
			return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
		}
	}

	public ReturnObject add(Object item) {
		if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			checkSize();
			myArray[size] = item;
			size++;
			return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
		}
	}
	
	//method that checks if the array is full and if it 
	//is increases the size by the default amount
	private void checkSize() {
		if (myArray.length == size) {
			Object[] tempArray = new Object[myArray.length * 2];
			for (int i = 0; i < size; i++) {
				tempArray[i] = myArray[i];
			}			
			myArray = tempArray;
		}
	}
	
	
	//returns the element specified in the list (not encapsulated as a return object)
	public Object getItem(int index) {
		return myArray[index];
	}
	
	public void rev() {
		for (int i = 0; i < size() / 2; i++) {
			Object temp = myArray[i];
			myArray[i] = myArray[size() - i - 1];
			myArray[size() - i - 1] = temp;
		}
		System.out.println("HERE");
	}
	
	//converts the list to a string for testing purposes
	public String toString() {
		String str = "";
		for (int i = 0; i < myArray.length; i++) {
			str += myArray[i];
			if (i < myArray.length - 1) {
				str += ", ";
			}
		}
		return str;
	}
}