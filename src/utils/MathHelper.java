package utils;

/**
 * Created by Zach on 10/13/2015.
 *
 * This class contains math related helper functions.
 */
public class MathHelper {


    /**
     * Gets a sudo-random number such that: min <= returnNumber <= max
     *
     * @param min the minimum value (inclusive)
     * @param max the maximum value (inclusive)
     * @return a random value as defined above.
     */
    public static int getRandomNumber(int min, int max){
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

     /**
     * Gets an array of the specified size, filled with sudo-random
     * values between minValue (inclusive) and maxValue (inclusive).
     *
     * @param size the size of the sudo-random array to be generated
     * @param minValue the minimum value to be generated and placed in the array (inclusive)
     * @param maxValue the maximum value to be generated and placed in the array (inclusive)
     * @return an array filled with sudo-random values between minValue and maxValue
     */
    public static int[] getRandomArray(int size, int minValue, int maxValue){
        if(size > 0) {
            int[] randomArray = new int[size];
            for(int index = 0; index < size; index++){
                randomArray[index] = getRandomNumber(minValue, maxValue);
            }
            return randomArray;
        }
        return null;
    }

    /**
     * Rounds the number using normal math rules for number rounding.
     *
     * @param number the number to round.
     * @return the rounded int value.
     */
    public static int roundNumber(double number){
        return (int) Math.round(number);
    }

    /**
     * Rounds the number down to the closest int value.
     * e.g. 9, 9.0000001 and 9.9999999 would all return 9 using this method.
     *
     * @param number the number to round down.
     * @return the rounded down number.
     */
    public static int roundNumberDown(double number){
        return (int) Math.floor(number);
    }

    /**
     * Rounds the number up to the closest int value.
     * e.g. 9.0000001 and 9.9999999 would both return 10 using this method.
     *
     * @param number the number to round up.
     * @return the rounded up number.
     */
    public static int roundNumberUp(double number){
        return (int) Math.ceil(number);
    }
}
