public class Complex {
    private double x, y;
    Complex(){
        x = y = 0;
    }

    Complex(double realPart, double imaginaryPart){
        x = realPart;
        y = imaginaryPart;
    }

    public static Complex add (Complex a, Complex b){
        Complex result = new Complex(a.x + b.x, a.y + b.y);
        return result;
    }

    public static Complex multiply (Complex a, Complex b){
        Complex result = new Complex(a.x * b.x - a.y * b.y
                , a.x * b.y + a.y * b.x);
        return result;
    }

    public static Complex divide(Complex a, Complex b){
        double realPart = a.x * b.x + a.y * b.y;

        double imaginaryPart = (a.y * b.x - a.x * b.y)
                / (Math.pow(b.x, 2) + Math.pow(b.y, 2));
        Complex result = new Complex(realPart, imaginaryPart);
        if(b.x == 0.0 && b.y == 0.0)
        {
            System.out.println("vvv Error from the division: the divisor is zero! vvv");
        }
        return result;

    }

    public String toString(){
        String result = x + " + i * " + y;
        return result;
    }
}
