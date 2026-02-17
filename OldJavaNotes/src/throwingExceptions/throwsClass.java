package throwingExceptions;
public class throwsClass {

            //Ignores the ClassNotFoundException and tells wherever it's called to handle it
    public void example1() throws ClassNotFoundException {

        Class.forName("throwsClass1");
    }
}
