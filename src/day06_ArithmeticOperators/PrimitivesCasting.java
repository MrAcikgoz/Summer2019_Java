package day06_ArithmeticOperators;

public class PrimitivesCasting {
		
	/*
	   casting: converting larger primitives to smaller size
	   			dataype variablename  = (datatype) value
	   
	   			Two types of casting Explicit and Implicit
	   
	   primitives: byte, short, int, long, float, double
	   
	 */
		
	public static void main(String[] args) {
		int a = 10;
		byte b = (byte) a;  //explicit casting : larger to smaller
		
		int x = 128; 	    // make sure it fits to range when you convert it, otherwise it will gie negative
		byte z = (byte) x;
		
		System.out.println(b);
		System.out.println(z);
		
		double DecimalNumber = 10.5 ; 
		float  FloatNumber = (int) DecimalNumber;  //double>float
		
		System.out.println(FloatNumber);
		
		long LongNumber = 300L;
		int IntNumber	= (int)LongNumber;
		
		System.out.println( IntNumber );
		
		// implicit casting : smaller to larger
		
		byte ByteNum = 100;
		int IntNum2 = ByteNum;
		// same with:
		int IntNum3 = (int) ByteNum;
		
		
		short ShortNum = 100;
			long LongNum2 = ShortNum;
			//same with:
			long LongNum25 = (long) ShortNum;
			System.out.println(LongNum25);
			
			// explicit casting practices:
			
double LargestNumber = 100.8765; 
			
			byte ByteValue = (byte) LargestNumber;
			//						100	 
			
			float FloatValue = (float) LargestNumber;
			//						100.8765F
			
			float FloatValue2 = (int) LargestNumber;
			float FloatValue3 = (byte) LargestNumber;  
			//							100.0
			
			float FloatValue4 = (short) LargestNumber;
			float FloatValue5 = (long) LargestNumber;
			
			
			System.out.println(FloatValue);  // 100.8765
			
			
		float FloatNumber2 = 500.67F;
		
		int myNumber =  (short) FloatNumber2 ;
					
		System.out.println( myNumber );
		
		
		
		int Num1=100;
		int Num2 =200;
		int Num3 =300;
	
		
		int num1 = 100 , num2 =200 , num3= 300;	
		
		System.out.println(num1 +"\t" +num2+"\t"+num3);
		
		boolean result;
	//	System.out.println( result ); // LOCAL VARIABLES MUST BE INITIALIZED
			
		char Character1 = 'A' ;
		System.out.println( Character1 );
		
		
		
		boolean result1 ,
				result2, 
				result3 ;
		
		
		// System.out.println(result1);
		
		
		
		
		
		
		
		int outcome = 12+6/3;
		System.out.println(outcome);
		
		int outcome2 = 3*45+8;
		System.out.println(outcome2);
		
		
		
		
		
		
		
		
		
		

	}

}
