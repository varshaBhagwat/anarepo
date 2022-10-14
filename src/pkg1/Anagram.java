package pkg1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s="royal";
		String s1="fuel";
		if((s.length()== s1.length()));
		{
		  char[] d= s.toCharArray();
		  Arrays.sort(d);
		  char[] d1= s1.toCharArray();
		  Arrays.sort(d1);
		  
		  if(Arrays.equals(d, d1))
		  {
			  System.out.println("it is anagram");
		  }
		  else
		  {
			  System.out.println("it is not anagram");
		  }
		}
		
		

	}

}
