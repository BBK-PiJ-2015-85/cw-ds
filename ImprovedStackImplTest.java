public class ImprovedStackImplTest {
	public static void main(String[] args) {
		List list = new ArrayList();
		ImprovedStack isi = new ImprovedStackImpl(list);
		
		for (int i = 0; i < 10; i++) {
			isi.push(i);
		}
		System.out.println(isi.toString());
		System.out.println(isi.size());
		
		
		ImprovedStack isi2 = isi.reverse();
		
		System.out.println(isi.toString());
		System.out.println(isi2.toString());
		
		ReturnObject ro = isi.pop();
		System.out.println(ro.getReturnValue());
		ro = isi2.pop();
		System.out.println(ro.getReturnValue());
		System.out.println(ro.getError());
		
		isi.push(0);
		isi.push(0);
		System.out.println("Original: " + isi.toString());
		System.out.println("Reverse: " + isi2.toString());		
		
		isi.remove(0);
		isi2.remove(0);
		System.out.println(isi.toString());	
		System.out.println(isi.size());
		isi.pop();
		isi.pop();
		isi.pop();
		isi.pop();
		isi.pop();
		System.out.println(isi.toString());
		ro = isi.top();
		System.out.println(ro.getReturnValue());
		System.out.println(ro.getError());
		System.out.println(ro.hasError());
		for (int i = 0; i < 10; i++) {
			isi.push("x");
		}
		System.out.println(isi.toString());
		isi.remove("x");
		System.out.println(isi.toString());
		isi.remove(3);
		isi.remove(2);
		isi.remove(1);
		isi.remove(0);
		System.out.println(isi.toString());
		System.out.println(isi.size());
		
		System.out.println("********************************");
		
		List ll = new LinkedList();
		isi = new ImprovedStackImpl(ll);
		
		for (int i = 0; i < 10; i++) {
			isi.push(i);
		}
		System.out.println(isi.toString());
		System.out.println(isi.size());
		
		
		isi2 = isi.reverse();
		
		System.out.println(isi.toString());
		System.out.println(isi2.toString());
		
		ro = isi.pop();
		System.out.println(ro.getReturnValue());
		ro = isi2.pop();
		System.out.println(ro.getReturnValue());
		System.out.println(ro.getError());
		
		isi.push(0);
		isi.push(0);
		System.out.println("Original: " + isi.toString());
		System.out.println("Reverse: " + isi2.toString());		
		
		isi.remove(0);
		isi2.remove(0);
		System.out.println(isi.toString());	
		System.out.println(isi.size());
		isi.pop();
		isi.pop();
		isi.pop();
		isi.pop();
		isi.pop();
		System.out.println(isi.toString());
		ro = isi.top();
		System.out.println(ro.getReturnValue());
		System.out.println(ro.getError());
		System.out.println(ro.hasError());
		for (int i = 0; i < 10; i++) {
			isi.push("x");
		}
		System.out.println(isi.toString());
		isi.remove("x");
		System.out.println(isi.toString());
		isi.remove(3);
		isi.remove(2);
		isi.remove(1);
		isi.remove(0);
		System.out.println(isi.toString());
		System.out.println(isi.size());
		isi2 = isi.reverse();
		System.out.println(isi2.toString());
		System.out.println(isi2.size());
		System.out.println(isi2.isEmpty());
		ro = isi2.top();
		System.out.println(ro.getReturnValue());
		System.out.println(ro.getError());
		System.out.println(ro.hasError());
		
	}
}