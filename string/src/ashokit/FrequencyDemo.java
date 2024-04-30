package ashokit;

import java.util.HashMap;
import java.util.Map;

public class FrequencyDemo {
    public static void main(String[] args) {
        String str = "missisipi";
        Map<Character, Integer> frequencyMap = calculateCharacterFrequency(str);
        
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
    private static Map<Character, Integer> calculateCharacterFrequency(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                frequencyMap.put(c, 1);
            }
        }
        
        return frequencyMap;
    }
}
