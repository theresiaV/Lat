/*Uppercase & lowercase*/

class upperLower{
	public static void main (String[] args){
		String kalimat[] = {"green","RED","white"};
		String akal = " ";
		
		for (int i =0; i<kalimat.length;i++){
				akal = akal + kalimat[i];
		}
		
		System.out.println("Lower Case : " + akal.toLowerCase());
		System.out.println("\n" + "Upper Case : " + akal.toUpperCase());
	}

}