import java.util.*;

class Solution {
    public boolean isValid(String s) {
        
        char[] arr = s.toCharArray();
        ArrayList<Character> stack = new ArrayList();

        for(char c : arr){
            switch(c) {
                case '(':
                case '{':
                case '[':
                    stack.add(c);
                    break;


                case ')':
                    if(stack.size() == 0) {
                        return false;
                    }
                    if (stack.remove(stack.size()-1) != '(') {
                        return false;
                    }
                    break;


                case '}':
                if(stack.size() == 0) {
                    return false;
                }
                    if (stack.remove(stack.size()-1) != '{') {
                        return false;
                    }
                    break;

                case ']':
                if(stack.size() == 0) {
                    return false;
                }
                    if (stack.remove(stack.size()-1) != '[') {
                        return false;
                    }
                    break;
            }
        }
        if(stack.size() != 0) {
            return false;
        }

        return true;
    }
}