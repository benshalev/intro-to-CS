public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    
    
    public static void main(String[] args) {
     
        char c = 'l';
        System.out.println(allIndexOf(str, c));
    }

 
    public static char changeToUpper(char c) {
        if (c >= 'a' && c <= 'z') {

            return (char) (c - ('a' - 'A'));

        } else
            return c;

    }
    public static char changeToLower(char c) {
        if (c >= 'A' && c <= 'Z')
            return (char) (c + ('a' - 'A'));
        else
            return c;
    }
   

    public static String capVowelsLowRest(String str) {
        // Write your code here:

        String newS = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == 0 && "AEIOU".indexOf(c) != -1) {

                newS += str.charAt(i);

            } else if ("aeiou".indexOf(c) != -1) {//בודק אם יש אות ניקוד קטנה ואם כן אז הופך

                newS += (char) (c - 32);
            } else if ("AEIOU".indexOf(c) != -1) {// בודק אם יש אות ניקוד גדולה ואם כן אז

                newS += (char) (c + 32);
            } else if ((int) c >= 65 && (int) c <= 90)// בודק אם אותיות גדולות ולא ניקוד

                newS += (char) (c + 32);

            else// אם האות קטנה ולא ניקוד תשאיר אותה ככה
                newS += changeToLower(str.charAt(i));

        }

        return newS;
    }




    public static String changeFirstToLowerCase(String str) {

        char c;
        c = str.charAt(0);
        int i = 0;
        String newS = "";
        while (str.charAt(i) == ' ') {

            i++;
        }
        c = str.charAt(i);
        newS += changeToLower(c);
        for (int j = i + 1; j < str.length(); j++) {
            newS += str.charAt(j);
        }
        return newS;
    }

    // משנה את האות שאחרי הרווח לגדולה
    public static String secondWordUpperCase(String str) {
        String newS = "";
        char c = str.charAt(0);

        newS += changeToLower(c);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ') {
                newS += changeToUpper(str.charAt(i));
            } else
                newS += str.charAt(i);
        }
        return newS;
    }
    // להוסיף קוד שמחליף את כל האותיות שאינן בראשית מילה לאותיות קטנות

    public static String removeSpace(String str) {
        String newS = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                newS = newS;
            } else
                newS += str.charAt(i);
        }
        return newS;
    }

    public static String changeLetterAfterSpace(String str) {
        String newS = "";
        newS += str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) != ' ') {
                char c = changeToLower(str.charAt(i));
                newS += c;

            } else {
                char c1 = changeToUpper(str.charAt(i));
                newS += c1;
            }
        }
        return newS;
    }

    public static String camelCase(String str) {
        // Write your code here:
        String newS = "";

        newS = changeFirstToLowerCase(str);// CORRECT
        str = newS;

        newS = secondWordUpperCase(str);// correct
        str = newS;

        newS = changeLetterAfterSpace(str);// correct
        str = newS;

        newS = changeFirstToLowerCase(str);// CORRECT
        str = newS;
        newS = removeSpace(str);// NEED TO CHECK
        str = newS;

        return str;
    }

    public static int[] allIndexOf(String str, char chr) {
        // Write your code here:
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr)
                count++;
        }
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
                array[count] = i;
                count++;
            }
        }
        return array;
    }
  }
   
