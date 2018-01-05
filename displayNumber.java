/*Display the number */

class displayNumber{
	public static void main (String[] args){
		int hasil = 0;
		int awal;
		
		System.out.print ("Output : ");
		
		for (awal = 200; awal<=250;awal++){
			hasil = awal + 3;
			if (hasil%4 == 0) {
			System.out.print(hasil + " ");
		}
		}
	}
}