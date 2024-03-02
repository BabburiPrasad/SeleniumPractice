package prasad;

public class MinandMaxelementinArray {

	public static void main(String[] args) 
	{
		
		int [] arr = {20,29,31,45,99,11};
		
		int min = arr[0];
		int max = arr[0];
		
		for (int i=1;i<arr.length; i++)
		{
			if(arr[i]>max)// 29>20, 31>20, 45>20, 99>20, 11>20
			{
				max = arr[i];
				
			}	
		}
		System.out.println("Max value"+max);

		for(int j =1; j<arr.length; j++)
		{
			if(arr[j]<min) //29<20, 31<20, 45<20, 99<20, 11<20
			{
				min = arr[j];
			}
		}
		System.out.println("Min value"+min);
	}

}
