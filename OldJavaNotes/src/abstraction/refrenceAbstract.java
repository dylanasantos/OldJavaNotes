package abstraction;

public class refrenceAbstract extends abstractClass {

    public void callingAbstract(){
        System.out.println("This is callingAbstract calling abstractClassMethod: ");
        abstractClassMethod(); //refrenceAbstract is still able to call methods and variables
    }

    public void callingAbstractVar(){
        System.out.println("Calling Abstract Class Variables:");
        System.out.println(myNum);
    }

    @Override
    public void abstractMethod() { //Note: Each child of abstractClass must define this method
        System.out.println("This is an abstract method overwritten");
    }
}
