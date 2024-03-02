package prasad;


public class Reversewordsinstring1 {

	public static void main(String[] args)
	{
		String input = "Hello World Java";
		
		Reversewordsinstring1 rst = new Reversewordsinstring1();
		
		String reversed = rst.reversestring(input);
		
		System.out.println(reversed);
		

	}
	
	public String reversestring(String str)
	{
		String[] words = str.split(" ");
		
		StringBuilder reversestring = new StringBuilder();
		
		for(int i =words.length; i>=0; i--)
		{
			reversestring.append(words[i]).append(" ");
			
			if(i != 0)
			{
				reversestring.append(" ");
			}
		}
		return str;
		
	}

}
