package tests;

import algorithms.arrays.SubSumOfArray;

/**
 * Created by zach on 10/20/2015.
 * <p>
 * Test for the SubSumOfArray class.
 */
public class SubSumTest {

    public static void main(String[] args) {
        SubSumOfArray subSumOfArray = new SubSumOfArray();
        //int testValues[] = new int[]{3,2,5,43,2,22,4,5,5,10};
        int testValues[] = new int[]{3, 1, 2};

        System.out.println(subSumOfArray.findShortestSubSequence(testValues, 4));
    }
}
