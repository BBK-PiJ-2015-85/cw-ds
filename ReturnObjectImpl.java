public class ReturnObjectImpl implements ReturnObject {
	private Object obj;
	private ErrorMessage em;
	
	public ReturnObjectImpl(Object obj) {
		this.obj = obj;
		this.em = ErrorMessage.NO_ERROR;		
	}
	
	public ReturnObjectImpl(ErrorMessage em) {
		this.em = em;
		this.object = null;
	}
	
	/**
	 * Returns whether there has been an error
	 * @return whether there has been an error
	 */
	public boolean hasError() {
		return em != ErrorMessage.NO_ERROR;
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
		return em;
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
		return obj;
	}
}