package prasad;

public class SplitStringintoWords {

	public static void main(String[] args) 
	{
		String str = "I want to walk my dog";
		
		String[] sword = str.split(" ");
		
//		for(String words : sword)
//		{
//			System.out.print(words);
//			System.out.print(" ");
//		}
		System.out.println("Reverse word string: ");
		for(int i=sword.length-1;i>=0;i--)
		{
			System.out.print(sword[i]);
			System.out.print(" ");
		}
	
		
		

	}

}
