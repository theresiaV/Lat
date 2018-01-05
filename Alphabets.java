/* Menampilkan Karakter*/

class Alphabets
{
	public static void main (String args[])
	{ print_chars ('(','z',20);
	}
    
	public static void print_chars(char char1, char char2, int n)
	{
		for (int y=1; char1 <= char2; y++, char1++)
		{
			System.out.print(char1+ " ");
			if ( y%n == 0)
			{
				System.out.print("\n");
			}
		}
	}
}
