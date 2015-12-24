public class ImprovedStackImplTest {
	public static void main(String[] args) {
		List list = new ArrayList();
		ImprovedStack isi = new ImprovedStackImpl(list);
		
		for (int i = 0; i < 1000000; i++) {
			isi.push(i);
		}
		//System.out.println(isi.toString());
		System.out.println(isi.size());
		
		
		ImprovedStack isi2 = isi.reverse();
		
		//System.out.println(isi.toString());
		//System.out.println(isi2.toString());
		
		ReturnObject ro = isi.pop();
		System.out.println(ro.getReturnValue());
		ro = isi2.pop();
		System.out.println(ro.getReturnValue());
		
		isi.push(0);
		isi.push(0);
		//System.out.println("Oroginal: " + isi.toString());
		//System.out.println("Reverse: " + isi2.toString());		
		
		isi.remove(0);
		//System.out.println(isi.toString());	
		System.out.println(isi.size());
	}
}