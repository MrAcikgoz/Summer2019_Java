package day09_Review;

public class Review {
	public static void main(String[] args) {
		
		
		/*
		 relational operators:
		 
		 >  : greater  X=10 Y=9  it returns true only when x > y
		 >= : greater than or equal     it is true when  either greater or equal
		 <  : less than x=10 Y=9  it returns true only when x < y 
		 <= : less than or equal  true: either less or equal
		 == : equal 
		 != : not equal
		 
		 logical operators:
		 
		 && : true: if both conditions are true
		 || : true: as long as one condition is true
		 
		 
		 
		 */
		
		
		System.out.println('Z' > 'A');  // true
		
		System.out.println('Z' >= 'A'); //true
		
		System.out.println('a' > 'A'); // true  , it is also true >= 
		
		System.out.println('a' < 'A'); // false 
		
	
		char ch1 = 123 ;
		
		System.out.println(ch1);
		
		
		System.out.println( 'A' <= 'A'); // !false
		System.out.println( 'A' <= 'a'); // false
					//		65 <=  97
		
		System.out.println( false ==  false ); // true
		System.out.println( !(false != true) );  
		//					!true ==> false



		System.out.println( true == true  &&  false !=true );
		//					true       &&    true   ==> true

		System.out.println( true != true  ||  false == true );
		//						false      ||   false  ==> false

		System.out.println( "Monday" == "Funday" || true == !false);
		//			false            ||    true  ==> true






		/*
		byte X =10;  int Y = 10;
		System.out.println( X == Y  );  // for primitives, yes.
		*/
		
		
		
		
		
		
		
		
		
		
	}
}
