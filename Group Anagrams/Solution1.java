import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }

        Map <String, List<String>> map = new HashMap<>();
        for (String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String clave = new String(charArray);

            map.putIfAbsent(clave, new ArrayList<>());
            map.get(clave).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
