public class Student {
    private int age;
    private String name;

    public void setName(String newName) {
        name = newName;
    }

    public String getName()
    {
        return name;
    }

    /*public boolean setAge(int newAge)
    {
        if (newAge > 0 && newAge < 120){
            age = newAge;
            return true;
        }
        else
        {
            return false;
        }
    }
    */

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge()
    {
        return age;
    }
}
