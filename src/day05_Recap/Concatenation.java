package day05_Recap;

public class Concatenation {

	public static void main(String[] args) {
		
		/*
		 String: It represents the sequences of characters, used for storing text.
		 
		 Concatenation: means combining, linking things together ==> creates a new String value
						+ operator is used for concatenation. We can concat any value to String
		 *
		 *
		 *
		 *
		 *
		 */
		
		String str = "any text goes here";
			System.out.println(str);
		
		String str2 = "1";
			System.out.println(str2);
		
		String str3 = "Hello World!";
			System.out.println(str3);
		
		String myName = "Cybertek" + "  " + "School";
			System.out.println(myName);
		
		String Year = "This is " +  2019;
			System.out.println(Year);
		
		// Example: 
			
		String name = "Bayezid";
			System.out.println(name);
			
			/*
			 cucumber is variable $
			 tomato is variablename $
			 
			 */
		int cucumber = 3; int tomato =5;
		System.out.println("Cucumber is " +cucumber+'$');
		System.out.println("Tomato is "+tomato+'$');
		
		String newStr ="100"+10;
			System.out.println(newStr); // 10010
			
			System.out.println( 1 + 2 + 3);   // will print as 6
			
			System.out.println("1"+2 +3);
			
		//	System.out.println("1"+1-3); // since it will be 11-3, it will not compile (compile error)
			
			System.out.println("Batch 12" + (1+2) );  // ==> Batch 123
			
			System.out.println( 1 + "123" + 4 + 5);  //  ==>112345
			
			System.out.println("123" + (4+5) ); //1239
			
			System.out.println(1 + ("1"+2) ); // 112
			
			
			System.out.println( 4 + 3 - (9+3) );
			
			

			String BookName = "I like to book called \'Sherlock Holmes\'." ;
			System.out.println(BookName);
			
			System.out.println( '3' +3); /* since first number between single quotes, it compile as a char value, 
											 ASCII table... so this one will come out as 54
										 */
			
			System.out.println("3" +3); // this will come out as 33 since the first number between double quotes
			
			System.out.println("3"+'3'); //if we concate char to String, char is concated as character
			
			System.out.println(12 + '3'); // if we concate char to number, representative number of char 
			
			System.out.println('4');
			
		
			
			String p1 = "James";
		    String p2 = "Jill";
		    String p3 = "Bob";
		    String p4 = "Betty";
		    String p5 = "Herb";
		    
		    String p6 = p3 + "," + p2 + "," + p4 + "," + p5 + "," + p1 ;
		    System.out.println(p6);
		
		
	
		
		
		
		
		
		
		
		
		
	}
}
