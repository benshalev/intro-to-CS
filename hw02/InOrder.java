/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here
		int num = 0;
		int num2 = 0;
		while (num2 <= num){
			System.out.print(num + " ");
			num2 = num;
			num = (int)((Math.random() * 10) + 1);
			
		}
		
		
		
	}
}
