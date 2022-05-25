import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.Map.Entry;

//https://www.geeksforgeeks.org/find-the-first-repeated-character-in-a-string/

/**
 * Given a string, find the first repeated character in it. 
 * We need to find the character that occurs more than once and whose index of second occurrence is smallest. 
 * A variation of this question is discussed
 * Input: ch = “geeksforgeeks” 
Output: e 
e is the first element that repeats
 */

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        System.out.println(returnFirstRepeatedCharacter("GeeksForGeeks"));
    }

    private static Character returnFirstRepeatedCharacter(String s){
        if(s==null || s.length()==0 || s.length()==1){
            System.out.println("No repeating character");
            return null;
        }

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        s.chars().iterator(character->{
            map.merge((char)character, 1, Integer::sum);
            Optional<Entry<Character, Integer>> entry = checkRepeat(map);             
            entry.get().getKey();
        });

        
        return map.entrySet().stream().filter(value->value.getValue()>1).findFirst().get().getKey();

    }

    private static Optional<Entry<Character, Integer>> checkRepeat(LinkedHashMap<Character,Integer> map){
        return map.entrySet().stream().filter(value->value.getValue()>1).findFirst();
    }
}
