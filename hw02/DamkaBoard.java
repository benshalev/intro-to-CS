/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int num = Integer.parseInt(args[0]);
		int numleft = num/2; 
		for (int i = 1; i<=num; i++ ){
			if (i % 2 == 1){
				for (int n = 1; n<= num; n++){
					System.out.print("* ");
				}
			}
			else{
				for (int n = 1; n<= num; n++){
					System.out.print(" *");;
				}
			}
			System.out.println();	

		}
	}
}
