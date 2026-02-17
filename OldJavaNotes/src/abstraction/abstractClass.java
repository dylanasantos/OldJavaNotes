package abstraction;

public abstract class abstractClass {
    //Abstract class cannot be instantiated, howevever another class can refrence it's methods
    int myNum = 7;
    
    public void abstractClassMethod(){
        System.out.println("This is an abstract class method");
    }

    abstract void abstractMethod(); //Cannot be defined in it's own class
}
