package prasad;

import java.util.Scanner;

public class TakeArrayInputfromUser 
{
	
	public void buildArray()
	{
		
	}

	public static void main(String[] args) 
	{
		int arraysize;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array size: ");

		arraysize = sc.nextInt();

		int[] arr = new int[arraysize];

		System.out.println("Enter Array Elements: ");

		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("Array Elements are: ");
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(" "+arr[j]);
		}
		 sc.close();
	}

}
