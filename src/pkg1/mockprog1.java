package pkg1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class mockprog1 {

	public static void main(String[] args) {
	int a[]={10,50,40,80,90,120};
	System.out.println("Given No is"+Arrays.toString(a));
	int max=a[0];
    for (int i=0;i<a.length;i++)
    {
    	if(max <a[i])
    	{
    		max=a[i];
    		
   
    	}
    }
	
	System.out.println(" max no is  " +max);
	
	}

}
