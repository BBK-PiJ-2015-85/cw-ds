public class FunctionalArrayListTest {
	public static void main(String[] args) {
		FunctionalArrayList fal = new FunctionalArrayList();
		System.out.println();
		
		ReturnObject ro = fal.head();
		System.out.println(ro.getReturnValue());
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		
		System.out.println("*****");
		
		for (int i = 0; i < 5; i++) {
			fal.add(i);
		}
		fal.printList();		
		ro = fal.head();
		System.out.println(ro.getReturnValue());
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		
		System.out.println("*****");
		
		for (int i = 4; i >= 0; i--) {
			fal.remove(i);
		}
		fal.printList();
		
		System.out.println("*****");
		
		FunctionalList fl = fal.rest();
		fl.add("x");
		((FunctionalArrayList)fl).printList();
		fl.add(0, "start");
		fl.remove(1);
		System.out.println("*****");
		((FunctionalArrayList)fl).printList();
		System.out.println(fl.isEmpty());
		System.out.println(fl.size());
		System.out.println(fl.get(0));
		
		//FunctionalArrayList flPrint = (FunctionalArrayList) fl;
		//flPrint.printList();	
		
		System.out.println("*****");
		
		fal.printList();
	}
}