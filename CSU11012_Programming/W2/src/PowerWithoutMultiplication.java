public class PowerWithoutMultiplication {
    private double base;
    private double power;
    private double multiple;

    public void setBase(int newBase)
    {
        base = newBase;
        multiple = base;
    }

    public void setPower(int newPower) {
        power = newPower;
    }

    public double getMultiple(){
        double result = 0;
       for(int i = 0; i < base; i++)
       {
           result += base;
       }
       return multiple;
    }

    public double getPower() {
        double result = 1;
        if(power < 0){
            power = -power;
            base = 1/base;
            multiple = base;
        }
        for (int i = 0; i < power; i++) {
            result *= getMultiple();
        }
        return result;
    }
}
