/*Five High, five lowest & Average*/

class temperatur{
	public static void main (String[] args){
		int[] suhu = {78,60,62,68,71,68,73,85,66,64,76,63,75,76,73,68,62,73,72,65,74,62,62,65,64,68,73,75,79,73};
		int i =0;
		int jum=0;
		int rata,max,min;
		
		max = suhu[i];
		min = suhu[i];
		
		for (i=0; i<=suhu.length; i++){
			if (max<suhu[i]){
				max = suhu[i];
				
				if (min>suhu[i]){
					min = suhu[i];
				}
				System.out.println(i+ " "+suhu[i]);
				jum+=suhu[i];
			}
			rata = jum/i;
			
			System.out.println("Avarange : " +rata);
			System.out.println("The highest : " +max);
			System.out.println("The lowest : " +min);
		}
	}
}