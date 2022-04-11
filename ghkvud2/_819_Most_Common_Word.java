class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        paragraph = paragraph.toLowerCase().replaceAll("[^A-Za-z]", " ").replaceAll("  ", " ");
        
        Map<String, Integer> map = new HashMap<>();
        String[] arr = paragraph.split(" ");
        
        for(String str : arr){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        
        for(String ban : banned){
            map.remove(ban);
        }
        
        int max = 0;
        String res = "";
        
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            
            if(max < entry.getValue()){
                max = entry.getValue();
                res = entry.getKey();
            }
        }
        return res;
        
    }
}