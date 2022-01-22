public class Calculator {
    AdditionService additionService;
    SubtractionService subtractionService;
    MultiplicationService multiplicationService;

    public Calculator(AdditionService additionService) {
        this.additionService = additionService;
    }

    public Calculator(SubtractionService subtractionService) {
        this.subtractionService = subtractionService;
    }

    public Calculator(MultiplicationService multiplicationService) {
        this.multiplicationService = multiplicationService;
    }

    public int performAddition(int x, int y) {
        return additionService.add(x, y) + x;
    }

    public int performSubtraction(int x, int y) {
        return subtractionService.subtract(x, y) - x;
    }

    public int calculate(int x, int y) {
        return multiplicationService.multiply(x, y) * x;
    }
}
