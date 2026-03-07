import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char i : s.toCharArray()) {

            if(i == '(' || i == '{' || i == '[') {
                st.push(i);
            }

            else if(i == ')' || i == '}' || i == ']') {

                if(st.isEmpty()) return false;

                char top = st.peek();

                if((i == ')' && top != '(') ||
                   (i == '}' && top != '{') ||
                   (i == ']' && top != '[')) {
                    return false;
                }

                st.pop();
            }
        }

        return st.isEmpty();
    }
}
