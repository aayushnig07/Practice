//https://www.geeksforgeeks.org/check-string-can-obtained-rotating-another-string-2-places/

/**
 * Given two strings, the task is to find if a string can be obtained by
 * rotating another string two places.
 * 
 * Examples:
 * 
 * Input: string1 = “amazon”, string2 = “azonam”
 * Output: Yes
 * // rotated anti-clockwise
 * Input: string1 = “amazon”, string2 = “onamaz”
 * Output: Yes
 * // rotated clockwise
 */

class RotatingString {
    public static void main(String[] args) {
        System.out.println(checkIfStringsAreEqual(new String("amazon"), new String("azonam"), 2));
        System.out.println(checkIfStringsAreEqual(new String("amazon"), new String("onamaz"), 2));
        System.out.println(checkIfStringsAreEqual(new String("amazon"), new String("onamazsdssd"), 2));
        System.out.println(checkIfStringsAreEqual(new String("ama"), new String("maz"), 2));

    }

    public static boolean checkIfStringsAreEqual(String s1, String s2, int pos) {
  
        if (s1.length() != s2.length())
            return false;

        String clockWiseRotatedString = rotateClockWise(s1, pos);
        if (clockWiseRotatedString.equals(s2))
            return true;
        else {
            String antiClockWiseRotateString = rotateAntiClockWise(s1, pos);
            if (antiClockWiseRotateString.equals(s2))
                return true;
        }
        return false;
    }


    private static String rotateClockWise(String s, int pos) {

        return s.substring(2, s.length()) + s.substring(0, pos);
    }

    //amazon
    private static String rotateAntiClockWise(String s, int pos) {
        return s.substring(s.length() - 2, s.length()) + s.substring(0,s.length() - 2);
    }
}