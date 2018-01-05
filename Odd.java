class Odd
{
	public static void main (String[] args)
 {
	String number = "350";
	
	int position,length;
		
		if (number.length()%2 == 0)
		{
			position = number.length()/2-1;
			length = 2;
		}
		else {
			position = number.length()/2;
			length = 1;
		}
	System.out.print("The middle of character: " + number.substring(position,position+length) + "\n");
 }
 
    public 
}