class vowel{
public static void main (String[] args)
{
  String sentence = " Drink cola";
  int count = 0;

  for (int i=0; i<sentence.length(); i++)
     { char ch = sentence.charAt(i);
      if ( ch == 'a')
      {
		count++;
      }
      else if ( ch == 'i')
      { 
		count++;
      }
      else if ( ch == 'u')
      { 
		count++;
      }
	  else if ( ch == 'e')
      { 
		count++;
      }
	  else if ( ch == 'o')
      { 
		count++;
      }
}
System.out.print("Number of vowels : " + count);
}
}