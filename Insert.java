/* New Item in Array*/
import java.util.*;

class nuNew {
	public static void main (String[] args){
		String number[] = {"1","2","3","4","5"};
		int position = 2;
		char sisipan = '$';
		
		for (int i=number.length-1; i>position; i--){
		   number[i] = number[i-1];		   
		}
		number[position] = String.valueOf(sisipan);
		
		System.out.println("After inserting '$' the array is : " + Arrays.toString(number));
	}
}