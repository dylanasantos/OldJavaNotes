package interfaceStuff;

public class interfaceClass2 implements interfaceExample{

    @Override //Java checks the interface for a matching name, if none is found it errors out
    public void example(){
        System.out.println("interfaceClass2's method");
    }
}
