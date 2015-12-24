public class LinkedListTest {
	public static void main(String[] args) {
		List ll = new LinkedList();
		LinkedList llprint = (LinkedList) ll;
		
		
		
		
		System.out.println("Is Empty: " + ll.isEmpty());
		for (int i = 0; i < 1000000; i++) {
			ll.add(i);
		}	
		
		for (int i = 999999; i > 999000; i--) {
			ll.add(i, 0);
		}
		
		/**
		System.out.println(llprint.toString());		
		System.out.println("Is Empty: " + ll.isEmpty());
		System.out.println("Size: " + ll.size());
		System.out.println("*****");
		ll.add(4, "x");
		System.out.println(llprint.toString());
		System.out.println("Size: " + ll.size());
		System.out.println("*****");
		ll.remove(0);
		System.out.println(llprint.toString());
		System.out.println("Size: " + ll.size());
		System.out.println("*****");
		ll.add(0, "start");
		System.out.println(llprint.toString());
		System.out.println("Size: " + ll.size());
		System.out.println("*****");
		ll.remove(5);
		System.out.println(llprint.toString());
		System.out.println("Size: " + ll.size());
		System.out.println("*****");
		ll.remove(3);
		System.out.println(llprint.toString());
		System.out.println("Size: " + ll.size());
		System.out.println("*****");
		ll.add("k");
		System.out.println(llprint.toString());
		System.out.println("Size: " + ll.size());
		System.out.println("*****");
		
		
		for (int i = 4; i >= 0; i--) {
			ll.remove(i);
		}
		System.out.println(llprint.toString());
		System.out.println("Size: " + ll.size());
		System.out.println("*****");
		
		ll.add(0);
		ll.add(0, 1);
		
		System.out.println(llprint.toString());
		System.out.println("Size: " + ll.size());
		System.out.println("*****");
		
		ReturnObject ro = ll.add(2, 2);
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		/**
		ReturnObject ro = ll.remove(0);
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		
		
		System.out.println(llprint.toString());		
		
		/**	
		ro = ll.get(0);
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		
		ro = ll.get(1);
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		ro = ll.get(2);
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		ro = ll.get(3);
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		
		
		System.out.println(llprint.toString());
		ro = ll.add(5, "x");
		if (ro.hasError()) {
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		
		ro = ll.add(4, null);
		if (ro.hasError()) {
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		
		ro = ll.get(5);
		if (ro.hasError()) {
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		
		ro = ll.get(6);
		if (ro.hasError()) {
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}		
		
		
		
		ll.remove(1);
		System.out.println(llprint.toString());
		ll.remove(0);
		System.out.println(llprint.toString());
		ll.remove(7);
		System.out.println(llprint.toString());
		ll.remove(1);
		System.out.println(llprint.toString());
		ll.remove(1);
		System.out.println(llprint.toString());
		ll.remove(3);
		System.out.println(llprint.toString());
		ll.remove(2);
		System.out.println(llprint.toString());
		ll.remove(0);
		System.out.println(llprint.toString());
		ll.remove(1);
		System.out.println(llprint.toString());
		ll.remove(0);
		System.out.println(llprint.toString());
		System.out.println(ll.isEmpty());
		System.out.println(ll.size());
		
		
		
		for (int i = 0; i < 1000000; i++) {
			ll.add(i);
		}
		
		ro = ll.add("x");
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println(ro.hasError());
		
		ro = ll.get(0);
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
		
		ro = ll.remove(999999);
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println(ro.hasError());
		
		ro = ll.remove(999998);
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println(ro.hasError());
		
		ro = ll.remove(999997);
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println(ro.hasError());
		
		ro = ll.remove(999996);
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println(ro.hasError());
		
		ro = ll.remove(999995);
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println(ro.hasError());
		
		ro = ll.remove(999994);
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println(ro.hasError());
		
		ro = ll.remove(999993);
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println(ro.hasError());
		
		ro = ll.add(0, "v");
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println(ro.hasError());
		
		ro = ll.add(999990, "k");
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println(ro.hasError());
		
		ro = ll.get(999990);
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println(ro.hasError());
		*/
	}
}