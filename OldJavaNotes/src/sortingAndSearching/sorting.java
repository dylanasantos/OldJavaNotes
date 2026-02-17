package sortingAndSearching;

public class sorting {
    public static void selectionSort(int[] array) {
        int numCompares = 0;
        //This selectionSort uses a nested for loop to search through an array
        for (int j = 0; j < array.length - 1; j++) { //j is the starting value, an ends at j < len-1 since thats the last value we can compare
          int minimum = j;
            //Inner for loop to compare minimum with the other values
          for (int k = j + 1; k < array.length; k++) { //K will be checking all values besides J
            numCompares++;
            
            if (array[k] < array[minimum]) { //Checks if the value K is less than the current minimum
              minimum = k; //If so, K becomes th new minimum
            }
          }
    
          int numPlaceHolder = array[minimum]; //numPlaceHolder will redefine itself as the index of M in the array
          System.out.println("Current Minimum: " + array[minimum]);
          System.out.println("Comparrison Number: " + array[j]);
          System.out.println("");
          array[minimum] = array[j];
          array[j] = numPlaceHolder;
    
          System.out.println("Current array: " + arrayToString(array));
        }
        System.out.println("Number of comparrison executions: " + numCompares);
      }

      public static void bigSort(int array[]){ //Does the same exact as selectionSort, but unprinted

        for(int i=0; i< array.length-1; i++){
          int minimum = i;
          for(int j= i+1; j<array.length; j++){
            if(array[j] < array[minimum]){
              minimum = j;
            }
          }
          int numPlaceHolder = array[minimum];
          array[minimum] = array[i];
          array[i] = numPlaceHolder;
        }
      }

      public static void insertionSort(int[] array){ //Alternative (debatably), faster Sorting system.
        int executionCount = 0;
        for(int i=1; i < array.length; i++){ //Runs a for loop starting at index 1
          int minimum = i; //Creates a variable equal to the index we use for comparrison
          executionCount ++;
          while(i > 0 && array[i-1] > minimum){ //Will check if the item behind our index is less than the number at our index
            array[i] = array[i-1]; //If so, our item will be redfined as the previous
            i--; //Goes back one index and sees if the code needs to be repeated
          }
          array[i] = minimum; //Once the loop ends, defines the variable at the last spot we were checking
        }
        System.out.println("Number of Comparrison Executions: " + executionCount);
      }

      public static String arrayToString(int[] data) {
        String result = "";
        
        for (int value : data) { //Enhanced for loop to navigate an extract the data values given
          result += value + " ";
        }
    
        return result;
      }

      void packageMethod1(){

      } 
      //Can also be used for return types
      String packageMethod2(){
        return "";
      }
}
