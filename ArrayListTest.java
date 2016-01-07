public class ArrayListTest {
	public static void main(String[] args) {
		
		List al = new ArrayList();
		
		
		System.out.println();
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		ReturnObject ro = al.remove(0);
		if (ro.hasError()){
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		ro = al.add(null);
		if (ro.hasError()){
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		
		
		for (int i = 0; i < 5; i++) {
			al.add(i);
		} 
		System.out.println(al.toString());
		al.add(0, "x");
		System.out.println("adding x at position 0: " + al.toString());
		al.add(6, "y");
		System.out.println("attempted to insert y at end: " + al.toString());
		al.add(3, "z");
		System.out.println("adding z at position 3: " + al.toString());
		al.remove(3);
		System.out.println(al.toString());
		al.remove(2);
		System.out.println(al.toString());
		al.remove(4);
		System.out.println(al.toString());
		al.remove(1);
		System.out.println(al.toString());
		al.remove(0);
		System.out.println(al.toString());
		al.remove(1);
		System.out.println(al.toString());
		al.remove(0);
		System.out.println(al.toString());
		al.remove(0);
		System.out.println(al.toString());
		
		
		
		for (int i = 0; i < 1000000; i++) {
			al.add(i);
		}
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		System.out.println("******");
		
		
		ro = al.add(0, null);
		if (ro.hasError()){
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		
		
		
		ro = al.get(0);
		if (ro.hasError()){
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		ro = al.get(1);
		if (ro.hasError()){
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		ro = al.get(2);
		if (ro.hasError()){
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		ro = al.get(3);
		if (ro.hasError()){
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		ro = al.get(4);
		if (ro.hasError()){
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		ro = al.get(5);
		if (ro.hasError()){
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		ro = al.get(1000);
		if (ro.hasError()){
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		ro = al.get(-1);
		if (ro.hasError()){
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		
		ro = al.remove(0);
		if (ro.hasError()) {
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		ro = al.get(0);
		if (ro.hasError()){
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		System.out.println(al.size());
		
		
		ro = al.remove(6000);
		if (ro.hasError()) {
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		
		
		ro = al.get(6000);
		if (ro.hasError()){
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		System.out.println(al.size());
		ro = al.get(999998);
		if (ro.hasError()){
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		
		
		ro = al.add(0, "x");
		if (ro.hasError()){
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		
		ro = al.get(0);
		if (ro.hasError()){
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		ro = al.add(999998, "y");
		if (ro.hasError()){
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		ro = al.get(999998);
		if (ro.hasError()){
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		System.out.println(al.size());
		ro = al.add(1000000, "z");
		if (ro.hasError()){
			System.out.println(ro.getError());
		} else {
			System.out.println(ro.getReturnValue());
		}
		
	}
}