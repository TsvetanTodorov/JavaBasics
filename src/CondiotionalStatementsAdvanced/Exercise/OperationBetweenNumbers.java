package CondiotionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OperationBetweenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0.00;
        boolean isZero = false;


        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (isNumberEqualsZero(num2)) {
                    isZero = true;
                    printNumberNotDividedToZero(num1);
                } else {
                    result = num1 / num2;
                }
                break;
            case "%":
                if (isNumberEqualsZero(num2)) {
                    isZero = true;
                    printNumberNotDividedToZero(num1);
                } else {
                    result = num1 % num2;
                }
                break;
        }
        if (!isZero) {
            print(result, num1, num2, operator);
        }
    }


    private static void printAdditionEvenNumber(double num1, double num2, double result) {
        System.out.printf("%d + %d = %d - even", (int) num1, (int) num2, (int) result);
    }

    private static void printAdditionOddNumber(double num1, double num2, double result) {
        System.out.printf("%d + %d = %d - odd", (int) num1, (int) num2, (int) result);
    }

    private static void printMultiplyEvenNumber(double num1, double num2, double result) {
        System.out.printf("%d * %d = %d - even", (int) num1, (int) num2, (int) result);
    }

    private static void printMultiplyOddNumber(double num1, double num2, double result) {
        System.out.printf("%d * %d = %d - odd", (int) num1, (int) num2, (int) result);
    }

    private static void printSubtractionEvenNumber(double num1, double num2, double result) {
        System.out.printf("%d - %d = %d - even", (int) num1, (int) num2, (int) result);
    }

    private static void printSubtractionOddNumber(double num1, double num2, double result) {
        System.out.printf("%d - %d = %d - odd", (int) num1, (int) num2, (int) result);
    }

    private static void printModuleDividedNumber(double num1, double num2, double result) {
        System.out.printf("%d %% %d = %d", (int) num1, (int) num2, (int) result);
    }

    private static void printDividedNumber(double num1, double num2, double result) {
        System.out.printf("%d / %d = %.2f", (int) num1, (int) num2, result);

    }

    private static boolean isNumberEqualsZero(double number) {
        return number == 0;
    }

    private static void printNumberNotDividedToZero(double number) {
        System.out.printf("Cannot divide %d by zero", (int) number);
    }

    private static boolean isNumberEven(double number) {


        return number % 2 == 0;
    }

    private static boolean isNumberOdd(double number) {
        return number % 2 != 0;
    }

    private static boolean isOperatorPlus(String operator) {
        return operator.equals("+");
    }

    private static boolean isOperatorMinus(String operator) {
        return operator.equals("-");
    }

    private static boolean isOperatorMultiplier(String operator) {
        return operator.equals("*");
    }

    private static boolean isOperatorDivide(String operator) {
        return operator.equals("/");
    }


    private static void print(double result, double num1, double num2, String operator) {
        if (isNumberEven(result) && isOperatorPlus(operator)) {
            printAdditionEvenNumber(num1, num2, result);
        } else if (isNumberOdd(result) && isOperatorPlus(operator)) {
            printAdditionOddNumber(num1, num2, result);
        } else if (isNumberEven(result) && isOperatorMultiplier(operator)) {
            printMultiplyEvenNumber(num1, num2, result);
        } else if (isNumberOdd(result) && isOperatorMultiplier(operator)) {
            printMultiplyOddNumber(num1, num2, result);
        } else if (isNumberEven(result) && isOperatorMinus(operator)) {
            printSubtractionEvenNumber(num1, num2, result);
        } else if (isNumberOdd(result) && isOperatorMinus(operator)) {
            printSubtractionOddNumber(num1, num2, result);
        } else if (isOperatorDivide(operator)) {
            printDividedNumber(num1, num2, result);
        } else {
            printModuleDividedNumber(num1, num2, result);
        }
    }
}
