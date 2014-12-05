package com.gorbash.stacksandqueues;

import java.util.Stack;

/**
 * Created by Gorbash on 2014-12-05.
 * string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
 */
public class Brackets {

    public int solution(String S) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            Character ch = S.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case '}':
                    if (stack.empty() || stack.pop() != '{') return 0;
                    break;
                case ']':
                    if (stack.empty() || stack.pop() != '[') return 0;
                    break;
                case ')':
                    if (stack.empty() || stack.pop() != '(') return 0;
                    break;
                default:
                    throw new RuntimeException("Unknown character:" + ch);
            }
        }
        if (stack.empty())
            return 1;
        else
            return 0;
    }
}
