import java.util.Scanner;

public class Sieve {
    public int nextPrime;
    public boolean[] createSequence(int n)
    {
        boolean [] sequence = new boolean[n + 1];
        sequence[0] = true;
        sequence[1] = true;
        //  0,   1,   2,   3,   4,   5,   6,   7,   8,   9 ...   n
        // [0], [1], [2], [3], [4], [5], [6], [7]... [n]
        // length = n + 1;
        // true, true, false, false...
        return sequence;
    }

    public int getNextPrime(boolean[] inputArray, int currentPrime)
    {
       while(currentPrime < inputArray.length){
           currentPrime++;
           if(currentPrime < inputArray.length && !inputArray[currentPrime]){
               return currentPrime;
           }
       }
        return 0;
    }

    public void crossOutHigherMultiples(boolean[] inputArray, int n)
    {
        int i = 2;
        int crossOutIndex = n * i;
        int arrayLength = inputArray.length;
        while(crossOutIndex < arrayLength)
        {
            inputArray[crossOutIndex] = true;
            i++;
            crossOutIndex = n * i;
        }
    }

    public String sequenceToString(boolean[] inputArray)
    {
        StringBuilder output = new StringBuilder("");

        int i = 2;
        while( i < inputArray.length)
        {
            if(i == 2)
            {
                output.append("2");
            }
            else
            {
                output.append(", ");
                if (!inputArray[i])
                {
                    output.append(i);
                }
                else
                {
                    output.append("[").append(i).append("]");
                }
            }
            i++;
        }

        return output.toString();
    }

    public String nonCrossedOutSubseqToString(boolean[] inputArray)
    {
        StringBuilder output = new StringBuilder("");
        int i = 2;
        while (i < inputArray.length)
        {
            if(i == 2)
            {
                output.append("2");
            }
            else if (!inputArray[i])
            {
                output.append(", ").append(i);
            }
            i++;
        }
        return output.toString();
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter int >= 2 : ");
        int n = input.nextInt();
        System.out.println(n);

        int nextPrime = 2;
        Sieve sieve = new Sieve();

        boolean[] sequence = sieve.createSequence(n);
        System.out.println(sieve.sequenceToString(sequence));

        while(nextPrime <= 3)
        //need improvement here
        {
            sieve.crossOutHigherMultiples(sequence, nextPrime);
            nextPrime = sieve.getNextPrime(sequence, nextPrime);
            System.out.println(sieve.sequenceToString(sequence));

        }
        System.out.println(sieve.nonCrossedOutSubseqToString(sequence));
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

