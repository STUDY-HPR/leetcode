class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> returnList = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str: strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String s = new String(c);

            if(map.containsKey(s)){
                map.get(s).add(str);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(s, temp);
            }
        }

        for (String key: map.keySet()) {
            returnList.add(map.get(key));
        }

        return returnList;
    }
}
