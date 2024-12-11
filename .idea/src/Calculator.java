import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter an expression for example (a + b): ");
        String input = scanner2.nextLine();
        String result = calculate(input);
        System.out.println("Result: " + result);

    }

    public static String calculate(String input) throws Exception {
        String[] tokens = input.split(" ");
        if (tokens.length != 3 ) {
            throw new Exception("Incorrect input format. Use format: a + b");
        }

        int num1;
        int num2;
        try {
            num1 = Integer.parseInt(tokens[0]);
            num2 = Integer.parseInt(tokens[2]);
        } catch (NumberFormatException e) {
            throw new Exception("The numbers must be integers between 1 and 10 inclusive");
        }
        if (num1<1 || num1 >10 || num2<1 || num2 > 10){
            throw new Exception("Incorrect input format.Numbers should be 1-10 ");
        }
        String operation = tokens[1];
        int result=0;

        switch (operation){
            case ("+"):
                result= num1+num2;
                break;
            case ("-"):
                result=num1-num2;
                break;
            case ("*"):
                result=num1*num2;
                break;
            case ("/"):
                result=num1/num2;
                break;
            default:
                throw new Exception("Unsupported operation:" + operation);
        }
        return String.valueOf(result);
    }
}

