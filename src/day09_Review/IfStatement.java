package day09_Review;

public class IfStatement {

	public static void main(String[] args) {
		
		/*
		 
		 	if statements; 
		 			single if statement:
		 				
		 				if(boolean expression) {
		 				some codes to run
		 				}
		 
		 			if block only gets executed if the condition is true
		 
		 
		 
		 
		 */
		
		
		
		if(true) {
			System.out.println("Hello");
			System.out.println("Happy Friday");
			System.out.println("Tomorrow is day off");
			System.out.println("Class Starts on Monday");
		}
		
		
		
		int a = 1000; //1001
		
		if(true) {
		// 1000 == 1001  ==> false	
			a = 2000;
			System.out.println("a is increased");
			
			
		}
		
		System.out.println(a+"\n\n\n");
		
		
		int X =987654320 ;
		
		if ( X%2 ==0) {
			System.out.println(X);
			System.out.println(" it's an even number");
			
			
		}
		
		
		if ( X%2 !=0) {
			// false
			System.out.println(X);
			System.out.println(" it's an odd number");
			
		}
		
		
		//
		
		int Y = 2345678;
		
		if ( Y %5 == 0) {
			//
			System.out.println(" can be divided by 5");
		}
		
		if ( Y %5 != 0) {
			System.out.println(" can't be divided by 5");
			
			
		}
		
		
		String CEO = "Main Boss";
		String Kuzzat = "Main Boss";
		//true
		System.out.println(CEO == Kuzzat); 
		
		if( Kuzzat == CEO) {
			System.out.println("Greatest person in the world");
			System.out.println("First if block");
		}
		 
		if(Kuzzat != CEO) {
		// false
			System.out.println(" Greatest person in the world");
			System.out.println("Second if block");
		}
		
		
		
		double TotalNumber = 100;
		boolean Cybertek = true;
		boolean BestSchool = true;
		
		if( Cybertek == BestSchool) { 
			//true
			TotalNumber += 500;
		}
		
		if (Cybertek != BestSchool) {
			TotalNumber -= 50;
		}
		
		
		System.out.println(TotalNumber);
		
		
		
		/*
		 
		 1. declare a variale, and initialize user age
		 2. write a program if the user is eligible to vote for Donald Trump 
		 		vote age: 18
		
		 
		 */
		
		
		byte PersonAge = 78;
		byte VoteAge  = 18;
		
		if ( PersonAge >= VoteAge) {
			//true
			System.out.println("You are eligible to vote");
			System.out.println("Have fun with building the wall");
			System.out.println("MAGA");
	
		}
		
		
		if( PersonAge < VoteAge) {
			//false
			System.out.println("You are not eligibl to vote yet, please come back when you grow up!");
			
			
			
			
		}
		
		
	
		System.out.println("Hello World HOw are you");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
