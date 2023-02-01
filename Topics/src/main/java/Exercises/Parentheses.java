package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Parentheses {
    public static void main(String[] args) {
        System.out.println(check("({})"));
    }

    public static boolean check(String line) {
        boolean flag = true;
        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '('|| line.charAt(i) == '{' ) {
                if (stack.isEmpty()) {
                    stack.push(line.charAt(i));
                }else if (stack.peek() == '(' || stack.peek() == '{'){
                    flag = false;
                }

            } else if (line.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    flag = false;
                } else {
                    if (stack.peek() != '(') {
                        stack.pop();
                    }
                }

            }

        }
        return flag;
    }
}


