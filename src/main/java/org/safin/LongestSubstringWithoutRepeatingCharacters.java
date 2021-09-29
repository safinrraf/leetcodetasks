package org.safin;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String input) {
        int result = 0;
        if (input == null) {
            return result;
        }
        final int n = input.length();
        char chr;
        final Map<Character, Integer> map = new HashMap<>();
        for (int j = 0, i = 0; j < n; j++) {
            chr = input.charAt(j);
            if (map.containsKey(chr)) {
                i = Math.max(map.get(chr), i);
            }
            result = Math.max(result, j - i + 1);
            map.put(chr, j + 1);
        }
        return result;
    }
}
