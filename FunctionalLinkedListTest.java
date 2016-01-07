public class FunctionalLinkedListTest {
	public static void main(String[] args) {
		FunctionalLinkedList fll = new FunctionalLinkedList();
		
		ReturnObject ro = fll.head();
		System.out.println(ro.getReturnValue());
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		
		FunctionalList fl = fll.rest();
		System.out.println(fl.toString());
		fll.add(0);
		fl = fll.rest();
		System.out.println(fl.toString());
		fll.add(1);
		fl = fll.rest();
		System.out.println(fl.toString());
		
		
		for (int i = 0; i < 5; i++) {
			fll.add(i);
		}
		System.out.println(fll.toString());
		
		ro = fll.head();
		System.out.println(ro.getReturnValue());
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		
		System.out.println("*****");
		
		fl = fll.rest();
		System.out.println(fl.toString());
		fl.add("x");
		fl.add(0, "start");
		fl.remove(1);
		System.out.println(fl.isEmpty());
		System.out.println(fl.size());
		System.out.println(fl.toString());
		System.out.println(fll.toString());
		
		System.out.println("*****");
		
		for (int i = 4; i >= 0; i--) {
			fll.remove(i);
		}
		System.out.println(fll.toString());
		
		
		fl = fll.rest();
		System.out.println(fl.toString());
		fl.add("x");
		fl.add(0, "start");
		fl.remove(1);
		System.out.println(fl.isEmpty());
		System.out.println(fl.size());
		System.out.println(fl.toString());
		System.out.println(fll.toString());
		
		System.out.println(((FunctionalLinkedList)fl).getItem(0));
		
		ro = fl.head();
		System.out.println(ro.getReturnValue());
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		
		for (int i = 0; i < 5; i++) {
			fll.add(i);
		}
		System.out.println(fll.toString());
		
		List test = fll.rest();
		System.out.println(test.toString());
		
	}
}