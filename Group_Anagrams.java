// TC:O(nklogk)
// SC:O(n*k)
// Approach: Sort the word and store in map as key and add all the words in new list which matches the sorted word

import java.util.*;

public class Group_Anagrams {

  public List<List<String>> groupAnagrams(String[] strs) {

    HashMap<String, List<String>> map = new HashMap<>();

    for (String str : strs) {
      char[] chars = str.toCharArray();
      Arrays.sort(chars);

      String sortedWord = new String(chars);

      if (!map.containsKey(sortedWord)) {
        map.put(sortedWord, new ArrayList<>());
      }
      map.get(sortedWord).add(str);
    }
    return new ArrayList<>(map.values());
  }

  public static void main(String[] args) {
    Group_Anagrams gp = new Group_Anagrams();
    String[] strs = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };

    System.out.println(gp.groupAnagrams(strs));
  }
}