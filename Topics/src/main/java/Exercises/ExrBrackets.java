package Exercises;

import java.util.Stack;
public class ExrBrackets {

    public static boolean par(String line) {
            Stack<Character>stack = new Stack<>();


        for (char c: line.toCharArray()) {
            if (c == '{' || c == '[')
                stack.push(c);

            if ( c == '}' && stack.isEmpty()|| c == ']'&& stack.isEmpty())
                return false;

            else if (c == '}' && stack.peek() == '{' || c == ']' && stack.peek() == '[') {
                stack.pop();
                
            }
        }

        return stack.isEmpty();
    }
}
