package Exercises;

import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        System.out.println(parentheses("({})"));
        System.out.println(parentheses("[]()"));
        System.out.println(parentheses("([])"));
        System.out.println(parentheses("([]))"));

    }
    //Task: Есть текст в нём расставлены скобки. Проверить все ли скобки закрываются в правильном порядке.
//Пример     () [] {}     ({}[])      ({[]})    (Рекомендую использовать для решения Stack)  Не забудьте написать в первую очередь тесты. Минимум 5
    public static boolean parentheses(String line){
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
