package day04_variables2;

public class PrimitiveDataTypes2 {

	/* Primitives: byte, short, int, long, float, double, boolean, char
	 
	  boolean: it can be assigned only true or false expression
	  **anything that can return either true or false, can be initialized to boolean
	  
	  char: declared within the single quote ' ' ; and takes single character only
	  		or you can use the number code from ASCII table without using single quotes
	  		This also means char values come from ASCII table
	  	
	  	*** char value can be assigned to byte, short, int, long, float, double
	  	   byte a = 'a' ;
	  	   short b = 'b' ;
	  	   int c = 'c' ;
	  	   long d = 'd' ;
	  	   float f = 'f' ;
	  	   double e = 'e' ;
	  	   
	  	    results will be corresponding numbers of those characters from ASCII table
	   
	 */

	public static void main(String[] args) {
		
		boolean result = true;
		boolean result2 = false;
		boolean result3 = 9 > 3 ; 
		// boolean result4 = Earth is Flat   , doesn't work with boolean
		
		// boolean num1 = 100;  this wouldn't work either, boolean only takes true or false results.
				
		
		System.out.println(result);  //true
		System.out.println(result2); //false
		System.out.println(result3); //true
		
		// char: for char we can give only a single character!!!
		
		char character1 = 'a';
		System.out.println(character1);
		//  char char2 = "aa" ; wouldn't work because it has two characters between quotes. It MUST be a single character.
		
		char character2 = '9' ;
		char character3 = '#' ;
		
		System.out.print(character2);
		System.out.println(character3);
		
		
		char char4 = 65 ; // only time we use single quotes is when we are declaring a single character
						  // if we are using number from ASCII table we use the number without single quotes
		
		System.out.println(char4);  /* so in this case when you execute this code, 
									* it will give you A which is the equivelant of number 65 in ASCII table
									*/
		char char5 = 'A' ;
		System.out.println(char5);		
		
		
		char char6 = '{' ;  // you can either use curly bracket sign between single quotes
		char char7 = 123 ;	// or you can use the code from ASCII table 
		System.out.println(char6);
		System.out.println(char7);
		
		System.out.println("=============================================================");
		
		// initializing char to other primitives; char can e initialized to byte, short, int, long, float, double
		
		char char8 = 'z' ;  // this will give you the character z
		
		int myInt = 'z' ; // this will give you the number equavilant to z in ASCII table
		
		System.out.println(char8);
		System.out.println(myInt);
		
		// byte MyByte = myInt ;   this will give compile error because byte memory is < than char memory
		byte MyByte2 = 'z' ; // z is corresponding the number 122 which is in ASCII table
		System.out.println(MyByte2);
		
		// short ShortNum = char8; char's memory could be bigger than short, range is greater than short, thats why compile error
		short ShortNum2 = 'z' ; // z is corresponding to number 122 from ASCII table 
		System.out.println(ShortNum2);
		
		long LongNum = char8 ; // long's memory is 8 bytes which is larger than char
		long LongNum2 = 'z'	;  // 122 from ASCII table
		System.out.println(LongNum);
		System.out.println(LongNum2);
		
		
		float floatNum = MyByte2 ; 
		float floatNum2 = 'z'	;
		System.out.println(floatNum);  // will print 122.0
		System.out.println(floatNum2); // same
		
		double doubleNum = MyByte2 ;  
		double doubleNum2 = 'z' ;
		System.out.println(doubleNum); // will print 122.0
		System.out.println(doubleNum2); // same
		
		//  JAVA is case sensitive so  'A' doesn't equal to 'a'
		
		char my= 444;
		System.out.println(my); 
		
		

	}

}
