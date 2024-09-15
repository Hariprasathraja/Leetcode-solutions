import java.util.HashMap;

class Solution {
    public int findTheLongestSubstring(String s) {
        HashMap<Character, Integer> vowelMap = new HashMap<>();
        vowelMap.put('a', 0);
        vowelMap.put('e', 1);
        vowelMap.put('i', 2);
        vowelMap.put('o', 3);
        vowelMap.put('u', 4);

        
        HashMap<Integer, Integer> stateMap = new HashMap<>();
        stateMap.put(0, -1); 

        int maxLength = 0;
        int state = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // Toggle the bit for vowels
            if (vowelMap.containsKey(c)) {
                int bit = vowelMap.get(c);
                state ^= (1 << bit); // Toggle the bit
            }
            if (stateMap.containsKey(state)) {
                maxLength = Math.max(maxLength, i - stateMap.get(state));
            } else {
                stateMap.put(state, i);
            }
        }

        return maxLength;
    }
}
