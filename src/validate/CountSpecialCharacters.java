package validate;

public class CountSpecialCharacters 
{

	public static void main(String[] args) 
	{
		String string = "Spring ToolSuite!@#^&%^";
		int count = 0;
		
		for(int i = 0; i<string.length(); i++)
		{
			if(!Character.isDigit(string.charAt(i)) && !Character.isLetter(string.charAt(i)) && !Character.isWhitespace(string.charAt(i)))
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("There are no special characters");
		}
		else
		{
			System.out.println("Total number of sepecial characters: "+count);
		}
	}
}
