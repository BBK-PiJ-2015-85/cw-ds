public class ArrayListTest {
	public static void main(String[] args) {
		List al = new ArrayList();
		//...
		al.add("dwsffgj");
		ReturnObject ro = aL.get(0);
		if (ro.hasError()){
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
	}
}