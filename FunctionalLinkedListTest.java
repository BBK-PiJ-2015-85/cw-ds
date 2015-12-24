public class FunctionalLinkedListTest {
	public static void main(String[] args) {
		FunctionalLinkedList fll = new FunctionalLinkedList();
		
		ReturnObject ro = fll.head();
		System.out.println(ro.getReturnValue());
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		
		for (int i = 0; i < 5; i++) {
			fll.add(i);
		}
		fll.printList();
		
		ro = fll.head();
		System.out.println(ro.getReturnValue());
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		
		System.out.println("*****");
		
		FunctionalList fl = fll.rest();
		System.out.println(fl.toString());
		fl.add("x");
		fl.add(0, "start");
		fl.remove(1);
		System.out.println(fl.isEmpty());
		System.out.println(fl.size());
		((FunctionalLinkedList)fl).printList();
		fll.printList();
		
		System.out.println("*****");
		
		for (int i = 4; i >= 0; i--) {
			fll.remove(i);
		}
		fll.printList();
		
		
		fl = fll.rest();
		((FunctionalLinkedList)fl).printList();
		fl.add("x");
		fl.add(0, "start");
		fl.remove(1);
		System.out.println(fl.isEmpty());
		System.out.println(fl.size());
		((FunctionalLinkedList)fl).printList();
		fll.printList();
		
		System.out.println(((FunctionalLinkedList)fl).getItem(0));
		
		ro = fl.head();
		System.out.println(ro.getReturnValue());
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		
		for (int i = 0; i < 5; i++) {
			fll.add(i);
		}
		fll.printList();
		
		List test = fll.rest();
		((LinkedList)test).printList();
		
	}
}