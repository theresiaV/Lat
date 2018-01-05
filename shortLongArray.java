/*Shortest/Longest String from Array*/

class shortLongArray{
	public static void main (String[] args){
		String[] array = {"abcd","abc","de","hjjjj","g","wer"};
		
		int max = 0;
		String maxString = null;
		
		int min = 0;
		String minString = null;
		
		for (String s : array){
			if (s.length() > max){
				max = s.length();
				maxString = s;
			}
			else if (min < max){
				min = s.length();
				minString = s;
			}
		}
		
		System.out.format("The shortest array length is '%s'\n", minString);
		System.out.format("The longest array length is '%s'\n", maxString);
	}
}