package day03_Variables;

public class PrimitiveDataTypes {

	public static void main(String[] args) {

		/* 
		 byte: we can assign whole numbers. The numbers you assign must be between -128 <= byte <= 127  
		 otherwise it will give compile error.
		 
		 short: we can assign only whole number. The range is  -32,768 <= short <= 32,767
		 
		 int : Only WHOLE numbers. The range must be -2147483648 <= int <= 2147483647  , int is the most commonly used one
		 
		 long: Only WHOLE numbers.  -9223372036854775808 <=  long  <= 9223372036854775807
		 
		 byte < short < int < long
		 
		 float < double
		 
		 small one can be assigned to larger one
		 
		 float: we assign only decimals, you need to give f letter a the end, lower case or upper case doesn't matter.
		 
		 double:  used more often. we can assign decimals.
		 
		 *** the variables data types must be larger in order to contain another datatype.
		 
		 *** byte short int long can be assigned as double or float
	
		 */
		
		byte length = 3 ;
		
		System.out.println(length);
		 
		byte width = 4 ;
		System.out.println(width);
		// byte 9num=100; variables names must start with a~z, or A~Z
		
		// variable names 
		
		byte num_and$ = 90;  
		
		byte length1 = 22;  // this variable name is not unique that is why it has compile error, the red line under length.
		
		//byte length =6; variable names MUST be unique
		
		
		byte public22 = 90;
		byte Public = 91;
		/*Some words are RESERVED by JAVA and they can't be declared as variable names, such as "public"
		but since JAVA is case sensitive you can use Capitalization on letters and use the RESERVED words as a variable name.
		*/
		
		byte myNum1 = 19 ; // it gives compile error because it is out of the range it should be.
		byte myNum2 = 127;  
		byte myNum3 = -128;
		
		
		short myNum4 = 77 ; // Since we can assign only WHOLE number, it gives compile error.
		short myNum5 = 333 ; // this is good
		short myNum6= -32768 ; // this is good 
		
		int myNum7 = 4343533 ; // this is good, int has a large range
		
		int myNum8 = 1_000_000_000 ; // when you write large numbers use underscore so it is much more readable, IMPORTAN !!!
									 // for the values only underscore not the $ sign, under score is like a comma in accounting
		
		long myNum9 = 10 ;
		long myNum11 = 10L ;  //  you can use letter "L" or "l" at the end it is accepted only in long, 
							  //  when there is L at the end you understand the variable only belongs long
		int myNum10 = 10; // it will give compile error if you at L at the end of int
		
		byte bNum = 10;
		short sNum = 20;
		int iNum= 30;
		long lNum =40;
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println("=====================================================");
		
		float fNum = bNum ;
		float fNum2 = sNum;
		float fNum3 = iNum;
		float fNum4 = lNum;
		System.out.println(fNum);
		System.out.println(fNum2);
		System.out.println(fNum3);
		System.out.println(fNum3);
		
		// we can also assign all above variables to double since double > float
		
		
		
		
		
		
		
		
	}
	
}
