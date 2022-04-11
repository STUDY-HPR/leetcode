class Solution {
    
    int low = 0;
    int totalLen = 0;
    
    public String longestPalindrome(String s) {
        
        int len = s.length();
        if(len == 1){
            return s;
        }
        
        for(int i = 0 ; i < len; i++){
            longestPalindrome(s, i, i);
            longestPalindrome(s, i, i + 1);
        }
        return s.substring(low, low + totalLen);
    }
    
    private void longestPalindrome(String s, int left, int right){
                
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        
        if(totalLen < right - left - 1){
            low = left + 1;
            totalLen = right - left - 1;
        }
        
    }
}