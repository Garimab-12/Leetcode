class Solution {
    public int minLength(String s) {
        // Use a stack to simulate removal of "AB" and "CD" pairs
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            // Check for the last character in the stack to form "AB" or "CD"
            int len = stack.length();
            if (len > 0 && ((stack.charAt(len - 1) == 'A' && current == 'B') ||
                            (stack.charAt(len - 1) == 'C' && current == 'D'))) {
                stack.deleteCharAt(len - 1);  // Remove last character if pair found
            } else {
                stack.append(current);  // Add current character if no pair found
            }
        }

        // Return the length of the stack, which represents the modified string length
        return stack.length();
    }
}
