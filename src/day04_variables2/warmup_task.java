package day04_variables2;

public class warmup_task {
	/*
	 1. Cucumber = 2.5
	 2. Tomato = 3
	 3. Onion = 1.5
	 4. Green Pepper = 2
	 5. Carrot = 4
	  
	  
	 */
	
	public static void main(String[] args) {
		
		//Cucumber: 2.5
		
		//  int Cucumber = 2.5; will give compile error because 
		//  the price has decimal so we need to assign it to double or float
		
		float Cucumberx = 2.5F ;		// float cannot contain float
		double Cucumber2 = 2.5f ;  // double can contain float 
		double Cucumber3 = 2.5 ;
		System.out.println(Cucumberx);
		System.out.println(Cucumber2);
		System.out.println(Cucumber3 );
		// Onion : 1.5
		
		float Onionx = 1.5f ;
		double Onion2 = 1.5 ;
		System.out.println(Onionx);
		System.out.println(Onion2);
		//GreenPepper : 2
		
		byte GP =  2 ;
		short GP1 = 2 ;
		int GP2 = 2 ;
		long GP3 = 2L ;
		float GP4 = 2 ; // only time we add f letter is when assigning decimals
		double GP5 = 2 ;
		

		System.out.println(GP);
		System.out.println(GP1);
		System.out.println(GP2);
		System.out.println(GP3);
		System.out.println(GP4);
		System.out.println(GP5);
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		
		double Cucumber = 2.5;
		int Tomatoes = 3;
		float Onion = 1.5f; 
		byte GreenPepper = 2;
		short Carrot = 4;
		
		System.out.print("1 Cucumber is "); System.out.print(Cucumber); System.out.println(" dollars");
		System.out.print("4 Tomatoes are "); System.out.print(Tomatoes * 4);System.out.println(" dollars");
		System.out.print("2 Onion ");System.out.println("3 dollars");
		System.out.print("1 Green Pepper is ");System.out.print(GreenPepper);System.out.println(" dollars");
		System.out.print("6 Carrots ");System.out.print(Carrot * 6);System.out.println(" dollars");
		
		
		
		
		
		
		
		
		
	}
}
