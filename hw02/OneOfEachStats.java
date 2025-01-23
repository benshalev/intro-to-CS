/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
import java.util.Random;
 public class OneOfEachStats {
	public static void main (String[] args) {
		//// Put your code here
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		Random generator = new Random(seed);
		int seckind;
		int kindof;
		boolean check = true;
		double Average;
		int sum = 1;
		int sumTotal = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		int onefam = 0;

		for (int n = 0; n < T; n++){
			double firstchild = generator.nextDouble();
			sum = 1;
			if (firstchild < 0.5){
				kindof = 1;

			}
			else{
				kindof = 0;
			}
			while (check == true) {
				sum = sum +1;
				double secondechild = generator.nextDouble();
				if (secondechild < 0.5 ){
					seckind = 0 ;
					if (kindof == seckind){
						check = false;
						}
				}
				else{
					seckind = 1 ;
					if (kindof == seckind){
						check = false;
					}
				}
			}
			if (sum == 2){
				x = x + 1;
			}
			else if(sum == 3){ 
				y = y + 1;
			}
			else{
				z = z + 1;
			}
			check = true;
			sumTotal += sum;
		}
		Average = (double) sumTotal / T; 
		System.out.println("Average: "  + Average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: "+ x);
		System.out.println("Number of families with 3 children: "+ y);
		System.out.println("Number of families with 4 or more children: "+ z);
		if (Math.max(z, (Math.max(x,y))) == x ){
			System.out.println("The most common number of children is 2." );

		}
		else if (Math.max(z, (Math.max(x,y))) == y ){
			System.out.println("The most common number of children is 3." );

		}
		else if (Math.max(z, (Math.max(x,y))) == z ){
			System.out.println("The most common number of children is 4 or more." );

		}

		
	}
}
