public class Calculator {

    private int num1;
    private int num2;
    private char operation = ' ';
    private int result;

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setOperation(char operation) {
        this.operation = operation;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
    }
    public int getResult() {
        return result;
    }
}

