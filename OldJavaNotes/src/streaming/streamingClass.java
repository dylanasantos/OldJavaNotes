package streaming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamingClass {
//streams are an alternative to standard Java navigation through arrays, with multiple methods to choose how you want to navigate

    //An ArrayList of objects from streamingClassRefrence
    List<streamingClassRefrence> example = new ArrayList<>();
    {
        example.add(new streamingClassRefrence("Mike",18));
        example.add(new streamingClassRefrence("James", 27));
        example.add(new streamingClassRefrence("Jordan", 18));
        example.add(new streamingClassRefrence("Charlie", 12));
        
    }

    /*
    for (e x : name ){
        if( x.getAge() > 4){
            otherName.add(x);       <--- Standard Java Navigation
        }
    }
    System.out.println(otherName);
    */

    List<streamingClassRefrence> otherExample1 = new ArrayList<>();
    public void example1(){
        otherExample1 = example.stream()
            .filter(streamingClassRefrence -> streamingClassRefrence.getAge() > 12) //filters out any age greater than 12
            .toList(); //formats in List style
        
        System.out.println(otherExample1);
    }

    List<Integer> otherExample2 = new ArrayList<>(); //Since we are only handling ints, we must refrence the Integer class for list type
    public void example2(){
        otherExample2 = example.stream()
            .map(streamingClassRefrence -> streamingClassRefrence.getAge()) //Displays all ages from the example ArrayList
            .toList();
        
        System.out.println(otherExample2);
    }

    List<Integer> otherExample3 = new ArrayList<>();
    public void example3(){
        otherExample3 = example.stream()
            .map(streamingClassRefrence -> streamingClassRefrence.getAge())
            .sorted() //Sorts the ages from least to greatest
            .toList();

        System.out.println(otherExample3);
    }

    List<Integer> otherExample4 = new ArrayList<>();
    public void example4(){
        otherExample4 = example.stream()
            .skip(2) //Will skip 2 elements (18 & 27)
            .map(streamingClassRefrence -> streamingClassRefrence.getAge())
            .sorted()
            .toList();

        System.out.println(otherExample4);
    }

    List<Integer> otherExample5 = new ArrayList<>();
    public void example5(){
        otherExample5 = example.stream()
            .limit(2) //Limits the new ArrayList to only 2 elements
            .map(streamingClassRefrence -> streamingClassRefrence.getAge())
            .sorted()
            .toList();
        
        System.out.println(otherExample5);
    }

    /*
    List<Integer> otherExample6 = new ArrayList<>();
    public void example6(){
        otherExample6 = example.stream()
            .map(streamingClassRefrence -> streamingClassRefrence.getAge())
            .peek(System.out::println())               <--- For some reason sysout errors, however this is functional in main
            .sorted()
            .toList();
    }
    */

    public void example7(){
        example.stream()
            .map(streamingClassRefrence -> streamingClassRefrence.getAge())
            .sorted()
            .forEach(System.out::println); //Prints out each item one by one (notice the ::)
    }

    public void example8(){
        example.stream()                        //vvv(NOTE: Notice its a method of streamingClassRefrence)
            .forEach(streamingClassRefrence -> streamingClassRefrence.exampleMethod()); //runs the exampleMethod for each element
    }

    public void example9(){
        example.stream()
            .map(streamingClassRefrence -> streamingClassRefrence.getAge())
            .collect(Collectors.toSet()); //converts to a set
    }

    public void example10(){
        boolean bool = example.stream() //Using a bool variable to detect if it's true or false
            .map(streamingClassRefrence -> streamingClassRefrence.getAge())
            .anyMatch(age -> age == 12); //Checks if any age variable in streamingClassRefrence is equal to 12

        System.out.println(bool);
    }

    public void example11(){
        boolean bool = example.stream() //Using a bool variable to detect if it's true or false
            .map(streamingClassRefrence -> streamingClassRefrence.getAge())
            .noneMatch(age -> age == 12); //Checks if any age variable in streamingClassRefrence is NOT equal to 12

        System.out.println(bool);
    }

}
