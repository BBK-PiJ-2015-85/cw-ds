public class ReturnObjectImpl implements ReturnObject {
	private Object item;
	private ErrorMessage errMess;
	
	public ReturnObjectImpl(Object item) {
		this.item = item;
		this.errMess = ErrorMessage.NO_ERROR;	
	}
	
	public ReturnObjectImpl(ErrorMessage errMess) {
		this.errMess = errMess;
		this.item = null;
	}
	
	/**
	 * Returns whether there has been an error
	 * @return whether there has been an error
	 */
	public boolean hasError() {
		return errMess != ErrorMessage.NO_ERROR;
	}

	/**
	 * Returns the error message. 
	 * 
	 * This method must return NO_ERROR if and only if
	 * {@hasError} returns false.
	 * 
	 * @return the error message
	 */
	public ErrorMessage getError() {
		return errMess;
	}

	/**
	 * Returns the object wrapped in this ReturnObject, i.e. the
	 * result of the operation if it was successful, or null if
	 * there has been an error.
	 * 
	 * Note that the output of this method must be null if {@see
	 * hasError} returns true, but the opposite is not true: if
	 * {@see hasError} returns false, this method may or may not
	 * return null.
	 * 
	 * @return the return value from the method or null if there has been an error
	 */
	public Object getReturnValue() {
		return item;
	}
}