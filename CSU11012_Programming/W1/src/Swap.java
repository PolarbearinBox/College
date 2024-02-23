public class Swap {
    private double number1;
    private double number2;

    public void setNumbers(double n1, double n2)
    {
        number1 = n1;
        number2 = n2;
    }

    public void getResult()
    {
        number2 = number1 + number2;
        number1 = number2 - number1;
        number2 = number2 - number1;
    }
}
