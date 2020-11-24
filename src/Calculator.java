import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner newValue = new Scanner(System.in);
        int value1, value2, result;
        char operator;
        System.out.println("Enter the first number");
        value1 = newValue.nextInt();
        System.out.println("Enter the second number");
        value2 = newValue.nextInt();
        System.out.println("Enter the action");
        operator = newValue.next().charAt(0);

        switch (operator) {
            case '+':
                result = value1 + value2;
                System.out.println(result);
                break;
            case '-':
                result = value1 - value2;
                System.out.println(result);
                break;
            case '*':
                result = value1 * value2;
                System.out.println(result);
                break;
            case '/':
                result = value1 / value2;
                System.out.println(result);
                break;
        }
    }
}
