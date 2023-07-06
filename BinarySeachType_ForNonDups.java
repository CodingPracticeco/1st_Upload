import java.util.ArrayList;
import java.util.Arrays;

public class BinarySeachType_ForNonDups {
//    In order for binary search to work the --Array Must Be Sorted--

    static int[] theArray = new int[10];
    static int arraySize = theArray.length;
    public static ArrayList<Integer> potato = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));


    public static void main(String[] args) {

        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 11);
        }
        theArray[3] = 2;                                    //This just for me to check if it works is optional
        System.out.println(Arrays.toString(theArray));
        int[] numDup = Arrays.copyOf(theArray, arraySize);
        System.out.println(Arrays.toString(numDup));
        for (int i = arraySize-1; i > 0; i--) {             //This is just to sort the array
            for (int j = 0; j < i; j++) {
                if (theArray[j] > theArray[j+1]){
                    int temp = j;
                    theArray[j] = theArray[j+1];
                    theArray[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(theArray));




        binarySearchForValue(2);
        binarySearchWithoutComments(8);


    }


    public static void binarySearchForValue(int value) {        //Very fast compare to linear search but does not work well with duplicates

        int lowIndex = 0;
        int highIndex = arraySize - 1;

        while (lowIndex <= highIndex) {                 //Works by shifting the middle index depending on if its
                                                        // less or greater than the value we are trying to find

            int middleIndex = lowIndex+(highIndex - lowIndex)/2;            //Very Important


            if (theArray[middleIndex] < value) lowIndex = middleIndex++;
            //if middleIndex is less than value it sets lowIndex to middleIndex+1 thereby removing the bottom half of the array

            else if (theArray[middleIndex] > value) highIndex = middleIndex--;
            ////if middleIndex is less than value it sets highIndex to middleIndex-1 thereby removing the top half of the array

            else {//basically means that if theArray[middleIndex] == value then we do this
                System.out.println("\nFound a Match for the value: " + value + "\nAt the index: " + middleIndex);
                lowIndex = highIndex+1;         //Very Important is to end the WhileLoop, break; doesn't work here
            }
        }



    }//End of binarySearchForValue





    public static void binarySearchWithoutComments(int valueToSeachFor){
        int highIndex = potato.size()-1;
        int lowIndex = 0;

        while (lowIndex <= highIndex){
        int middleIndex = lowIndex+(highIndex-lowIndex)/2;

        if (potato.get(middleIndex) < valueToSeachFor)lowIndex = middleIndex++;
        else if (potato.get(middleIndex) > valueToSeachFor)highIndex = middleIndex--;
        else {
            System.out.println("\nValue Searched For: " + valueToSeachFor + "\nValue Found At: " + middleIndex);
            lowIndex = highIndex+1;
        }


        }


    }//End of binarySearchWithoutComments





}
