public class ArrayOps {
    public static void main(String[] args) {
       int[] array1 = {0,1,0,3};
       int[] array2 = {0,1,2,3};
       System.err.println(findMissingInt(array1)); 
       System.out.println(secondMaxValue(array1));
       System.out.println(containsTheSameElements(array1, array2));
       System.out.println(isSorted(array1));
    }
    
    public static int findMissingInt (int [] array) {
        // Write your code here:
        if (array.length == 1){
            return 1;
        }
        int sum1 = 0;
        int firstsum = array.length;
        for(int i = 0; i < array.length; i++){
            firstsum = firstsum + i;
        }
        for(int j = 0; j < array.length; j++ ){
            sum1 = sum1 + array[j];
        }
        int ret = firstsum - sum1 ;  
        return ret;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int max1 = array[0];
        int max2 = array [0];
        int location = 0;
        for(int i = 0; i < array.length; i++ ){
            if (array[i] > max1 ){
                max1 = array[i];
                location = i;
            }
        }
        array[location] = 0;
        for(int j = 0; j < array.length; j++ ){
            if (array[j] > max2 ){
                max2 = array[j];
            }
        }
        
        return max2;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        boolean check = false;
        for(int i = 0; i < array1.length; i++ ){
            check = false;
           for(int j = 0; j < array2.length; j++ ){
            if(array1[i] == array2[j]){
                check = true;
            }
        }
        if(check != true){
            return false;
        } 
        
        }
    return true;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
         boolean checkinc = false;
         boolean checkdec = false;
         int previnchek = array[0];
         for(int i = 1; i < array.length; i++ ){
         if(previnchek >= array[i]){
            checkdec = true;
         }
         else{
            checkdec = false;
            break;
         }
         previnchek = array[i];
        }
        previnchek = array[0];
        for(int j = 1; j < array.length; j++ ){
         if(previnchek <= array[j]){
            checkinc = true;
         }
         else{
            checkinc = false;
            break;
         }
         previnchek = array[j];
        }
        if(checkdec == true != checkinc == true){
            return true;
         }
         else{
            return false;
         }

    }

}
