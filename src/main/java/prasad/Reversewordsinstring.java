package prasad;

public class Reversewordsinstring {

	public static void main(String[] args)
	{
		String input ="Reverse String Words";
		
		String arrstr[] = input.split(input);
		
		String reversestring = "";
		
		for(int i=0;i<arrstr.length;i++)
		{
			reversestring += arrstr[i] + "";
		}
		
		System.out.println(reversestring);
		

	}

}
