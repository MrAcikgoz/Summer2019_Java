package day03_Variables;

public class EscapeSequences {

		/*
		  \n or \r: starts from a new line NEWLINE
		  
		  \t : Horizontal Tab
		  \\: prints one backslash
		  \': prints a single quote
		  \": prints double quote
		  
		 
		*/
	
	
	public static void main(String[] args) {
		System.out.println("Hello Cybertek Batch 12 students!");
		System.out.println("\t\t\t\tHello Cybertek \nBatch 12 students!\n");
		
		
		System.out.print("Tomorrow is off");
		System.out.print("True");
		System.out.print("False\n");
		
		System.out.print("Tomorrow is off\n");
		System.out.println("True\n\r\r\n");
		System.out.println("False");
		System.out.print("\\");
		System.out.print("\\BAYEZID");
		
	}

}
