import java.util.HashSet;
import java.util.Random;

class randomNum{
 public static void main (String[] args){
	 Random ran = new Random();
	 int e;
	 int i;
	 int g =20;
	 HashSet<Integer> randomAngka = new HashSet<Integer>();
	 
	 for (i = 10; i <g; i++){
		 e = ran.nextInt(20);
		 randomAngka.add(e);
		 if (randomAngka.size() <= 20){
			 if (randomAngka.size() == 20){
			 g =20;
			 }
		 g++;
		 randomAngka.add(e);
		 }
	 }
	 System.out.println("Output : " +randomAngka);
 }
}