package BuildJavaPrograms.Chapter_14_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class EvaluatorMain {

    public static void main(String[] args) {
        System.out.println("This program evaluates fully");
        System.out.println("parenthesized expressions with the");
        System.out.println("operators +, -, *, +, and ^");
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("expression (return to quit)? ");
        String line = input.nextLine().trim();

        while (line.length() > 0) {
            evaluate(line);
            System.out.println("expression (return to quit)? ");
            line = input.nextLine().trim();
        }

    }

    public static void evaluate(String line) {
        StringSplitter sp = new StringSplitter(line);
        Stack<String> symbols = new Stack<>();
        Stack<Double> values = new Stack<>();

        boolean error = false;

        while (!error && sp.hasNext()) {
            String next = sp.next();

            if (next.equals(")")) {
                if (symbols.size() < 2 || symbols.peek().equals("(")) {
                    error = true;
                } else {
                    String operator = symbols.pop();
                    if (!symbols.peek().equals("(")) {
                        error = true;
                    } else {
                        //remove the (
                        symbols.pop();
                        double op2 = values.pop();
                        double op1 = values.pop();
                        double result = evaluate(operator, op1, op2);
                        values.push(result);
                    }
                }
            } else if ("(+-*/^".contains(next)) {
                symbols.push(next);
            } else {
                values.push(Double.parseDouble(next));
            }
        }

        if (error || values.size() != 1 || !symbols.isEmpty()) {
            System.out.println("illegal expression");
        } else {
            System.out.println(values.pop());
        }
    }

    public static double evaluate(String operator, double operand1, double operand2) {
        if (operator.equals("+")) {
            return operand1 + operand2;
        } else if (operator.equals("-")) {
            return operand1 - operand2;
        } else if (operator.equals("*")) {
            return operand1 * operand2;
        } else if (operator.equals("/")) {
            return operand1 / operand2;
        } else if (operator.equals("^")) {
            return Math.pow(operand1, operand2);
        } else {
            throw new RuntimeException(
                    "illegal operator " + operator);
        }
    }
}
