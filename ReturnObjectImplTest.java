public class ReturnObjectImplTest {
	public static void main(String[] args) {
		ReturnObject result = new ReturnObjectImpl("1st");
		if (result.hasError()) {
			System.out.println("Ouch1!");
		}
		if (! result.getError().equals(ErrorMessage.NO_ERROR)) {
			System.out.println("Ouch2!");
		}
		if (! result.getReturnValue().equals("1st")) {
			System.out.println("Ouch3!");
		}
		
		ReturnObject err1 = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		if (! err1.hasError()) {
			System.out.println("Ouch4!");
		}
		if (! err1.getError().equals(ErrorMessage.EMPTY_STRUCTURE)) {
			System.out.println("Ouch5!");
		}
		if (err1.getReturnValue() != null) {
			System.out.println("Ouch6!");
		}
		
		ReturnObject err2 = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		if (! err2.hasError()) {
			System.out.println("Ouch7!");
		}		
		if (! err2.getError().equals(ErrorMessage.INDEX_OUT_OF_BOUNDS)) {
			System.out.println("Ouch8!");
		}
		if (err2.getReturnValue() != null) {
			System.out.println("Ouch9!");
		}
		
		ReturnObject err3 = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		if (! err3.hasError()) {
			System.out.println("Ouch10!");
		}		
		if (! err3.getError().equals(ErrorMessage.INVALID_ARGUMENT)) {
			System.out.println("Ouch11!");
		}
		if (err3.getReturnValue() != null) {
			System.out.println("Ouch12!");
		}
		
		System.out.println(result.hasError());
		System.out.println(result.getError());
		System.out.println(result.getReturnValue());
		System.out.println();
		System.out.println(err1.hasError());
		System.out.println(err1.getError());
		System.out.println(err1.getReturnValue());
		System.out.println();
		System.out.println(err2.hasError());
		System.out.println(err2.getError());
		System.out.println(err2.getReturnValue());
		System.out.println();
		System.out.println(err3.hasError());
		System.out.println(err3.getError());
		System.out.println(err3.getReturnValue());
		
		
		
	}
	//need more testing than this!!!!!!
}