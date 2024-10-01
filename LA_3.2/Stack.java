import java.util.Stack;
public class PostfixEvaluation {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');  // Convert char to int
            }

            else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                
                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                }
            }
        }
      
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfixExpression = "231*+9-";  // Example postfix expression
        System.out.println("Postfix Expression: " + postfixExpression);
        int result = evaluatePostfix(postfixExpression);
        System.out.println("Result: " + result);
    }
}
