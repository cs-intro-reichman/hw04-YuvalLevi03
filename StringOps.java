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
        String str = "Hello WOrld lo LOL HEEYYY 123";
        System.out.println(indexCount(str,'L'));

    }

    public static String capVowelsLowRest (String string) {
        char[] vowelsLower = {'a','i','o','e','u'};
        String ans = "";
        for (int i = 0 ; i < string.length() ; i++ ) {
            char charI = lowerCase(string.charAt(i));
            for (int g = 0 ; g < vowelsLower.length ; g++ ) {
                if (charI == vowelsLower[g]) {
                    charI = upperCase(string.charAt(i));
                    break;
                }
            }
            ans += charI;
        }
        return ans;
    }

    public static String camelCase (String string) {
        String ans = "" + lowerCase(string.charAt(0));
        for (int i = 1 ; i < string.length() ; i++) {
            if (string.charAt(i) == ' ') {
                ans = ans;
            } else {
                if (string.charAt(i - 1) == ' ') {
                    ans += upperCase(string.charAt(i)); 
                } else {
                    ans += lowerCase(string.charAt(i));
                }
            }
        }
        return ans;
    }   

    public static int[] allIndexOf (String string, char chr) {
        int[] array = new int[indexCount(string, chr)];
        int insertIndex = 0;
        for (int i = 0 ; i < string.length() ; i++) {
            if (string.charAt(i) == chr) {
                array[insertIndex] = i;
                insertIndex++;
            }
        }
        return array;
    }

    public static char lowerCase (char char1) {
        if (char1 >= 'A' && char1 <= 'Z') {
            return (char) (char1 + 32);
        } else {
            return char1;
        }
    }

    public static char upperCase (char char1) {
        if (char1 >= 'a' && char1 <= 'z') {
            return (char) (char1 - 32);
        } else {
            return char1;
        }
    }

    public static int indexCount (String string, char chr) {
        int count = 0;
        for (int i = 0 ; i < string.length() ; i++) {
            if (string.charAt(i) == chr) {
                count++;
            }
        }
        return count;
    } 
}
