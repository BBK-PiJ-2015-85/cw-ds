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
	}
	//need more testing than this!!!!!!
}