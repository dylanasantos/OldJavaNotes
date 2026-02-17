package streaming;

//Example of a standard parameterized constructor
public class streamingClassRefrence {

    private int age;
    private String name;

    public streamingClassRefrence(String name, int age){
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void exampleMethod(){
        System.out.println("Example");
    }

    @Override
    public String toString(){
        return " " + this.name + " " + this.age;
    }
}
