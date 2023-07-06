import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort_Algorithm_CanSortAnyData {

    static int[] numArray = new int[10];
    static int arraySize = numArray.length;
    public static ArrayList<Integer> potato = new ArrayList<>(Arrays.asList(1,2,3,4,3,1,1,2,4,45,4,32,21,1));


    public static void main(String[] args) {

        for (int i = 0; i < arraySize; i++) {
            numArray[i] = (int)(Math.random()*11);
        }
        System.out.println(Arrays.toString(numArray));


        int[] numDup = Arrays.copyOf(numArray, arraySize);



        bubbleSortAscending(numArray);
        System.out.println(Arrays.toString(numArray));
        bubbleSortDescending(numDup);
        System.out.println(Arrays.toString(numDup));

        System.out.println(potato);
        arrayListBubbleSort(potato);
        System.out.println(potato);

    }



    public static void bubbleSortAscending(int[] numArray){         //Sorting ascending


        for (int i = arraySize-1; i > 0; i--) {     //i starts from the back till 0
            for (int j = 0; j < i; j++) {           //Iterates up to i so it doesn't loop pointlessly
                if (numArray[j] > numArray[j+1]){   //if j is more than the next number they will swap positions
                    int temp = j;
                    numArray[j] = numArray[j+1];
                    numArray[j+1] = temp;
                }
            }
        }


    }


    public static void bubbleSortDescending(int[] numArray){        //Sorting descending

        for (int i = arraySize-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numArray[j] < numArray[j+1]){   //if j is less than the next number they swap positions
                    int temp = j;                                   //as a result the biggest numbers are left at the front
                    numArray[j] = numArray[j+1];
                    numArray[j+1] = temp;
                }
            }
        }
    }



    public static void arrayListBubbleSort(ArrayList<Integer> potato){      //Can be used to sort a ArrayList
        for (int i = BubbleSort_Algorithm_CanSortAnyData.potato.size()-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (BubbleSort_Algorithm_CanSortAnyData.potato.get(j) > BubbleSort_Algorithm_CanSortAnyData.potato.get(j + 1)){
                    int temp = BubbleSort_Algorithm_CanSortAnyData.potato.get(j);
                    BubbleSort_Algorithm_CanSortAnyData.potato.set(j, BubbleSort_Algorithm_CanSortAnyData.potato.get(j+1));
                    BubbleSort_Algorithm_CanSortAnyData.potato.set(j+1, temp);

                }
            }
        }
    }





    public static void swapValues(int indexOne, int indexTwo){ //If you want to write the swapping as a method
        int temp = indexOne;
        numArray[indexOne] = numArray[indexTwo];
        numArray[indexTwo] = temp;
    }






}
