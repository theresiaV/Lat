/*Display String*/

class displayArray{
	static String ketemuC;
	
	public static String ketemuColor(String ketemuC){
		String color[] = {"white","green","red"};
		String sentence = "The memory of that scene for me is like a frame of film forever frozen at that moment: the red carpet, the green lawn, the white house, the leaden sky. The new president and his first lady. -Richard M. Nixon";
		
		int idx;
		boolean ketemu = true;
		int i =0;
		
		while (i<sentence.length()-color.length &&!ketemu)
		{
			int j =1;
			while (j<color.length&&(color[j].equals(sentence.charAt(i+j)))){
				j = j+i;
				System.out.print(color[i] + "\n");
			}
				if (j == color.length){
				  ketemu = true;
				}
				else i = i+1;
		}
		if (ketemu)
		{
			idx = i+1;
		}
		return ketemuC;
	}
	
	public static void main (String[] args)
	{
		ketemuC = ketemuColor(ketemuC);
		System.out.println("The Word: " + ketemuC);
	}
}