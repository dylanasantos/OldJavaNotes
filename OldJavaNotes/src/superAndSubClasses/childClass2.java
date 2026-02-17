package superAndSubClasses;

public class childClass2 extends parentClass {
    
    //Overrides parentMethod
    @Override //Makes sure override executes properly
    public void parentMethod() {
        System.out.println("Overriden Parent Method");
    }
}
