public class Q3 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char []c = strs[i].toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if (map.containsKey(key)){
                map.get(key).add(strs[i]);
            }else {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                map.put(key,temp);
            }
        }
        return new ArrayList<List<String>>(map.values());
    }
}









