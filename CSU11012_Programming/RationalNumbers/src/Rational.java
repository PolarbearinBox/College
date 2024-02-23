public class Rational {
    private int numerator, denominator;
    private double value;
    Rational(int inputNumerator, int inputDenominator){
        numerator = inputNumerator;
        denominator = inputDenominator;
        value = (double) numerator/denominator;
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }

    public Rational mul(Rational input){
        Rational result = new Rational(numerator*input.numerator,
                        denominator*input.denominator);
        return result;
    }
    public Rational div(Rational input){
        Rational result = new Rational(numerator*input.denominator,
                denominator*input.numerator);
        return result;
    }
    public Rational add(Rational inputRational){
        int resultDenominator = this.denominator * inputRational.denominator;
        int resultNumerator = this.numerator * inputRational.denominator + inputRational.numerator * this.denominator;
        Rational result = new Rational(resultNumerator, resultDenominator);
        return result;
    }
    public Rational sub(Rational inputRational){
        int resultDenominator = this.denominator * inputRational.denominator;
        int resultNumerator = this.numerator * inputRational.denominator - inputRational.numerator * this.denominator;
        Rational result = new Rational(resultNumerator, resultDenominator);
        return result;
    }
    public boolean equals(Rational input){}
    public boolean isLessThan(Rational input){}
    public Rational simplify(){}
    public String toString(){
        return (numerator + "/" + denominator);
    }
    public void prime(int input)
    {
        int remainder = 0;
        for(int i=2;remainder == 0;i++)
        {
            remainder = input % i;
        }
    }

}
