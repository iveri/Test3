package BubleSort;

import java.util.Random;

public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int numbers[] = new int[10];
		int temp = 0;
		
		Random rnd = new Random();
		
		System.out.println("------------------Before-----------------");
		for(int j=0; j<numbers.length; j++)
		{
			numbers[j]=rnd.nextInt(100);
			System.out.println(numbers[j]);
		}
		
		for(int i = 0; i<numbers.length; i++)
		{
			for(int k = i+1; k<numbers.length; k++ )
			{
				if(numbers[i]>numbers[k])
				{
					temp = numbers[i];
					numbers[i] = numbers[k];
					numbers[k] = temp;
				}
			}
		}
		System.out.println("------------------Before-----------------");
		//Use foreach as an alternative for loop to display
		for(int num : numbers)
		{
			System.out.println(num);
		}
		
		
		
	}

}
