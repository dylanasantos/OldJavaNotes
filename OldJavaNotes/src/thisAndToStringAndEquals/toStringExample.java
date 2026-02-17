package thisAndToStringAndEquals;
public class toStringExample {
    
    int num;
    String name;

    public void setName(String name){
        this.name = name;
    }
    public void setNum(int num){
        this.num = num;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + " " + "Number: " + this.num;
    }
}
