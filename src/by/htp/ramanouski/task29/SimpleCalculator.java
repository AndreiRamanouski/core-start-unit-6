package by.htp.ramanouski.task29;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }

    public double getSubtractionResult(){
        return secondNumber-firstNumber;
    }

    public double getMultiplicationResult(){
        return secondNumber*firstNumber;
    }
    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }
        return firstNumber/ secondNumber;
    }


    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
