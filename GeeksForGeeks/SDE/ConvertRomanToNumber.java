import java.util.HashMap;

public class ConvertRomanToNumber {

    static HashMap<String, Integer> romanMap = new HashMap<>();

    public static void main(String[] args) {
        initializeData();
        System.out.println(convertRomanToNumber("CMXVI"));//916

    }

    private static void initializeData() {
        romanMap.put("I", 1);
        romanMap.put("IV", 4);
        romanMap.put("V", 5);
        romanMap.put("IX", 9);
        romanMap.put("X", 10);
        romanMap.put("XL", 40);
        romanMap.put("L", 50);
        romanMap.put("XC", 90);
        romanMap.put("C", 100);
        romanMap.put("CD", 400);
        romanMap.put("D", 500);
        romanMap.put("CM", 900);
        romanMap.put("M", 1000);

    }

    // I, II, III, IV, V, VI, VII, VIII, IX, X, XI, XII, XIII, XIV, XV, XVI, XVII,
    // XVIII

    private static int convertRomanToNumber(String s) {
        int length = s.length();
        if (length == 0)
            System.out.println("Invalid input");
        if (length == 1)
            return romanMap.get(s);
        int result = 0;
        for (int i = 0; i < length; i++) {
            char digit1 = s.charAt(i);
            int num1 = romanMap.get(Character.toString(digit1));
            if ((i + 1) < length) {
                char digit2 = s.charAt(i + 1);
                int num2 = romanMap.get(Character.toString(digit2));
                if (num1 >= num2) {
                    result = result + num1;
                } else {
                    result = result + num2 - num1;
                    i++;
                }
            }
            else{
                result=result+num1;
            }
            

        }
        return result;

    }

}
