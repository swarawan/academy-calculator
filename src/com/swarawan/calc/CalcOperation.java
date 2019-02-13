package com.swarawan.calc;

public class CalcOperation {

    String name;

    public String additional(CalcModel model) {
        double result = model.getFirstValue() + model.getSecondValue();
        return model.getFirstValue() + " + " + model.getSecondValue() + " = " + result;
    }

    public String subtraction(CalcModel model) {
        double result = model.getFirstValue() - model.getSecondValue();
        return model.getFirstValue() + " - " + model.getSecondValue() + " = " + result;
    }

    public String multiplication(CalcModel model) {
        double result = model.getFirstValue() * model.getSecondValue();
        return model.getFirstValue() + " * " + model.getSecondValue() + " = " + result;
    }

    public String division(CalcModel model) {
        double result = model.getFirstValue() / model.getSecondValue();
        return model.getFirstValue() + " / " + model.getSecondValue() + " = " + result;
    }
}
