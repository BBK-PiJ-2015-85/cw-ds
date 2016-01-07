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
		
		si.push(null);
		System.out.println(si.toString());
		System.out.println(si.isEmpty());
		si.push("x");
		ro = si.top();
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		si.pop();
		si.pop();
		si.pop();
		si.pop();
		System.out.println(si.toString());
		
		for (int i = 0; i < 1000000; i++) {
			si.push(i);
		}
		System.out.println(si.size());
		
		for (int i = 1000006; i >= 0; i--) {
			si.pop();
		}
		System.out.println(si.size());
		System.out.println("************************************");
		List ll = new LinkedList();
		si = new StackImpl(ll);
		
		for (int i = 0; i < 10; i++) {
			si.push(i);
		}
		
		System.out.println(si.isEmpty());
		System.out.println(si.size());
		System.out.println(si.toString());
		
		System.out.println();
		ro = si.top();
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
		
		si.push(null);
		System.out.println(si.toString());
		System.out.println(si.isEmpty());
		si.push("x");
		ro = si.top();
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		si.pop();
		si.pop();
		si.pop();
		si.pop();
		System.out.println(si.toString());
		
		for (int i = 0; i < 1000000; i++) {
			si.push(i);
		}
		System.out.println(si.size());
		
		for (int i = 1000; i >= 0; i--) {
			si.pop();
		}
		System.out.println(si.size());
	}
}