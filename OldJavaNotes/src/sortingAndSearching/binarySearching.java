package sortingAndSearching;

public class binarySearching {

    private binarySearching(){ //Prevents us from being able to instantiate the binarySearching class

    }
    public static String intBinaryToString(int x){
        return "Amount of Integer Binary Executions: " + x;
    }

    public static String doubleBinaryToString(double x){
        return "Amount of Double Binary Executions: " + (int)x;
    }

    public static String recursionBinaryToString(int x){
        return "Amount of Recursion Binary Executions: " + x;
    }
    public static int iBinarySearch(int arr[], int left, int right, int searchValue){
        int executionCount = 0; //Amount of times needed to find the value
        while (left <= right) { //Will run for as long as left is not greater than right, to make sure the list doesn't overlap

            executionCount += 1;
            int middle = (left + right) / 2; //Every time the loop runs, it updates the middle

            if (arr[middle] == searchValue) {
                return executionCount; //Checks if the middle is the value being searched
            } 
            else if (arr[middle] > searchValue) {
                right = middle - 1; //Checks if the middle is greater than the value, if so it ignores the right side
            } 
            else { //Since it is not the middle nor greater than the right, it must be less than the left side
              left = middle + 1; //Ignores the left side
            }  
        }
        return -1; //If no value is found, it returns -1 (no value)
    }

    public static double dBinarySearch(double arr[], int left, int right, double searchValue){

        int executionCount = 0; //Amount of times needed to find the value
        while(left <= right){ //Will run for as long as left is not greater than right, to make sure the list doesn't overlap

            executionCount += 1;
            int middle = left + right/2; //Every time the loop runs, it updates the middle

            if(arr[middle] == searchValue){
                return executionCount; //Checks if the middle is the value being searched
            }
            else if(arr[middle] > searchValue){
                right = middle + 1; //Checks if the middle is greater than the value, if so it ignores the right side
            }
            else{ //Since it is not the middle nor greater than the right, it must be less than the left side
                left = middle - 1; //Ignores the left side
            }
        }
        return -1; //If no value is found, it returns -1 (no value)
    }

    public static int recursionBinarySearch(int arr[], int left, int right, int searchValue)
    {
        // Restrict the boundary of right index
        // and the left index to prevent
        // overflow of indices
        if (right >= left && left <= arr.length - 1) { //Making sure the Left and Right do not overlap

            int middle = left + (right - left) / 2; //Updates the middle value
 
            if (arr[middle] == searchValue){
                return middle; //Checks if the middle is the value being searched
            }
            if (arr[middle] > searchValue){ //Checks if the middle is greater than the value, if so it ignores the right side
                return recursionBinarySearch(arr, left, middle - 1, searchValue); //Recalls the method with the adjusted Right variable
            }
            else{ //Since it is not the middle nor greater than the right, it must be less than the left side
                return recursionBinarySearch(arr, middle + 1, right, searchValue); //Recalls the method with the adjusted Left variable
            }
        }
        return -1;
    }
}
