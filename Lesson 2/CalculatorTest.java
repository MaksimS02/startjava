import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculatorOne = new Calculator();
        boolean cycle = true;
        String answer;
        do {
            System.out.println("Enter number one: ");
            calculatorOne.setNum1(scanner.nextInt());
            System.out.println("Enter an operator (+, -, *, /): ");
            calculatorOne.setOperation(scanner.next().charAt(0));
            System.out.println("Enter number two: ");
            calculatorOne.setNum2(scanner.nextInt());
            System.out.println("Result = " + calculatorOne.getResult());
            System.out.println("Do you want to continue : yes/no ? ");
            answer = scanner.next();
            System.out.println("Answer = " + answer);
            cycle = true;
        } while (answer.equals("yes"));
    }
}




