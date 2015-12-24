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
		System.out.println(fal.toString());		
		ro = fal.head();
		System.out.println(ro.getReturnValue());
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		
		System.out.println("*****");
		
		for (int i = 4; i > 1; i--) {
			fal.remove(i);
		}
		System.out.println(fal.toString());
		
		System.out.println("*****");
		
		FunctionalList fl = fal.rest();
		fl.add("x");
		System.out.println(((FunctionalArrayList)fl).toString());
		fl.add(0, "start");
		fl.remove(1);
		System.out.println("*****");
		System.out.println(((FunctionalArrayList)fl).toString());
		System.out.println(fl.isEmpty());
		System.out.println(fl.size());
		System.out.println(fl.get(0));
		
			
		
		System.out.println("*****");
		
		System.out.println(fal.toString());
	}
}