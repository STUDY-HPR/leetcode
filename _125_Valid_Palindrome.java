package ghkvud2;

public class _125_Valid_Palindrome {

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
			left++;
			right--;
		}
		return true;
	}

	public boolean isAlphabeticAndDigit(char ch) {
		return Character.isAlphabetic(ch) || Character.isDigit(ch);
	}

}
