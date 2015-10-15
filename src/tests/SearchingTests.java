package tests;

import algorithms.searching.Searching;
import algorithms.sorting.Sorting;
import utils.MathHelper;

/**
 * Created by zach on 10/14/2015.
 */
public class SearchingTests {

    public static void main(String[] args){
        // Generate a sudo random array of arbitrary size
        int randomArray[] = MathHelper.getRandomArray(50, 0, 20);
        // Arbitrary search key
        int key = 12;

        // The array must be sorted before we can perform certain searching algorithms on it, such as binary search.
        Sorting.quickSort(randomArray);

        // Print the initial unsorted array
        System.out.println("Unsorted array (" + randomArray.length + " elements)");
        for(int i = 0; i < randomArray.length; i++){
            System.out.print(randomArray[i] + (i == randomArray.length - 1 ? "" : ", "));
        }

        // Perform a binary search on the sorted array
        System.out.println("\n\nBinary Search found " + key + " at index: " + Searching.binarySearch(randomArray, key));
    }
}
