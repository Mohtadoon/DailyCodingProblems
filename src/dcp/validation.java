package dcp;

import java.util.Stack;

public class validation {


    public static void main(String[] args) {
        String expression = "[[{()}]]";
        helper obj = new helper();
        System.out.println(obj.helperFun(expression));

    }

}
class helper {
    public Stack<Character> stk = new Stack<>();


    boolean helperFun(String expression) {
        for (int i = 0; i < expression.length(); i++) {

            if (expression.charAt(i) == '{' || expression.charAt(i) == '[' || expression.charAt(i) == '(') {
                stk.push(expression.charAt(i));
            }


            switch (expression.charAt(i)) {

                case '}':
                    if (stk.peek() == '{')
                        stk.pop();
                    else return false;
                    break;

                case ')':
                    if (stk.peek() == '(')
                        stk.pop();
                    else return false;
                    break;

                case ']':
                    if (stk.peek() == '[')
                        stk.pop();
                    else return false;
                    break;

            }

        }

        if (!stk.isEmpty()) {
            return false;
        }
        return true;

    }
}