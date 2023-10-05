package validate;

public class SpecialCharactersRemoved
{

	public static void main(String[] args)
	{
		String string = "Spring Tool!@#$%";
		int count = 0;
		String SpecialCharactersRemoved = "";
		
		for(int i=0;i<string.length();i++)
		{
			if(!Character.isDigit(string.charAt(i)) && !Character.isLetter(string.charAt(i)) && !Character.isWhitespace(string.charAt(i)))
			{
				count++;
			}
			else
			{
				SpecialCharactersRemoved = SpecialCharactersRemoved + string.charAt(i);
			}
		}
		if(count==0)
		{
			System.out.println("There are no special characters");
		}
		else
		{
			System.out.println("total secial characters is "+count);
		}
		System.out.println(SpecialCharactersRemoved);
	}
}
