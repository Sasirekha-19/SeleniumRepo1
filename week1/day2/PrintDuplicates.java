package week1.day2;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		int[] num= {2,5,7,7,5,9,2,3};
		
		int length = num.length;
		System.out.println("length of the array:" +length);
        
		Arrays.sort(num);
		
		for (int i=0;i<num.length-1;i++) {
			
			if(num[i]==num[i+1]) {
				
				System.out.println("Duplicate Number is:" +num[i]);
			}
		}
		

	}

		
	}


