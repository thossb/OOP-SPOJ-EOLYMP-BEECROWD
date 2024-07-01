// File : Jokes.java

public class Jokes 
{
	/*
        Timothy Hosia Budianto
        5025211098
        PBO E

		declare global string variable joke_string
		in main assign string to joke_string
		then call function is_funny and/or first_word
		the is_funny function will check, if the inputed string is under 20 word it  fill print its funny else it will print not funny using if-else method
		the first_word function wil return the first word of the string
	 */

	private static String joke_string; 
	
	public static void is_funny()
	{
		String str = joke_string;
		
		int count = str.length();
		
		if(count < 20) {
			System.out.println("It's funny");
		}else {
			System.out.println("It's not funny");
		}				
	}

	public static void first_word() 
	{
		String str = joke_string; String text = null;
		
		int index = str.indexOf(' ');
		
		text = str.substring(0,index).trim(); 

		System.out.println(text);
		
	}

	public static void main(String[] args) 
	{
	joke_string = "Knock knock who’s there?";
	is_funny();
	first_word();
	
	joke_string = "Your life";
	is_funny();
	first_word();
	}
}
