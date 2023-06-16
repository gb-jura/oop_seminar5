public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void calculate() {
        double num1 = view.getFirstNumber();
        double num2 = view.getSecondNumber();
        String operation = view.getOperation();

        double result;

        switch (operation) {
            case "+":
                result = model.add(num1, num2);
                break;
            case "-":
                result = model.subtract(num1, num2);
                break;
            case "*":
                result = model.multiply(num1, num2);
                break;
            case "/":
                try {
                    result = model.divide(num1, num2);
                } catch (ArithmeticException e) {
                    view.showError(e.getMessage());
                    return;
                }
                break;
            default:
                view.showError("Invalid operation");
                return;
        }

        view.showResult(result);
    }
}
