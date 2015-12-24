public class StackImplTest {
	public static void main(String[] args) {
		List al = new ArrayList();
		Stack si = new StackImpl(al);
		
		
		for (int i = 0; i < 10; i++) {
			si.push(i);
		}
		
		
		System.out.println(si.isEmpty());
		System.out.println(si.size());
		System.out.println(si.toString());
		
		System.out.println();
		ReturnObject ro = si.top();
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		
		System.out.println();
		ro = si.pop();
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		
		System.out.println();
		System.out.println(si.toString());
		
	}
}