import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty() || s.charAt(i) != st.peek()) {
                st.push(s.charAt(i));
            } else {
                st.pop();
            }
        }

        // Build the resulting string from stack
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        // Reverse the result as Stack gives LIFO order
        return result.reverse().toString();
    }
}
