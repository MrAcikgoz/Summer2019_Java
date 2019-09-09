package day07_Unary_ShortHand;

public class UnaryOperators {

	public static void main(String[] args) {
		
		/*
		 
		 + : positive
		 - : negative
		 ++: increment
		 --: decrement
		
		 */
		
		int a = 10;
		int b = -10;
		System.out.println(b);

		
		int c = +b;  // +(-10)  ==>  - negative
		System.out.println(c);
		
		
		int d = -c;  //  - (-10) ==> + positive
		System.out.println(d);
		
		int f = - (10) ;
		System.out.println(f);
		
		
		//INCREMENT : increases the value by 1.
		
		//	1. pre increment: operator is placed before the variable;
		//  increase the value by 1 immediately
		
		int num1 = 100;
		
		System.out.println(++num1);   // num1 +1
		
		int num2 = ++num1;  // ++(101) ==> 102
		System.out.println(num2);
		
		// post increment: operator is placed after the variable. 
		// It will use the pass the current value first then it will be incremented by 1 
		
		
		int IntNum =100;
		
		System.out.println(IntNum);
		System.out.println(IntNum++);   // check out the result for these 3 lines
		System.out.println(IntNum);
		
		int IntNum2 = IntNum++ ;  // IntNum2 = 101
		
		
		System.out.println(IntNum2);
		System.out.println(IntNum);  //102
		System.out.println(IntNum2);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		
		int x = 100;
		int y = x++ - 1;
		//  y = 100 - 1;
		System.out.println(y);
	
		//DECREMENT : decrease the value by 1.
		
			// pre-decrement: operator is placed before the variable, decreases the value by 1 immediately
			// post-decrement: operator is placed after the variable, it will pass the current value first
			// then decrease the value by 1.
		
		
		int Z = 100;
		
		System.out.println( --Z );  // 99
		
		System.out.println(--Z); // 98
		
		
		System.out.println(Z--);
		System.out.println(Z);
		
		
		int P = 50;
		
		P = --P + P++ + P-- + P++;
		//  pre   post  post  post
		//  49    49    50    49
		
		System.out.println(P);
		
		
		
		short Snum = 4;
		int R = Snum * 4 - Snum-- ;
		//        16     -   4
		
		
		
		int w = 1;
		
		    w = -w-- + w++ / -w-- * --w ;
		//       post  post  post   pre
		    
		//      -1   + 0   / -1   *  -1  ;
		    
		    System.out.println(w);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
