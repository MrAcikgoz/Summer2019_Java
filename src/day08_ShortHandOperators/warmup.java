package day08_ShortHandOperators;

public class warmup {

	public static void main(String[] args) {
		// converting liters to gallons and the other way around.
		int gallons = 200;
		
		double liters = gallons * 3.785;
		System.out.println(liters);
		
		System.out.println(gallons +" gallons equals to " +liters+ " liters");
		
		double litersX = 100;
		double gallonsX = litersX / 3.785;
		
		System.out.println(litersX +" liters equals to "+gallonsX+ " gallons");
		
		
		
		
		// TASK 1 from yesterday
		
		int x = 2;
		int y = x++; // y = 2; x = 3
		// post: pass the  current value and then increases the value by one
		
		System.out.println(y+" "+x);
		
		
		
		int x2 = 2;
		
		System.out.println(x2++);  // it will pass the current value 2 
		System.out.println(x2); // then it will become three
		
		
		int x3 = 2;
		System.out.println(--x3); // pre ones decreases the value immediately
		
		
		int x4 = 8;
		int y4 = x4--;
		
		System.out.println(y4);
		System.out.println(x4);
		
		
		
		
		
		
	}
}
