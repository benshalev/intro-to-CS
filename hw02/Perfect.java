/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		int num = Integer.parseInt(args[0]);
		int sum = 1;
		String str = "1";
		for (int i = 2; i<num; i++){
			if (num % i == 0){
				
				sum = sum + i;
			}
		}
		if (num != sum){
			System.out.println(num + " is not a perfect number");
		}
		else{
			for(int i = 2; i<num; i++){
				if (num%i == 0){
					str = str + (" + " + i  );
				}
			}
			System.out.println(num + " is a perfect number since " +  num + " = " + str);
		}


	}
}
