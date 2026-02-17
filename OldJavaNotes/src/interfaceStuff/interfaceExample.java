package interfaceStuff;

public interface interfaceExample {

    //Interfaces can gaurantee completely different classes functionality
    //That means each class has the methods written in the interface letter for letter, for example:
    public void example();
    //Any class implemented must have a void type called example, and if parameters are given it needs those too
    
    //They are also great for genericness, say you have multiple classes with similar methods,
    //Instead of creating a method for each class to check and run if it has example, we can use interfaces
    //Refer to main^^^
}