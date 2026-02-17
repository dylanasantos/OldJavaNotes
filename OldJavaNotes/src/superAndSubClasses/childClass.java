package superAndSubClasses;

public class childClass extends parentClass{
    private float shoeSize;

    public float getShoeSize(){
        return shoeSize;
    }
    public void setShoeSize(float shoeSize){
        this.shoeSize = shoeSize;
    }

    public void childMethod(){
        System.out.println("childMethod");
    }
}
