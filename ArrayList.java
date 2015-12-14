public class ArrayList implements List {
	private Object[] myArray;
	private final static int DEFAULT_SIZE = 50;
	private int numberOfElements;
	
	public ArrayList() {
		myArray = new Object[DEFAULT_SIZE];
		numberOfElements = 0;
	}

	public boolean isEmpty() {
		return numberOfElements == 0;
	}

	public int size() {
		return numberOfElements;
	}

	public ReturnObject get(int index) {
		if (index < 0 || index >= numberOfElements) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			return new ReturnObjectImpl(myArray[index]);
		}
	}

	public ReturnObject remove(int index) {
		if (index < 0 || index >= numberOfElements) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			//encapsulate the element as a ReturnObject
			ReturnObject removedElement = new ReturnObjectImpl(myArray[index]);
			//move every element after it down one index
			for (int i = index; i < numberOfElements - 1; i++) {
				myArray[i] = myArray[i + 1];
			}
			//set the now obsolete last element to null
			myArray[numberOfElements - 1] = null;
			numberOfElements--;
			return removedElement;
		}
	}

	public ReturnObject add(int index, Object item) {
		if (index < 0 || index >= numberOfElements) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			//check array is not full
			checkSize();
			//move every element after the insertion up one index
			for (int i = numberOfElements; i > index; i--) {
				myArray[i] = myArray[i-1];
			}
			myArray[index] = item;
			numberOfElements++;
			return new ReturnObjectImpl(null);
		}
	}

	public ReturnObject add(Object item) {
		if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			checkSize();
			myArray[numberOfElements] = item;
			numberOfElements++;
			return new ReturnObjectImpl(null);
		}
	}
	
	//method that checks if the array is full and if it 
	//is increases the size by the default amount
	private void checkSize() {
		if (myArray.length == numberOfElements) {
			Object[] tempArray = new Object[myArray.length + DEFAULT_SIZE];
			for (int i = 0; i < numberOfElements; i++) {
				tempArray[i] = myArray[i];
			}			
			myArray = tempArray;
		}
	}
}