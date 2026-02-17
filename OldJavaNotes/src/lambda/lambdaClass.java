package lambda;
public class lambdaClass implements lambdaInterface, otherLambdaInterface{

    @Override
    public void runLambdaMethod(){
        System.out.println("Lambda Method");
    }

    @Override
    public void lambdaWithInput(String input){
        System.out.println("Lambda with custom input: " + input);
    }
}
