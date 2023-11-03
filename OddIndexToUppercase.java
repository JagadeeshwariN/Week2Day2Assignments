package week2.day2.assignments;

public class OddIndexToUppercase {

	public static void main(String[] args) {

		String input ="changeme";
		char[] charArray = input.toCharArray();
		
		System.out.println("Character Length : " + charArray.length);
		System.out.print("Odd Index to Upper Case : ");
		
		for (int i=0 ; i<=charArray.length-1 ; i++)
		{
			if (i%2==1)
			{
				
				charArray[i] = Character.toUpperCase(charArray[i]);
				//System.out.print(charArray[i]);
			}
			System.out.print( charArray[i]);
		}
			
	}

}
