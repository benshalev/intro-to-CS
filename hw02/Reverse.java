/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String name = args[0]; // the name of the string
		int strl = (name.length()) - 1;   // the length of the string
		for (int i=0; i < name.length(); i++){  // loop that run according the num of charachters
			char ch = name.charAt(strl);
			System.out.print(ch); // print the last cha
			strl = strl- 1; // minus to knoow what is the next one
		}
		System.out.println();
		int x = name.length() - 1;		 // chek the num of the muddle char
		//if (name.length() % 2 == 1 ){
			System.out.println("The middle character is " + name.charAt((x)/2));		 // print the middle char

	}
}
