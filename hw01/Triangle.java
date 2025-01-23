/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int sum1 = a + b;
		int sum2 = b + c;
		int sum3 = c + a;
		if ((sum1>c)&&(sum2>a)&&(sum3>b)){
			System.out.println(a + ", " + b + ", " + c + ": true");
		}
		else{
			System.out.println(a + ", " + b + ", " + c + ": false");
		}
		// Put your code here	
	}
}
