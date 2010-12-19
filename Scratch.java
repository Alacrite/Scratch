
public class Scratch 
{
	
	public static void main(String args[])
	{
		assert(isMadeOfUniqueCharacters("abcd") == true);
		assert(isMadeOfUniqueCharacters("abcdc") == false);
		
	}
	
	public static boolean isMadeOfUniqueCharacters(String text)
	{
		boolean[] characterMatch = new boolean[256];
		for(int i = 0; i < text.length(); i++)
		{
			if(characterMatch[text.charAt(i)] == true)
			{
				return false;
			}
			characterMatch[text.charAt(i)] = true;
				
		}
		
		return true;
		                                       
		
	}

}
