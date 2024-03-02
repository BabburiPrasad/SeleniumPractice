package prasad;

public class Stringreverse {

	public static void main(String[] args) 
	{
		String str = "String reversal using toCharArray";
		
		System.out.println(str.length());
		System.out.println();
		
		char[] arr = str.toCharArray();
		
		for(int i = 0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		
//		int n = arr.length;
//		System.out.println(n);
		
		System.out.println("Reverse String: ");
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.print(arr[j]);
		}

	}

}
