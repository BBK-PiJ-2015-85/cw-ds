public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		System.out.println(ll.isEmpty());
		for (int i = 0; i < 1000000; i++) {
			ll.add(i);
		}
		System.out.println(ll.size());
		//ll.printList();
		ll.add("x");
		//ll.printList();
		ll.remove(1000000);
		
		ReturnObject ro = ll.get(1000000);
		if (ro.hasError()) {
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		ro = ll.get(999999);
		if (ro.hasError()) {
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		ro = ll.get(999998);
		if (ro.hasError()) {
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		
		
	}
}