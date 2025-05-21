// TC: O(n)
// SC: O(1)
// Approach: Maintain 2 hashmaps to map char to word and word to character.

import java.util.HashMap;

public class Word_Pattern {

  public boolean wordPattern(String pattern, String s) {

    HashMap<Character, String> pMap = new HashMap<>();
    HashMap<String, Character> sMap = new HashMap<>();

    String[] arr = s.split(" ");

    if (pattern.length() != arr.length)
      return false;

    for (int i = 0; i < pattern.length(); i++) {
      if (pMap.containsKey(pattern.charAt(i))) {
        if (!pMap.get(pattern.charAt(i)).equals(arr[i])) {
          return false;
        }
      } else {
        pMap.put(pattern.charAt(i), arr[i]);
      }

      if (sMap.containsKey(arr[i])) {
        if (sMap.get(arr[i]) != pattern.charAt(i)) {
          return false;
        }
      } else {
        sMap.put(arr[i], pattern.charAt(i));
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Word_Pattern wp = new Word_Pattern();

    String pattern = "abba";
    String s = "dog cat cat dog";

    System.out.println(wp.wordPattern(pattern, s));
  }
}
