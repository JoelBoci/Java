package Practical_13;

import java.util.Stack;
import java.util.StringTokenizer;

public class Calculator {

    public static void main(String[] args) {
        String postfix = "4 5 + 1 2 * - 5 /";
        StringTokenizer tokenizer = new StringTokenizer(postfix, " ");
        String token;

        Stack<String> stack = new Stack<>();

        while(tokenizer.hasMoreElements()) { // Loop until there are no more elements in the tokenizer
            token = tokenizer.nextToken();
            System.out.println("Method = push: " + stack.push(token) + "\t\tReturn Value: " + token + "\t\t\tStack Contents: " + stack);
            String top_stack = stack.peek(); // Value at the top of the stack

            // If the top of the stack is an operator
            if(top_stack.equals("+") || top_stack.equals("-") || top_stack.equals("*") || top_stack.equals("/")) {
                // Get the symbol
                String symbol = stack.pop();
                System.out.println("\nMethod = pop: " + symbol + "\t\t\tReturn Value: " + symbol + "\t\t\tStack Contents: " + stack);

                // Pop and parse the number to an integer
                Integer number1 = Integer.parseInt(stack.pop());
                System.out.println("Method = pop: " + number1 + "\t\t\tReturn Value: " + number1 + "\t\t\tStack Contents: " + stack);

                // Pop and parse the number to an integer
                Integer number2 = Integer.parseInt(stack.pop());
                System.out.println("Method = pop: " + number2 + "\t\t\tReturn Value: " + number2 + "\t\t\tStack Contents: " + stack);

                // Operations to perform based on the operator
                switch(top_stack) {
                    case "+" -> {
                        int ans1 = Integer.parseInt(stack.push(String.valueOf(number2 + number1)));
                        System.out.println("Method = push: " + ans1 + "\t\tReturn Value: " + ans1 + "\t\t\tStack Contents: " + stack);
                    }
                    case "-" -> {
                        int ans2 = Integer.parseInt(stack.push(String.valueOf(number2 - number1)));
                        System.out.println("Method = push: " + ans2 + "\t\tReturn Value: " + ans2 + "\t\t\tStack Contents: " + stack);
                    }

                    case "*" -> {
                        int ans3 = Integer.parseInt(stack.push(String.valueOf(number2 * number1)));
                        System.out.println("Method = push: " + ans3 + "\t\tReturn Value: " + ans3 + "\t\t\tStack Contents: " + stack);

                    }
                    case "/" -> {
                        double ans4;
                        if(number2 % number1 != 0) { // If there is a remainder, parse the value to a double to get the correct value
                            ans4 = Double.parseDouble(stack.push(String.valueOf((double) number2 / number1)));
                        } else { // If there is no remainder
                            ans4 = Double.parseDouble(stack.push(String.valueOf(number2 / number1)));
                        }
                        // Print out the value
                        System.out.println("Method = push: " + ans4 + "\t\tReturn Value: " + ans4 + "\t\tStack Contents: " + stack);
                    }
                }

                // Print the stack
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("\t\t\t\t\t\t\t\tStack: " + stack);
                System.out.println("------------------------------------------------------------------------------\n");
            }
        }
    }
}
