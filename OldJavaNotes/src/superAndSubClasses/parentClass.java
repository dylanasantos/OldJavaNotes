package superAndSubClasses;

public class parentClass {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void parentMethod(){
        System.out.println("parentMethod");
    }

    public final void finalMethod(){ //Final prevents child classes from changing the method
        System.out.println("finalMethod");
    }
}
