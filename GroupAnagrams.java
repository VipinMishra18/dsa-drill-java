import java.util.*;

// Key each word by its sorted characters.
class GroupAnagrams {
    static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            map.computeIfAbsent(new String(c), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
