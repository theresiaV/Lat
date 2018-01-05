class futureInvesment {
	public static void main (String[] args)
	{
		double invesment = 1000;
		double rate = 10;
		int year = 5;
		double inves = 0;
		
		System.out.print(" Year FutureValue");
		
		rate = rate/100;
		
		for (int i = 0; i<=year; i++)
		{
		    inves = invesment*(Math.pow((1+(rate/12)),(12*i)));
			System.out.println("\n" + i + "  " + inves);
		}
	}
}