import java.util.LinkedList;
import java.util.Stack;

public class InfixToPostfix {

    // 操作符的优先级
    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }

    // 判断字符是否是运算符
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    // 中缀表达式转后缀表达式
    public static LinkedList<String> infixToPostfix(String infix) {
        LinkedList<String> postfix = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        boolean negative = true; // 判断是否为负数

        StringBuilder numBuilder = new StringBuilder();

        for (char c : infix.toCharArray()) {
            if (Character.isDigit(c) || c == '.') {
                numBuilder.append(c);
                negative = false;
            } else if (c == '-' && negative) {
                numBuilder.append(c);
                negative = false;
            } else if (isOperator(c)) {
                if (numBuilder.length() > 0) {
                    postfix.add(numBuilder.toString());
                    numBuilder.setLength(0);
                }
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.add(String.valueOf(stack.pop()));
                }
                stack.push(c);
                negative = true;
            }
        }

        if (numBuilder.length() > 0) {
            postfix.add(numBuilder.toString());
        }

        while (!stack.isEmpty()) {
            postfix.add(String.valueOf(stack.pop()));
        }

        return postfix;
    }

    public static void main(String[] args) {
        String infixExpression = "-3.5+4*2-1*9";
        LinkedList<String> postfixExpression = infixToPostfix(infixExpression);
        System.out.println("后缀表达式：" + postfixExpression);
        System.out.println(Double.NaN);
    }
}
