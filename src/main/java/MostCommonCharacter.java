import java.util.*;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String must not be empty.");
        }

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        char mostCommon = ' '; 
        int highestCount = 0; 

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > highestCount) {
                highestCount = entry.getValue();
                mostCommon = entry.getKey();
            }
        }

        return mostCommon;
    }
}
