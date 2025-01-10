import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // Create a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate over each character in the input string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // If the character is a closing bracket, check for matching opening bracket
            else if (c == ')' && (stack.isEmpty() || stack.pop() != '(')) {
                return false; // If no matching opening bracket, return false
            } else if (c == '}' && (stack.isEmpty() || stack.pop() != '{')) {
                return false; // If no matching opening bracket, return false
            } else if (c == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                return false; // If no matching opening bracket, return false
            }
        }

        // If the stack is empty, all opening brackets had matching closing brackets
        return stack.isEmpty();
    }
}