public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		System.out.println(ll.isEmpty());
		for (int i = 0; i < 10; i++) {
			ll.add(i);
		}
		System.out.println(ll.size());
		ll.printList();
		
		//ll.printList();
		ReturnObject ro = ll.get(0);
		if (ro.hasError()) {
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		ll.remove(1);
		ll.printList();
		ll.remove(0);
		ll.printList();
		ll.remove(7);
		ll.printList();
		ll.remove(0);
		ll.printList();
		ll.remove(4);
		ll.printList();
		ll.remove(3);
		ll.printList();
		ll.remove(2);
		ll.printList();
		ll.remove(0);
		ll.printList();
		ll.remove(1);
		ll.printList();
		ll.remove(0);
		ll.printList();
		System.out.println(ll.isEmpty());
		System.out.println(ll.size());
		
		ro = ll.get(0);
		if (ro.hasError()) {
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		/**
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
		*/
		
	}
}