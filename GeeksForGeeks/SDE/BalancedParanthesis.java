import java.util.Stack;

//https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/

public class BalancedParanthesis {

    public static void main(String[] args) {
        BalancedParanthesis obj = new BalancedParanthesis();
        System.out.println(obj.valid("()[]{}"));
    }

    boolean valid(String s) {
        if (s != null) {
            int length = s.length();
            if (length != 0) {
                Stack<Character> stack = new Stack<>();
                for (int i = 0; i < length; i++) {
                    char c = s.charAt(i);
                    if (c == '[' || c == '{' || c == '(')
                        stack.push(c);
                    else {
                        if (c == ']') {
                            if (checkIfStackIsEmpty(stack))
                                return false;
                            if (stack.pop() != '[')
                                return false;
                        }

                        else if (c == '}') {
                            if (checkIfStackIsEmpty(stack))
                                return false;
                            if (stack.pop() != '{')
                                return false;
                        }

                        else if (c == ')') {
                            if (checkIfStackIsEmpty(stack))
                                return false;
                            if (stack.pop() != '(')
                                return false;
                        }
                    }
                }
                if (checkIfStackIsEmpty(stack))
                    return true;
            }
        }
        return false;
    }

    boolean checkIfStackIsEmpty(Stack<Character> stack) {
        return stack.size() == 0 ? true : false;
    }
}
