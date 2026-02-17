package thisAndToStringAndEquals;
import java.util.Objects; //Objects must be imported for the equals method to override

public class equalsExample {

    String name;
    int age;

    @Override
    public boolean equals(Object obj){
        if (this == obj){ //Remember; this is refer to the object calling the method
            return true;
        }
        if(obj == null){ //Checks to see if the object hasnt been created
            return false;
        }
        if(this.getClass() != obj.getClass()){ //Makes sure our objects class and it's comparer are equal
            return false;
        }
        equalsExample other = (equalsExample)obj;
        return Objects.equals(this.getName(), other.getName()) && Objects.equals(this.getAge(), other.getAge());
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
