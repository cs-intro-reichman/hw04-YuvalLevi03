public class ArrayOps {
    public static void main(String[] args) {
     int[] arr1= {32,-4,-50};
     // int[] arr2= {1,3,2,1,1,1,1,11};
     System.out.println(isSorted(arr1));

    }
    
    public static int findMissingInt (int [] array) {
        int missingNum = 0;
        for (int i = 0 ; i < array.length + 1 ; i++) {
            boolean isMissing = true;
            for (int g = 0 ; g < array.length ; g++) {
                 if (array[g] == i) {
                 isMissing = false;
                 break;
                 } 
            }
        if (isMissing) {
            missingNum = i;
            }
        }
        return missingNum;
    }

    public static int secondMaxValue(int [] array) {
        int max1 = array[0];
        int max2 = array[1];
        for (int i = 1 ; i < array.length ; i++) {
            if (array[i] > max2) {
                max2 = array[i];
            }
            if (array[i] > max1) {
                max2 = max1;
                max1 = array[i];
                }
        } 
        return max2;
    }

    public static boolean containsOneSide(int [] array1,int [] array2) {
        boolean sameNum = false;
        for (int i = 0 ; i < array1.length ; i++) {
            sameNum = false;
            for (int g = 0 ; g < array2.length ; g++) {
                if (array1[i] == array2[g]) {
                    sameNum = true;
                    break;
                }
            }
            if (!sameNum) {
                break;
            }    
        }
        return sameNum;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        if (containsOneSide(array1, array2) == true &&
            containsOneSide(array2, array1) == true) {
              return true; 
            } else { 
              return false;
            }
    }

    public static boolean isSortedIncrease(int [] array) {
        boolean isSorted = true;
        for (int i = 1 ; i < array.length ; i++) {
            if (array[i] < array[i-1]) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public static boolean isSortedDecrease(int [] array) {
        boolean isSorted = true;
        for (int i = 1 ; i < array.length ; i++) {
            if (array[i] > array[i-1]) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public static boolean isSorted(int [] array) {
        if (isSortedIncrease(array) == true || isSortedDecrease(array) == true){
         return true;   
        } else {
         return false;
        }
    }
}
