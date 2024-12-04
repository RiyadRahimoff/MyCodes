package calculatorp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit system");
            System.out.print("Select operation: ");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.print("Enter first number: ");
                    int firstAdd = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int secondAdd = scanner.nextInt();
                    Calculator calculator = new Calculator(firstAdd, secondAdd);
                    System.out.println(calculator.addition());
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    int firstSub = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int secondSub = scanner.nextInt();
                    Calculator calculatorS = new Calculator(firstSub, secondSub);
                    System.out.println(calculatorS.subtraction());
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    int firstMul = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int secondMul = scanner.nextInt();
                    Calculator calculatorM = new Calculator(firstMul, secondMul);
                    System.out.println(calculatorM.multiplication());
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    int firstDiv = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int secondDiv = scanner.nextInt();
                    Calculator calculatorD = new Calculator(firstDiv, secondDiv);
                    System.out.println(calculatorD.division());
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid operation");
            }
        }

    }
}