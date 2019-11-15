
public class Calculator {

    public double calcAddition(double num1, double num2) {
        return num1 + num2;
    }

    public int calcArraySize(int[] numbers) {
        return arraySize(numbers);
    }
    public double calcDivsion(int num1,int num2){
        return num1 / num2;
    }
    private int arraySize(int[] numbers) {
        return numbers.length;
    }
}
