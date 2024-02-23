public class MethodOverload {
    public static int square(int intValue)
    {
        System.out.println("Called square with int argument: " + intValue);
        return (intValue * intValue);
    }

    public static double square(double doubleValue)
    {
        System.out.println("Called square with double argument: " + doubleValue);
        return (doubleValue * doubleValue);
    }
}
