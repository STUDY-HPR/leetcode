class Solution {
    public boolean isPalindrome(String s) {
        s = s.toUpperCase();
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(isPut(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        
        String str = sb.toString();
        
        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean isPut(char a) {
        if((a >= 48 && a <= 57) || (a >= 65 && a <= 90)) {
            return true;
        }else {
            return false;
        }
    }
}
