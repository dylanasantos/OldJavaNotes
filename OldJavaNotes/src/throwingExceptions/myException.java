package throwingExceptions;
public class myException extends Exception{
    public myException(){}

    public myException(String str)
    {
        super(str);
    }
}