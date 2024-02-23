import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //BankCustomer[] ZBank = new BankCustomer[6];
        BankCustomer Chiara = new BankCustomer();
        BankCustomer Clara = new BankCustomer();
        BankCustomer Zicheng = new BankCustomer();
        BankCustomer Dingwen = new BankCustomer();
        BankCustomer Junfeng = new BankCustomer();
        BankCustomer Kailang = new BankCustomer();

        Chiara.setCustomerName("Chiara La Rosa");
        Clara.setCustomerName("Clara La Rosa");
        Zicheng.setCustomerName("Zicheng Liang");
        Dingwen.setCustomerName("Dingwen Tang");
        Junfeng.setCustomerName("Junfeng Yuan");
        Kailang.setCustomerName("Kailang Cheng");

        Chiara.setAccountNumber(040727);
        Clara.setAccountNumber(0);
        Zicheng.setAccountNumber(1);
        Dingwen.setAccountNumber(020723);
        Junfeng.setAccountNumber(010716);
        Kailang.setAccountNumber(020222);

        Chiara.setCustomerAddress("Riposto");
        Clara.setCustomerAddress("Catania");
        Zicheng.setCustomerAddress("Dublin");
        Dingwen.setCustomerAddress("Shenzhen");
        Junfeng.setCustomerAddress("Beijing");
        Kailang.setCustomerAddress("Chongqing");

        Chiara.setCustomerDateOfBirth(040727);
        Clara.setCustomerDateOfBirth(0);
        Zicheng.setCustomerDateOfBirth(1);
        Dingwen.setCustomerDateOfBirth(020723);
        Junfeng.setCustomerDateOfBirth(010716);
        Kailang.setCustomerDateOfBirth(020222);

        ArrayList<BankCustomer> customerList = new ArrayList<BankCustomer>();
        customerList.add(Chiara);
        customerList.add(Clara);
        customerList.add(Zicheng);
        customerList.add(Dingwen);
        customerList.add(Junfeng);
        customerList.add(Kailang);
        /*
        ZBank[0] = Chiara;
        ZBank[1] = Clara;
        ZBank[2] = Zicheng;
        ZBank[3] = Dingwen;
        ZBank[4] = Junfeng;
        ZBank[5] = Kailang;
         */

        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter int >= 2 : ");
        int n = input.nextInt();

        Sieve sieve = new Sieve();
        boolean[] sequence = sieve.createSequence(n);
        System.out.println(sieve.sequenceToString(sequence));

        int i = 2;

        while(i <= 3)
        {
            sieve.crossOutHigherMultiples(sequence, i);
            System.out.println(sieve.sequenceToString(sequence));

            i++;
        }

        System.out.println(sieve.nonCrossedOutSubseqToString(sequence));
        */

        //MethodOverload overloadTest = new MethodOverload();
        //System.out.println(overloadTest.square(5));
        //System.out.println(overloadTest.square(10/2.0));

        //System.out.println(BankCustomer.findCustomer(040727, ));
        //System.out.println(BankCustomer.findCustomer(040727, "Chongqing", ZBank));
        //System.out.println(BankCustomer.findCustomer(3, ZBank));
        System.out.println(BankCustomer.findCustomer(customerList, 040727));

    }
}

//Example Interaction:

//Enterint>=2:10
//2, 3, 4, 5, 6, 7, 8, 9, 10
//2, 3, [4], 5, [6], 7, [8], 9, [10]
//2, 3, [4], 5, [6], 7, [8], [9], [10]
//2, 3, 5, 7

//Enterint>=2:19
//2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19
//2, 3, [4], 5, [6], 7, [8], 9, [10], 11, [12], 13, [14], 15, [16], 17, [18], 19
//2, 3, [4], 5, [6], 7, [8], [9], [10], 11, [12], 13, [14], [15], [16], 17, [18], 19
//2,3,5,7,11,13,17,19