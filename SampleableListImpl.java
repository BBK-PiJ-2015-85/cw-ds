public class SampleableListImpl extends ArrayList implements SampleableList {
	/**
	 * Returns a list containing the first, third, fifth...
	 * items of this list, or an empty list if the list is empty. 
	 * 
	 * @return a list containing the first, third, fifth... items of this list
	 */
	
	public SampleableList sample() {
		SampleableList sample = new SampleableListImpl();
		if (size() > 0) {
			for (int i = 0; i < size(); i++) {
				if (i % 2 == 0) {
					sample.add(getItem(i));
				}				
			}
		}		
		return sample;
	}
	
	
	public String toString() {
		String str = "";
		for (int i = 0; i < size(); i++) {
			str += getItem(i);
			if (i < size() - 1) {
				str += ", ";
			}
		}
		return str;
	}
	
}