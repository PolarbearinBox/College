public class Main {
    public static void main(String[] args) {



        Complex c1 = new Complex(1, 0);
        Complex c2 = new Complex(0, 0);
        Complex c3 = new Complex();

        System.out.println("c1 = " + c1.toString());
        System.out.println("c2 = " + c2.toString());

        c3 = Complex.add(c1, c2);
        System.out.println("c1 + c2 = " + c3.toString());
        c3 = Complex.multiply(c1, c2);
        System.out.println("c1 * c2 = " + c3.toString());
        c3 = Complex.divide(c1, c2);
        System.out.println("c1 / c2 = " + c3.toString());
        /*

        Student Chiara = new Student("Chiara");
        Student who = new Student();
        Chiara.printName();
        who.printName();

        Box myBox1 = new Box();
        Box myBox2 = new Box(8, 9, 6);
        Box cube  = new Box(8);

        System.out.println("Box1's volume is " + myBox1.getVolume());
        System.out.println("Box2's volume is " + myBox2.getVolume());
        System.out.println("Cube volume is " + cube.getVolume());

         */


    }
}