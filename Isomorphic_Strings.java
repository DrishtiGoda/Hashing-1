// TC: O(n)
// SC: O(1)
// Approach: Maintain 2 hashmaps and check the mapping from both sides 

import java.util.HashMap;

public class Isomorphic_Strings {

  public boolean isIsomorphic(String s, String t) {

    HashMap<Character, Character> sMap = new HashMap<>();
    HashMap<Character, Character> tMap = new HashMap<>();

    if (s.length() != t.length())
      return false;

    for (int i = 0; i < s.length(); i++) {
      char sChar = s.charAt(i);
      char tChar = t.charAt(i);

      if (sMap.containsKey(sChar)) {
        if (sMap.get(sChar) != tChar) {
          return false;
        }
      } else {
        sMap.put(sChar, tChar);
      }

      if (tMap.containsKey(tChar)) {
        if (tMap.get(tChar) != sChar) {
          return false;
        }
      } else {
        tMap.put(tChar, sChar);
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Isomorphic_Strings is = new Isomorphic_Strings();
    String s = "egg";
    String t = "add";

    System.out.println(is.isIsomorphic(s, t));
  }
}
