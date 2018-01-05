/* Follow Array*/
import java.util.Random;

class acak{
	public static void main (String[] args)
	{
		String[] color = new String[]{"white","green","red"};
		
		for (int i=0; i<3; i++)
		{
			Random ran = new Random();
			System.out.println(color[ran.nextInt(color.length)]);
		}
	}
}