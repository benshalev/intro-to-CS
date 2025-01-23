/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */


public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int x = ((int)(Math.random() * (b - a) + a));
		int y = ((int)(Math.random() * (b - a) + a));
		int z = ((int)(Math.random() * (b - a) + a));
		int min = Math.min(Math.min(x,y),z);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("The minimal generated number is " + min) ;	
	}
}
