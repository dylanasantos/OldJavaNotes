//Built in Java packages & classes

import java.util.*;
import abstraction.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.*;
import java.time.format.*;

//Personal packages & classes
import sortingAndSearching.*;
import superAndSubClasses.*;
import thisAndToStringAndEquals.*;
import throwingExceptions.*;
import interfaceStuff.*;
import lambda.lambdaClass;
import lambda.lambdaInterface;
import lambda.otherLambdaInterface;
import streaming.*;

public class Main {
    enum innerEnumExample{
        LOW,
        MEDIUM,
        HIGH
    }

    public static final double CONSTANT_VARIABLE = 3.14; //Final variable cannot be changed

    public static void main(String[] args) throws Exception{

        String test = "sigma";
        System.out.println(test.length());

        s();
        System.out.println("<-------------------------JAVA NOTES------------------------->");
        s();

            //.this Section
        System.out.println("<-------------------------THIS. / CONSTRUCTORS------------------------->");
        thisKeyWord keyWordTest1 = new thisKeyWord();
        keyWordTest1.setName("Jared"); //Sets name to Jared
        
        thisKeyWord keyWordTest2 = new thisKeyWord();
        keyWordTest2.setNum(7); //Sets number to 7
        
        System.out.println("Extracting a name with this. --> " + keyWordTest1.getName()); //Calls the name of keyWordTest
        System.out.println("Extracting a name alternatively --> " + keyWordTest1.example()); //Refer to thisKeyWord.java for more info
        
        System.out.println("Extracting a number with this. --> " + keyWordTest2.getNum());
        
        thisKeyWord defaultValues = new thisKeyWord(); //No args constructor, refers to default values
        System.out.println("Creation of default values --> " + defaultValues.getName() + ", " + defaultValues.getNum());
        s();

        //Scanner Section & Switches
        System.out.println("<-------------------------SCANNER CLASS------------------------->");
        //Scanner Class Detects user input, and can only be run through our main class
        String name;

        Scanner userInput = new Scanner(System.in); //Creates a new object from Java's scanner class to detect input
        //System.in clarifies that it is user input

        System.out.println("Enter your name: ");
        name = userInput.nextLine();
        //If find an int you would use nextInt(); for floats it would be nextFloat(); and so on

        System.out.println("Name: " + name);
        userInput.close();
    
        //Ternary Operators
        System.out.println("<-------------------------TERNARY OPERATORS & SWITCHES------------------------->");
        int num = 7;
        String checkNum;
        checkNum = num > 5 ? "Bigger Number" : "Smaller Number";
        //? = Checking if the number is greater than 5, if so it prints "Bigger Number"
        //: = else, print "Smaller number" 

        String checkNum2 = num == 7 ? "Equals 7" : "Doesn't equal 7"; //Alternate method of printing a Ternary Operator

        System.out.println("Printing Ternary Operator: " + checkNum);
        System.out.println("Alternate Printing Ternary Operator: " + checkNum2);

        //Ternary Operators also work with other variable types
        int tOExample1 = 9;
        int tOExample2 = 13;
        int tOMaxValue = tOExample1 > tOExample2 ? tOExample1 : tOExample2;

        System.out.println("Maximum Value: " + tOMaxValue);
        s();

        //Switches
        String day = "Friday";
        switch (day) { //Literally just a glorified if/else
            case "Monday": //Checks if day = Monday
                System.out.println("It's monday");
                break;
        
            default: //Runs if "Monday" is not met
            System.out.println("It's not monday");
                break;
        }

        //alternative form:
        switch (day) {
            case "Monday": //Checks every case until it meets the proper one, or else it accepts the default
                System.out.println("It's monday");
                break;
            case "Tuesday":
                System.out.println("It's tuesday");
                break;
            case "Wednesday":
                System.out.println("It's wednesday");
                break;
            case "Thursday":
                System.out.println("It's thursday");
                break;
            default: //The positioning of the default does not matter, every case will still be checked
                System.out.println("It is not a weekday");
                break;
            case "Friday":
                System.out.println("It's friday");
                break;
        }
        //It's speed can be better for greater amount of cases

        System.out.println("<-------------------------SUPER & SUB-CLASS------------------------->");
        parentClass pX = new parentClass();
        childClass cX = new childClass();
        childClass2 cY = new childClass2();

        System.out.println("Parent Class:");
        pX.setAge(42);
        pX.setName("Jared");
        pX.parentMethod();

        System.out.println("Age: " + pX.getAge() + ", Name: " + pX.getName()); s();

        System.out.println("Child Class:");
        cX.setAge(7);
        cX.setName("Tom");
        cX.setShoeSize(4.5f);
        cX.childMethod();
        System.out.println("Age: " + cX.getAge() + ", Name: " + cX.getName() + ", Shoe Size: " + cX.getShoeSize()); s();

        System.out.println("Child Class2: ");
        cY.setAge(9);
        cY.setName("Jerry");
        cY.parentMethod();
        System.out.println("Age: " + cY.getAge() + ", Name: " + cY.getName()); s();

        //toString & .equals Section
        System.out.println("<-------------------------TOSTRING & EQUALS------------------------->");
        s();

        toStringExample obj = new toStringExample();
        obj.setName("Jacob");
        obj.setNum(7);

        //toString is a default java program, however calling objects brings the hash code, the location of the object in hexadecimal
        System.out.println("Applying toString Override:");
        System.out.println(obj); //since toString is applied by default, we don't need to call it

        equalsExample newObject = new equalsExample();
        newObject.setAge(7);
        newObject.setName("Dylan");
        s();

        System.out.println("Applying .equals() Override:");
        equalsExample newObject2 = new equalsExample();
        newObject2.setAge(12);
        newObject2.setName("Dylan");

        if(newObject.equals(newObject2)){ //Prints out false as the ages do not align (refer to equalsExample line 20)
            System.out.println("These are equal");
        } else{
            System.out.println("These are not equal");
        }

        newObject.setAge(12);

        if(newObject.equals(newObject2)){ //Since we changed newObject's age to match newObject2's age, they're now equal
            System.out.println("These are equal");
        } else{
            System.out.println("These are not equal");
        }
        s();

        //Array Section
        System.out.println("<-------------------------ARRAYS & 2D ARRAYS------------------------->");

        int[] myIntArray = new int[5]; //An Array of 5 items   <---NOTE: Arrays are a fixed number, they cannot be modified
        myIntArray[0] = 7; //Sets the index 0 equal to 7
        System.out.println("Int Array: " + myIntArray);

        String[] myStringArray = {"Cheese","Ham","Arson"};
        System.out.println("String Array: " + myStringArray);

        //ArrayList Section
        System.out.println("<-------------------------ARRAYLISTS & 2D ARRAYLISTS------------------------->");

        //Note: cannot use primitive types (i.e int)
        List<String> arrayListNames = new ArrayList<String>(); //String specification not required on right side (can use Arraylist<>();)
        System.out.println("ArrayList: " + arrayListNames);

        arrayListNames.add("Jared"); //Add method adds new items to arrayListNames
        arrayListNames.add("Josh"); //Adds automatically to the end of the list
        arrayListNames.add(1,"Blake"); //Adds itself in at index 1

        System.out.println(arrayListNames); //Prints out list

        System.out.println(arrayListNames.get(1)); //Prints out Blake
        arrayListNames.remove(1); //Removes Blake via index
        arrayListNames.add(1,"Blake");
        arrayListNames.remove("Blake"); //Removes Blake via String
        //Note: .remove will only remove the first instance when searching for a specific value
        s();

        arrayListNames.set(1, "Blake"); //sets Josh to Blake
        System.out.println(arrayListNames.size()); //Prints Lists size

        System.out.println(arrayListNames.contains("Blake")); //Checks if Blake is in the list, will print as a boolean
        arrayListNames.clear(); //Completely empties the List
        s();

        arrayListNames.add("James");
        arrayListNames.add("Izzy");
        arrayListNames.add("Ryan");
        Collections.sort(arrayListNames); //Alphabetically sorts strings
        System.out.println("Sorted List: " + arrayListNames);

        Collections.shuffle(arrayListNames); //Shuffles the list randomly
        System.out.println("Shuffled List: " + arrayListNames);

        Collections.reverse(arrayListNames); //Reverses list
        System.out.println("Reversed List: " + arrayListNames);
        s();

        //Creating an Array out of an ArrayList:
        String[] namesArray = arrayListNames.toArray(new String[0]); //new keyword required to prevent type mismatch
        System.out.println("Array formation (Hash code because I'm too lazy to fix): " + namesArray);

        List<String> namesList = Arrays.asList(namesArray); //Converts Array to an ArrayList
        //^Note: Good for wanting a fixed list
        System.out.println("ArrayList formation: " + namesList);

        s();

        //LinkedList Section
        System.out.println("<-------------------------LINKED LISTS------------------------->");
        /*
            LinkedLists have some similarity to ArrayLists, however they posses some different & unique features
                ^This is because they both resonate from the List interface
            
            LinkedLists are stored in "Containers", unlike ArrayLists, which are stored in Arrays
                When the list is made, it has a link to the first container,
                Each container will also have a link to the following container
        */ 

        LinkedList<String> LinkedNames = new LinkedList<>(); //
        LinkedNames.add("David");
        LinkedNames.add("Derek");
        LinkedNames.add("Saul");

        System.out.println("Linked List: " + LinkedNames);

        //Using some unique methods for LinkedLists
        System.out.println(LinkedNames.getFirst()); //Self explanatory
        System.out.println(LinkedNames.getLast()); //^^^

        LinkedNames.addLast("Bron"); //Adds an item to the end of the list
        System.out.println(LinkedNames);

        LinkedNames.addFirst("James"); //Adds an item to the beginning of the list
        System.out.println(LinkedNames);

        LinkedNames.removeLast(); //Removes the item from the end of the list
        System.out.println(LinkedNames);

        LinkedNames.removeFirst(); //Removes the item from the beginning of the list
        System.out.println(LinkedNames);

        //Sets Section
        System.out.println("<-------------------------SET SECTION------------------------->");
        Set<String> nameSet = new HashSet<>(); //<> is also known as a Diamond Operator
        
        nameSet.add("Jerry"); //Adds Sets
        nameSet.add("George");
        nameSet.add("Phil");
        
        System.out.println(nameSet); //Sets have no guaranteed order
        
        nameSet.add("Jerry"); //It will not add, since a "Jerry" already exists and there is no numbering for Sets
        System.out.println(nameSet);

        //Since sets are not organized, we cannot use .get(); but we can still use some others used in ArrayLists;
        System.out.println(nameSet.contains("Jerry"));
        System.out.println(nameSet.isEmpty()); //Checks if nameSet is empty
        nameSet.clear();

        Set<String> nameSet2 = new TreeSet<>(); //TreeSets will always keep their order
        //However, it does have a performance offset

        nameSet2.add("Jerry");
        nameSet2.add("George");
        nameSet2.add("Phil");

        //Because TreeSets are numbered, we can use the .remove(); method
        nameSet2.remove("George");

        String[] nameArray = nameSet2.toArray(new String[0]);
        System.out.println("Converting TreeSets to Arrays (Hash code because I'm too lazy to fix): " + nameArray);

        String[] nameArray2 = {"Paul", "Smith", "Albert"};
        Set<String> namSet2 = new HashSet<>(Arrays.asList(nameArray2));

        System.out.println("Converting Arrays to Sets (Array) (Hash code because I'm too lazy to fix): " + nameArray2);
        System.out.println("Converting Arrays to Sets (Set): " + namSet2);
        s();

        //Map Section
        System.out.println("<-------------------------MAP SECTION------------------------->");

        //Maps also cannot take in primitive types
        Map<Integer,String> employees = new HashMap<>(); //Note: HashMaps do not guarantee order
            //Notice in the diamond operator, Integer represents the Key, String represents the values

        employees.put(2536, "Duke"); //2536 is the id of Duke
        employees.put(1711, "Santos"); //1711 is the id of Santos
        System.out.println("Adding to a Map: " + employees);
        s();

        System.out.println("Retrieving Names: " + employees.get(2536)); //prints out Duke
        System.out.println("Searching for an undefined id: " + employees.get(8701)); //prints out null
        s();

        System.out.println("Using .contains: " + employees.containsKey(2536));
        System.out.println("Using .contains: " + employees.containsValue("Duke"));
        //Note: Maps cannot contain duplicate keys but can contain duplicate values
        s();

        employees.replace(2536, "Name"); //Only replaces if the key exists
        System.out.println("Using .replace: " + employees);
        employees.put(2536, "Duke"); //Overrides value if 2536 is already present, else it is added
        System.out.println("Using .put: " + employees);
        s();

        employees.putIfAbsent(2536, "Jerry"); //Only adds if the key is non-existent
        employees.putIfAbsent(1821, "Jerry");
        System.out.println("Using .putIfAbsent: " + employees);
        s();

        employees.remove(2536,"Name"); //Will only remove if 2536 = "Name"
        System.out.println("Using .remove: " + employees);
        employees.remove(2536); //Removes 2536
        System.out.println("Using .remove: " + employees);
        s();

        employees.put(2536, "Duke");

        System.out.println("Printing out every employee ID:");
        for(Integer employeeID : employees.keySet()){ //using Integer not int since we cannot use a primitive
            System.out.println(employeeID); //^.keySet is all the keys inside of the Map
        }
        s();
        System.out.println("Printing out every employee Name: ");
        for(String employeeName : employees.values()){ //Since the names are Strings, they are navigated via String
            System.out.println(employeeName);
        }

        /*Notes:
         * LinkedHasMap will maintain the order you declared values for the map
         * TreeMaps will maintain the order in numeric value by ID (i.e 1275, 1711, 2506...)
         * 
         * However, both of these maps require some performance penalty, HashMap is the fastest
         */
        s();

        //Iterator Class Section
        System.out.println("<-------------------------ITERATOR CLASS------------------------->");
        //Java has an Iterator class, similar to the iteration we do
                //(Note: Iteration is running through something with a loop)
        
        ArrayList<String> iteratorArrayList = new ArrayList<>();
        iteratorArrayList.add("Item1");
        iteratorArrayList.add("Item2");
        iteratorArrayList.add("Item3");

        Iterator<String> it = iteratorArrayList.iterator();

        //Looping through a collection
        while(it.hasNext()){
            System.out.println(it.next()); //Prints out the next Item
        }

        it = iteratorArrayList.iterator(); //Resets the iterator by redefining it
        //Example use of an iterator
        while(it.hasNext()){
            String iteratorVar = it.next();

            if(iteratorVar.equals("Item2")){
                it.remove(); //When the iterator runs the remove command, it will also remove it from the ArrayList
            }
        } //Note: A for-each loop or for loop would not work as while it loops it's updating in size as its looping
        System.out.println(iteratorArrayList);
        
        s();
        
        //Recursion Section
        System.out.println("<-------------------------RECURSIONS------------------------->");
        //Recursions are a method that will repeatedly call itself in the return until given a different return
        //Whilst recursions are beneficial, they take up memory in "the stack" and can create a stack overflow

        recursions addRecursionObj = new recursions();  //Refur to recursions class for more info
        String addRecursion = addRecursionObj.recursionToString(addRecursionObj.recursionAdd(5));
        System.out.println("Adding with Recursions:" + addRecursion);

        recursions subtractRecursionObj = new recursions();
        String subtractRecursion = subtractRecursionObj.recursionToString(subtractRecursionObj.recursionSubtract(25));
        System.out.println("Subtracting with Recursions:" + subtractRecursion);

        recursions multiplyRecursionObj = new recursions();
        String multiplyRecursion = multiplyRecursionObj.recursionToString(subtractRecursionObj.recursionMultiply(5));
        System.out.println("Multiplying with Recursions:"+ multiplyRecursion);

        recursions mixRecursionObj = new recursions();
        String mixRecursion = mixRecursionObj.recursionToString(mixRecursionObj.recursionMix(13));
        System.out.println("Mixing up Recursions:" + mixRecursion);

        //Binary Search Section
        System.out.println("<-------------------------BINARY SEARCH------------------------->");
        int[] binaryIntArray = {0,1,2,3,4,5,6,7,8,9};
        double[] binaryDoubleArray = {3.3, 4.5, 4.78, 4.99, 5.01, 6.83}; 

        //Check binarySearching.java for notes, located inside the sortingAndSearching package
        int binaryX = binarySearching.iBinarySearch(binaryIntArray, 0, binaryIntArray.length-1, 7);
        System.out.println(binarySearching.doubleBinaryToString(binaryX));
        double binaryY = binarySearching.dBinarySearch(binaryDoubleArray, 0, binaryDoubleArray.length-1, 6.83);
        System.out.println(binarySearching.doubleBinaryToString(binaryY));
        int binaryZ = binarySearching.iBinarySearch(binaryIntArray, 0, binaryIntArray.length-1, 7);
        System.out.println(binarySearching.recursionBinaryToString(binaryZ));
        s();

        //Sorting Section
        System.out.println("<-------------------------SORTING------------------------->");
        int[] sortNum1 = {4,5,9,18,2};
        int[] bigArray = new int [1000]; //Array with 1,000 items
        Random randomizer = new Random(); //Calls the randomizer class

        for(int i = 0; i < bigArray.length; i++){
            bigArray[i] = randomizer.nextInt(1,1000);
        } //Runs a for loop to fill each index with a random number (1-1000)

        //Sorting
        sorting.selectionSort(sortNum1); //Shows each step in the sorting process
        System.out.println(sorting.arrayToString(sortNum1));

        int[] sortNum2 = {4,5,9,18,2};
        sorting.insertionSort(sortNum2);
        System.out.println(sorting.arrayToString(sortNum2));

        long startTime = System.currentTimeMillis();//With bigger Arrays we start to see a slow down in speed

        sorting.bigSort(bigArray);
        System.out.println("Big Sorting: " + sorting.arrayToString(bigArray));

        long endTime = System.currentTimeMillis();
        long time = endTime - startTime; //Total time taken to navigate
        System.out.println("Total time to sort: " + time + "ms");
        s();

        //Interface Section
        System.out.println("<-------------------------INTERFACES------------------------->");
        s();

        /*
            Interfaces are good for multiple things, one being a replacement for inheriting since Java does not support double parent
            Inheritance
        */
        interfaceClass example1 = new interfaceClass();
        interfaceClass2 example2 = new interfaceClass2();   

        interfaceMethod(example1);
        interfaceMethod(example2);
        s();

        //Exception Section
        System.out.println("<-------------------------EXCEPTIONS------------------------->");
        s();

        try{
            int exceptionInt = Integer.parseInt("Number");
            System.out.println(exceptionInt);
            System.out.println("Number Achievable");
        } catch(NumberFormatException nfe){ //Will ONLY catch a NumberFormatException
            System.out.println("Number not Achievable");
        } //Note: it's good practice to name it after the exception by using each capitalized letter hence nfe

        //There are multiple exception types and subtypes of the exception
        //For example: NumberFormatException is a subtype of RunTimeException, so we can also use RunTimeException:
        try{
            int exceptionInt = Integer.parseInt("Number");
            System.out.println(exceptionInt);
            System.out.println("Number Achievable");
        } catch(RuntimeException rte){
            System.out.println("Number not Achievable");
        }

        //Every exception is a subtype of exception, if we want to prevent ALL exceptions, we just use Exception:
        try{
            int exceptionInt = Integer.parseInt("Number");
            System.out.println(exceptionInt);
            System.out.println("Number Achievable");
        } catch(Exception e){
            System.out.println("Number not Achievable");
        } //Throwable can technically be used but that also cancels out errors, which are much more in depth
        //For example: an error from lack of storage

        //Multiple catches can be done
        try{
            int exceptionInt = Integer.parseInt("Number");
            System.out.println(exceptionInt);
        } catch(NullPointerException npe){
            System.out.println("Null Pointer Exception");
        } catch(NumberFormatException nfe){
            System.out.println("Number Format Exception");
        }

        //Multiple catches with same result
        try{
            int exceptionInt = Integer.parseInt("Number");
            System.out.println(exceptionInt);
        } catch(NullPointerException | NumberFormatException e){
            System.out.println("Either NullPointerException or NumberFormatException");
        }

        //You can also call the variables you make
        try{
            int exceptionInt = Integer.parseInt("Number");
            System.out.println(exceptionInt);
        } catch(NumberFormatException nfe){
            nfe.printStackTrace(); //Prints out the same error line but keeps running code
            System.out.println("Number Not Achievable");
        }

        //Applying the finally block
        try {
            int exceptionInt = Integer.parseInt("Number");
            System.out.println(exceptionInt);
        } catch(NumberFormatException nfe){
            System.out.println("Number Not Achievable");
        } finally { //Will ALWAYS runs whether catch is true or false
            System.out.println("Final Statement");
        } 
        s();

        //Try blocks can also have parameter intakes, which will attempt to close an object
        try(tryClass tryObj = new tryClass();){
            System.out.println("Try Class");
        } catch (Exception e){
            System.out.print("Exception caught: ");
            e.printStackTrace();
        } finally {
            s();
        } //only classes that import closeable or autoclosable can work

        //Streams
        System.out.println("<-------------------------STREAMS------------------------->");

        streamingClass streamObj = new streamingClass();

        //Refer to streamingClass & streamingClassRefrence class for more
        streamObj.example1();
        streamObj.example2();
        streamObj.example3();
        streamObj.example4();
        streamObj.example5();
        streamObj.example7();
        streamObj.example8();
        streamObj.example9();
        streamObj.example10();
        streamObj.example11();    

        //Abstraction
        System.out.println("<-------------------------ABSTRACTION------------------------->");
        //Check abstractClass and refrenceAbstract for more info

        refrenceAbstract abstractVar = new refrenceAbstract();
        abstractVar.callingAbstract(); //abstractVar is a child of abstractClass, allowing it to call abstractClass' method
        s();
        abstractVar.callingAbstractVar();
        s();
        abstractVar.abstractMethod(); //abstractMethod is overwritten in refrenceAbstract
        s();

        //Throw & throws
        System.out.println("<-------------------------THROWING------------------------->");
        //Allows us to create new exceptions or input new ones

        int tX = 15;

        try{
            if(tX < 16){
                throw new NumberFormatException("Number Should Be Greater Than 15"); //Creates a new NFE that gives different text
            } //Will catch the first Exception that is thrown
            if(tX == 15){
                throw new Exception("Number Cannot Equal Exactly 15"); //Any Exception Class can be used
            }
        } 
        catch(Exception e){
            System.out.println("Something Went Wrong: " + e); //Prints out text and the new NFE
        }

        try{
            if(tX < 16){    //NOTE: Any Exception Class can be used when throwing
                throw new NumberFormatException("Number Should Be Greater Than 15"); //Creates a new NFE that gives different text
            } //Will catch the first Exception that is thrown
        } 
        catch(NullPointerException e){
            System.out.println("Something Went Wrong: " + e); //Prints out text and the new NFE
            //If it is not an NPE the text will not be applied
        }
        catch(NumberFormatException e){
            System.out.println("Something Went Wrong: " + e); //Prints out text and the new NFE
            //If it is not an NFE the text will not be applied
        }
                //NOTE: While any Exception class varying in size can be used for the catch block, it is not applicable to the throw
                //i.e Catching with an NFE but throwing a standard Exception

        try{
            if(tX < 16){
                throw new myException("Custom Exception");
            }
        } catch(myException e){
            System.out.println("Something Went Wrong: " + e);
        }
        
        //Using Throws:

        //Throws pretty much tells Java it is not responsible for checking the exception
        try{
            throwsClass throwsObj = new throwsClass();
            throwsObj.example1(); //Check throwsClass Class for more info
        } catch(Exception e){
            System.out.println("Something Went Wrong: " + e);
        }

        //Enums
        System.out.println("<-------------------------ENUMS------------------------->");
        //enums follow rules similar to classes, with the exception of inheritance, and objects
        //enum constants are public, static, and final  <---  (cannot be overriden)

        //enums are great place for storing constants
        enumExample enumX = enumExample.LOW;
        System.out.println(enumX);

        innerEnumExample enumY = innerEnumExample.HIGH;
        System.out.println(enumY);

        enumExample enumZ = enumExample.MEDIUM;

        //Enums are commonly used in switches
        switch(enumZ){
            case LOW:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
        }
        //Navigating through an enum
        int enumNavigator = 0;
        for(enumExample enumVar : enumExample.values()){
            enumNavigator++;
            System.out.println("enum" + enumNavigator + ": " + enumVar);
        }

        
        //Using java.time
        System.out.println("<-------------------------USING JAVA.TIME------------------------->");

            //Some classes offered by java.time:
            /*
            *  LocalDate   -->   Represents a date (yyyy-MM-dd)
            *  LocalTime   -->   Represents a time (HH-mm-ss-ns -> (HH = hour, mm = minute, ss = second, ns = nanosecond))
            *  LocalDateTime  -->   Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
            *  DateTimeFormatt   -->   Formatter for displaying and parsing date-time objects
            */
    
        //Printing out times
        LocalDate localDateateObj = LocalDate.now();
        System.out.println(localDateateObj);

        LocalTime localTimeObj = LocalTime.now();
        System.out.println(localTimeObj + "\n");

        LocalDateTime localDateTimeObj = LocalDateTime.now();
        System.out.println("Before formatting: " + localDateTimeObj);

            //Formatting the time
        DateTimeFormatter dateTimeFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = localDateTimeObj.format(dateTimeFormatObj); //Uses a String variable to write the new date format
        System.out.println("After formatting: " + formattedDate);

            //If you do not want to include a timestamp in your new format, just don't write it in your .ofPattern method
        DateTimeFormatter newDateTimeFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String newFormattedDate = localDateTimeObj.format(newDateTimeFormatObj);
        System.out.println("After formatting: " + newFormattedDate);

            //There is alternate ways to have dates be output, rather than just numbers:
            /*
            * E  --->  Returns the day (i.e Saturday)
            * MMM  --->  Returns the month in text (Apr)
            */
        s();
        System.out.println("Creating a \"Random\" Number:");

        LocalDateTime randomTime = LocalDateTime.now();
        DateTimeFormatter getNanoSeconds = DateTimeFormatter.ofPattern("nn"); //Formats
        String timeFormatter = randomTime.format(getNanoSeconds);

        String adjustNumber = timeFormatter.substring(0,8);
        Integer pseudoRandom = Integer.parseInt(adjustNumber);

        while(pseudoRandom >= 100){
            pseudoRandom /= 3;
        }
        System.out.println("Random Number: " + pseudoRandom);

        //Using Lambda Function
        System.out.println("<-------------------------USING LAMBDAS------------------------->");

        lambdaClass lambdaObj = new lambdaClass(); //This is the default way we print out things from an interface
        printLambda(lambdaObj); //We create an object that contains the method then run it, however lambdas can help simplify

        //Example of a lambda:
        printLambda(
            () -> { //This lambda is simply directing it straight to the method we want to use, without the use of an object
                System.out.println("Lambda Method");
            }
        );

        //For visualization, here's what it's really doing:

        /*
        printLambda(
            public void runLambdaMethod(){         <-- NOTE: It errors since the proper syntax remove the type, name, and accessibility
                System.out.println("Lambda Method");       The Compiler is already aware of those so we just direct it with a "->"
            }
        );
        */

        //However since this lambda is one line of code, we can simplify it even more:
        printLambda(() -> System.out.println("Lambda Method"));

        //Lambdas can also be assigned to variables
        lambdaInterface lambdaVariable1 = () -> System.out.println("Lambda Method");
        printLambda(lambdaVariable1);
        

        //IMPORTANT: Lambdas can only be used for interfaces with a single method

        
        otherLambdaInterface lambdaVariable2 = (s) -> System.out.println("Other Lambda Method" + s);
        printOtherLambda(lambdaVariable2);


        //File Exploration
        System.out.println("<-------------------------FILE EXPLORATION------------------------->");
        try {
            File myObj = new File("D:\\Java\\textDocument.txt"); //creates a File obj that navigates the text document
            Scanner myReader = new Scanner(myObj); //creates a scanner class and is instantiated off of the obj used for our file
            while (myReader.hasNextLine()) { //runs a for loop to print out the entire text document
              String data = myReader.nextLine(); //will store each line in the text doc into data
              System.out.println(data);
            }
            myReader.close(); //Closes scanner to prevent resource leak
          } catch (FileNotFoundException e) { //Catches incase the file is not located off directory given
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        
        File myObj = new File("D:\\Java\\textDocument.txt"); //creates a File obj that navigates the text document
        if(myObj.exists()){
            System.out.println("\nFile name: " + myObj.getName()); //prints out name of the file itself
            System.out.println("Absolute path: " + myObj.getAbsolutePath()); //prints out file directory path
            System.out.println("Writeable: " + myObj.canWrite()); //Checks if it's possible to write on file
            System.out.println("Readable: " + myObj.canRead()); //Checks if file's readable
            System.out.println("File size in bytes: " + myObj.length()); //Extracts length in bytes
        } else {
            System.out.println("File " + myObj.getName() + " not found");
        }           //getName still functions even if file isn't found^
        //myObj.delete(); <-- Deletes File
            //NOTE: Because it will delete the file, if you re-run the code it will error since it's gone, this is why it's commented out

    }

    
    public static void s(){
        System.out.println("");
    }
    
    public static void printLambda(lambdaInterface thing){
        thing.runLambdaMethod();
    }

    public static void printOtherLambda(otherLambdaInterface thing){
        thing.lambdaWithInput("!");
    }

    //Method that prints their example method as long as it is existent
    public static void interfaceMethod(interfaceExample interfaceVariable){
        interfaceVariable.example();
    }
}