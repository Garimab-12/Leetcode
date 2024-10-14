class Solution {
    public boolean isPalindrome(String s) {
        // Convert string to lowercase and remove non-alphanumeric characters
        String st = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        
        // Filter only alphanumeric characters
        for (char ch : st.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                str.append(ch);
            }
        }
        
        // Convert StringBuilder to a regular String
        String cleanedStr = str.toString();
        
        // Initialize pointers for palindrome check
        int i = 0;
        int j = cleanedStr.length() - 1;
        
        // Check for palindrome by comparing characters from both ends
        while (i <= j) {
            if (cleanedStr.charAt(i) == cleanedStr.charAt(j)) {
                i++;
                j--;
            } else {
                return false;  // Not a palindrome if characters don't match
            }
        }
        
        return true;  // Return true if it's a palindrome
    }
}
