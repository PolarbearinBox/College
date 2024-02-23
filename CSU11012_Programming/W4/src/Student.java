public class Student {
    private String name;
    Student (){
        name = "unknown";
    }
    Student(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }
    public void printName(){
        System.out.println(name);
    }
}
