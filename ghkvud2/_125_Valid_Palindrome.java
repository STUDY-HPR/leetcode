class Solution {
    public boolean isPalindrome(String s) {
		if (s.isEmpty()) {
			return true;
		}

		s = s.toLowerCase();

		int left = 0;
		int right = s.length() - 1;

		while (left <= right) {

			char leftChar = s.charAt(left);
			if (!isAlphabeticAndDigit(leftChar)) {
				left++;
				continue;
			}

			char rightChar = s.charAt(right);
			if (!isAlphabeticAndDigit(rightChar)) {
				right--;
				continue;
			}

			if (leftChar != rightChar) {
				return false;
			}
		}
		return true;
	    
    }
}