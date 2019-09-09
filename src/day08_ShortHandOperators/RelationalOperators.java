package day08_ShortHandOperators;

public class RelationalOperators {

	public static void main(String[] args) {
		
		/*
		 Relational Operators: return boolean expression
		 
		  	>  : greater than
		  	>= : greater than or equal
		  	<  : less than
		  	<= : less than or equal
		  	== : equel
		  	=  : assign
		  	!= : not equal
		  	!  : Exclamation point java means the logical opposite
		 	
		 */
		
		System.out.println( 10 > 9); 
		
		boolean resultA = 10 > 9 ;
		System.out.println(resultA);
		
		System.out.println( 10 >= 9 );
		boolean resultB = 10 >= 9;
		System.out.println(resultB);
		
		
		
		boolean resultC =  10 <= 9 ;
		System.out.println(resultC);
		
		boolean resultD = 1100 < 1200 ;
		System.out.println(resultD);
		
		
		
		boolean resultE = 1000 <= 1000;
		System.out.println(resultE);
		
		boolean resultE1 = 1000 < 1000;
		System.out.println(resultE1);
		
		
		
		// ==
		
		boolean resultG = 19 == 19;  //equal
		System.out.println(resultG);
		
		
		// !
		
		boolean resultH = 20 != 20;
		System.out.println(resultH);
		
		
		boolean A = ! false; // true
		System.out.println(A);
		
		boolean B = ! true ; // false
		System.out.println(B);
		
		
		/*
		 in java:
		 	
		 	true == true,  false == false
		 	!false equal to true, !true equal to false
		 	so therefore :
		 		!false does not equal !true
		 		and
		 		true  equals !false.
		 
		 */
	
		boolean C = !false != ! true;
		System.out.println(C);
		
		boolean D = true == !false ;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
