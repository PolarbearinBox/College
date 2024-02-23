import java.util.ArrayList;

public class BankCustomer {
    private int accountNumber;
    private String customerName;
    private String customerAddress;
    private int customerDateOfBirth;

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(int accNumber)
    {
        accountNumber = accNumber;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String name)
    {
        customerName = name;
    }

    public String getCustomerAddress()
    {
        return customerAddress;
    }

    public void setCustomerAddress(String address)
    {
        customerAddress = address;
    }

    public int getCustomerDateOfBirth()
    {
        return customerDateOfBirth;
    }

    public void setCustomerDateOfBirth(int dob)
    {
        customerDateOfBirth = dob;
    }

    public static String findCustomer(int inputAccountNumber, BankCustomer[] customers){
        for(int i = 0; i < customers.length; i++)
        {
            if(customers[i].accountNumber == inputAccountNumber)
            {
                return customers[i].customerName;
            }
        }
        return "Check what you've typed in again??";
    }
    public static String findCustomer(int inputDateOfBirth, String inputAddress, BankCustomer[] customers)
    {
        for(int i = 0; i < customers.length; i++)
        {
            if(customers[i].customerDateOfBirth == inputDateOfBirth
                    && customers[i].customerAddress.equalsIgnoreCase(inputAddress))
            {
                return customers[i].customerName;
            }
        }
        return "Check what you've typed in again??";
    }

    public static String findCustomer(ArrayList<BankCustomer> array, int accNumber)
    {
        for (int i = 0; i < array.size(); i++)
        {
            if(array.get(i).getAccountNumber() == accNumber)
            {
                return array.get(i).getCustomerName();
            }
        }
        return "didn't find nothing~";
    }

}