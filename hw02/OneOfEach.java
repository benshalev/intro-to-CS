/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		double firstchild = (Math.random() * 10);;
		int count = 1 ;
		int seckind;
		int kindof;
		boolean check = true;
		String childrens = "";
		if (firstchild < 5){
			childrens = "b ";
			kindof = 1;

		}
		else{
			childrens ="g ";
			kindof = 0;
		}
		while (check == true) {
			double secondechild = (Math.random() * 10);
			if (secondechild < 5 ){
			childrens = childrens + "b ";
			seckind = 0 ;
				if (kindof == seckind){
				check = false;
				}
			}
			else{
				childrens = childrens + "g ";
				seckind = 1 ;
				if (kindof == seckind){
				check = false;
				}
			}
			count ++ ; 

		}
		System.out.println(childrens);
		System.out.println("You made it... and you now have" + count + "children.");
	}
}
