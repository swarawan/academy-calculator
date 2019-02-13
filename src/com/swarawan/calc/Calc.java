package com.swarawan.calc;

import java.util.Scanner;

public class Calc extends CalcOperation {

    private Scanner scanner = new Scanner(System.in);
    private CalcModel model = new CalcModel();

    public void start() {
        System.out.println("======== Start Calculator ========");
        System.out.print("First value: ");
        model.setFirstValue(scanner.nextDouble());

        System.out.print("Second value: ");
        model.setSecondValue(scanner.nextDouble());

        System.out.println("Operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Division");
        System.out.print("Choose operation (1..4): ");

        int operation = scanner.nextInt();
        if (operation == 1) {
            System.out.println("Result: " + additional(model));
        } else if (operation == 2) {
            System.out.println("Result: " + subtraction(model));
        } else if (operation == 3) {
            System.out.println("Result: " + multiplication(model));
        } else if (operation == 4) {
            System.out.println("Result: " + division(model));
        } else {
            System.out.println("Operation not valid");
            System.exit(0);
        }
    }

    @Override
    public String additional(CalcModel model) {
        return "Contoh model: " + model.getFirstValue();
    }
}
