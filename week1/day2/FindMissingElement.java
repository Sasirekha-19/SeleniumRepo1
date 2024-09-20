package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int a[] = {1,4,3,2,8,6,7};
		
		Arrays.sort(a);
		
		for (int i=a[0];i<a.length;i++) // or for(int i=0;i<a.length;i++)
	{
			int b=a[i]-1;
			
			if(i!=b)
			 {
				 System.out.println("missing element in array:" +b);
				 break;
			 }
				
				
		}
	}

}

