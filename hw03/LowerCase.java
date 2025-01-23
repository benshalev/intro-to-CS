/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(LowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String LowerCase(String str) {
        // Replace the following statement with your code
        String ans = "";
        int length = str.length() ;
        for (int i = 0; i < length ; i++){
            if((int)(str.charAt(i))>64 && (int)(str.charAt(i)) < 91){
                ans = ans + (char)((int)str.charAt(i) + 32);
            }
            else{
                ans = ans + str.charAt(i);
            }
        }
        return ans;
    }
}