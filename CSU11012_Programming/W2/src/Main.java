public class Main {
    public static void main(String[] args) {
        int i = 0;
        int base = -2;
        int power = -4;

        Rectangle esempio = new Rectangle(89, 64);

        Dog dog1 = new Dog();
        dog1.breed = "Mastiff";  // we can directly access the attribute 'cause it's public
        dog1.age = 2;

        Dog dog2 = new Dog();
        dog2.breed = "Maltese";
        dog2.age = 1;

        Rectangle[] rectangleArray = new Rectangle[10]; // create an array of objects

        Student studentArray[] = new Student[2];

        Student Chiara = new Student();
        studentArray[0] = Chiara;

        Student Zicheng = new Student();
        studentArray[1] = Zicheng;

        while(i <= 1)
        {
            studentArray[i].setName((i == 0? "Chiara":"Zicheng"));
            studentArray[i].setAge((i == 0? 190: -21));

            System.out.println(studentArray[i].getName() + " is "
                             + studentArray[i].getAge() + " years old.");

            if(studentArray[i].getAge() >= 120 || studentArray[i].getAge() < 0)
            {
                System.out.println("Are you serious??"
                                + (i >=1? "????":""));
            }
            i++;
        }

        BankCustomer bankCustomerArray[] = new BankCustomer[3];

        BankCustomer Dingwen = new BankCustomer();
        bankCustomerArray[0] = Dingwen;
        BankCustomer Kailang = new BankCustomer();
        bankCustomerArray[1] = Kailang;
        BankCustomer Junfeng = new BankCustomer();
        bankCustomerArray[2] = Junfeng;

        PowerWithoutMultiplication sample = new PowerWithoutMultiplication();
        sample.setBase(base);
        sample.setPower(power);

        System.out.println(base + " to the power of " + power + " is " +sample.getPower());

        System.out.println("the year was 19" + esempio.getLength());
        System.out.println("the month and date is " + esempio.getBreadth());

    }
}