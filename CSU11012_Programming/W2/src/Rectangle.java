public class Rectangle {
    private int  length;
    private int  breadth;
    Rectangle(int newLength, int newBreadth){
        length = newLength;
        breadth = newBreadth;

    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int rectLength)
    {
        length = rectLength;
    }

    public int getBreadth()
    {
        return breadth;
    }

    public void setBreath(int rectBreath)
    {
        breadth = rectBreath;
    }

}
