package day08_ShortHandOperators;

public class LogicalOperators {

	public static void main(String[] args) {
		
	/*
	  && : and logic  if both conditions are true, it is true.  true && true ==> true , otherwise  ==> false
	  || : or logic   true || false ==> true
	  				  true || true  ==> true
	  				  false|| false ==> false
	  				  false|| true  ==> true	
		
	 */
		
		
		boolean ResultA = 9 == 0 && "Muhtar" == "good";
		//					false    false   ==> true
		
		System.out.println(ResultA);
		
		
		boolean ResultB = 8>5 && 7 == (8-2+1);
		//				  true &&  true ==> true
		
		System.out.println(ResultB);
		
		
		boolean ResultC = !false !=true   &&  !false == !(!true);
		//				   true  !=true   && true ==> !false
		//						false  && true ==> false 
		
		System.out.println(ResultC);
		
		
		//  ||:
		
		boolean A = "Monday" == "Funday" ||  6 == 6 ;
		//                   false       ||    true   ==> true 
		System.out.println(A);
		
		
		boolean B = true || false  ; // ==> true
		System.out.println(B);

		
		boolean C = ! (8>5) || !("Today" != "Friday");
		//          !true  || !true      ==> false 
        //           false || false      
		System.out.println(C);
		
		
		boolean D = true && true || false ;
		//               true    || false
		System.out.println(D);
		
		
		
		boolean E = !(7>5 && 6 !=5) && ( 9>5  || 10>4);
		//          ! true          &&  true   ==> FALSE
		System.out.println(E);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
