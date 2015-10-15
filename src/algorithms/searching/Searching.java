package algorithms.searching;

/**
 * Created by zach on 10/14/2015.
 *
 * This class allows for static access to all of the searching algorithms.
 */
public class Searching {
    private static BinarySearch binarySearch = new BinarySearch();

    /**
     * Searches the array for the key, and gets the index of the key within the array.
     *
     * @param array the array to search for the key in
     * @param key the key (value) to search for within the array
     * @return the index of the first occurrence of the key within the array.
     *         if the key is not in the array, -1 is returned.
     */
    public static int binarySearch(int[] array, int key){
        return binarySearch.search(array, key);
    }
}
