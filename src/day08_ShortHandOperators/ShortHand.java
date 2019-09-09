package day08_ShortHandOperators;

public class ShortHand {

	public static void main(String[] args) {
		
		/*
		 +=  :  addition assignment     x+=y   ==> x=x+y
		 -=  :  substraction    x-=y  ==> x=x-y;
		 *=  :  multiplication   x*=y  ==> x=x*y
		 /=  :  division
		 %=  :  remainder    x %= y   ==> x = x%y;
		  
		  
		  
		  
		 */
		
		
		int a = 9;
		//   a = a+3;  //12
		     a += 3; // a = a+3 
		    System.out.println(a);
		
		
		int b = a += 5 ;   // a= 17
		System.out.println(b);
		
		
		int c = a += b;   // a = 34, c=34, b=17
		System.out.println(c);
		
		
		int d = a += c; // a = 68, d = 68, c = 34,  b = 17
		System.out.println(d);
		
		
		int e  = (d += b) * 2;
		System.out.println(e);
		
		// d = 85, b=17, e=170, c=34
		
		
		
// -= :
		
		
		int g = 101;
		
		int h = g -= 1;
		//  101 -=1 ==> 100
		System.out.println(h);
		
		
		int i = g+=h+5;     // g =205, i=205, h=100;
		
		//      100+=100 + 5 ==> 205
		System.out.println(i);
		
		
		int j = h+= g % i ;  // h = 100, j=100
		System.out.println(j);
		
		
		
		int k = j -= h * 2 % 5;  // j = 100
		System.out.println(k);
		
		
		// *= :
		int A = 100;
		A *= 200; // A = A*200
		System.out.println(A);   // A = 20000;
		
		int B = 100; 
		    B *= 100 / 10 ;   // B *= 100 / 10
		    System.out.println(B);
		    
		    
		    B *= B - 1000 ;
		    //  B *= (1000 -1000) = 0
		    System.out.println(B);
		    
		    
		
		    
	//  /= :
		    
		    
		    int C = 1000;
		        C /= 5 ;
		        
		        System.out.println(C);
		        
		        
		    int D = 10;
		    
		    // C /= D-10 ;  denominator can't be zero so this will give error
		    System.out.println(C);
		    
		    C /= D+10;  // C/20  ==> 200/20 = 10
		System.out.println(C);
		
		
	// %= :
		
		
		
		int z = 10%2 ;
				System.out.println(z);
		
				
		int Z = 10%3;
		
		int E = 10;
		
		E %= 2; 
		
		System.out.println(E);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
