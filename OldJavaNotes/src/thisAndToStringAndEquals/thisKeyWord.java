package thisAndToStringAndEquals;
public class thisKeyWord {
    private String name; //Variables for thisKeyWord Class
    private int number;

    //Used to make a non-argumentative constructor
    public thisKeyWord(){
        this.name = "Default_Name";
        this.number = 0;
    }

    //Alternate method for a no args constructor:

    /*public thisKeyWord(){
        this("Default_Name",0);
    }*/

    //Used to make a parameterized constructor
    public thisKeyWord(String name, int number){
        this.name = name;
        this.number = number;
    }



    public void setName(String name) {
        this.name = name; //this. refers to the classes name variable
    }
    public void setNum(int number){
        this.number = number; //this. refers to the classes number variable
    }

    public String getName(){
        return this.name; //this. is not required, but seen as good practice of clarification
    }
    public int getNum(){
        return this.number; //this. is not required, but seen as good practice of clarification
    }
    public String example(){
        return name; //Here is an example of the same method without using .this
    }
}
