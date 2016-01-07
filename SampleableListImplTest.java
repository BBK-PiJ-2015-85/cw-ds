public class SampleableListImplTest {
	public static void main(String[] args) {
		System.out.println();
		
		SampleableList myList = new SampleableListImpl();
		System.out.println(myList.isEmpty());
		System.out.println(myList.size());
		
		for (int i = 0; i < 10; i++) {
			myList.add(i);
		}
		System.out.println(myList.toString());
		
		SampleableList sl = myList.sample();
		System.out.println(sl.toString());
		
		myList.add("x");
		sl.add("y");
		
		System.out.println("Original: " + myList.toString());
		System.out.println(myList.isEmpty());
		System.out.println(myList.size());
		System.out.println(sl.size());
		System.out.println("Sample copy: " + sl.toString());
		
		for (int i = 11; i >= 0; i--) {
			myList.remove(i);
		}
		
		sl = myList.sample();
		System.out.println("Original: " + myList.toString());
		
		System.out.println("Sample copy: " + sl.toString());
		
		sl.add(0, 0);
		System.out.println("Sample copy: " + sl.toString());
		
		sl.add(0);
		System.out.println("Sample copy: " + sl.toString());
		
		System.out.println();
		ReturnObject ro = sl.add(0, "x");
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println("Sample copy: " + sl.toString());
		System.out.println();
		ro = sl.add("y");
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println("Sample copy: " + sl.toString());
		System.out.println();
		ro = sl.add(1, "y");
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println("Sample copy: " + sl.toString());
		System.out.println();
		ro = sl.remove(0);
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println("Sample copy: " + sl.toString());
		System.out.println();
		ro = sl.get(0);
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println("Sample copy: " + sl.toString());
		System.out.println();
		ro = sl.get(100);
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println("Sample copy: " + sl.toString());
		System.out.println();
		ro = sl.remove(10);
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println("Sample copy: " + sl.toString());
		System.out.println();
		ro = sl.add(null);
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println("Sample copy: " + sl.toString());
		System.out.println();
		ro = sl.add(-1, 5);
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println("Sample copy: " + sl.toString());
		System.out.println();
		ro = sl.add(0, null);
		System.out.println(ro.hasError());
		System.out.println(ro.getError());
		System.out.println(ro.getReturnValue());
		System.out.println("Sample copy: " + sl.toString());
		
		myList.add("0");
		System.out.println("Original: " + myList.toString());
		myList = sl.sample();
		System.out.println("Original: " + myList.toString());
		
	}
}