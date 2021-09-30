package org.safin;

import java.util.HashMap;
import java.util.Map;

/**
 * 0. If the length of s1 greater than the length of s2 - then return false
 * 1. Put all characters from s1 to a map where the key is a character and a value is equal to character occurrences.
 * 2. Start loop for s1
 * 3. Start inner loop for
 * 4. Increment loop index with the length of s1
 * 5. put all character from the substring to the new Map
 * 6. Compare two maps
 */
public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        final Map<Character, Integer> s1Map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            s1Map.put(s1.charAt(i), s1Map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            final Map<Character, Integer> s2Map = new HashMap<>();
            for (int j = i; j < i + s1.length(); j++) {
                s2Map.put(s2.charAt(j), s2Map.getOrDefault(s2.charAt(j), 0) + 1);
            }
            if (s1Map.equals(s2Map)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Not my solution, but very fast
     *
     * @param s1 input string
     * @param s2 input string
     * @return true or false
     */
    public boolean checkInclusionNotMy(String s1, String s2) {
        char[] ss1 = s1.toCharArray();
        char[] ss2 = s2.toCharArray();
        int[] sss1 = new int[26];
        int[] sss2 = new int[26];
        for (char c : ss1) {
            sss1[c - 'a']++;
        }
        int left = 0;
        int right = 0;
        while (right < ss2.length) {
            int curr = ss2[right] - 'a';
            sss2[curr]++;
            while (sss2[curr] > sss1[curr]) {
                sss2[ss2[left] - 'a']--;
                left++;
            }
            if (right - left + 1 == ss1.length) {
                return true;
            }
            right++;
        }
        return false;
    }
}
