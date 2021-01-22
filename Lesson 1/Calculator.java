public class Calculator {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 9;
        long result = 0;
        char operation = '-';

        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            result = num1 / num2;
        } else if (operation == '^') {
            result = num1;
            for(int i = 1; i < num2; i++) {
                result *= num1;
            }
        }
        System.out.println("Your result =" + result);
    }
}

