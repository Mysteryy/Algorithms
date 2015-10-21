package algorithms.searching;

/**
 * Created by zach on 10/14/2015.
 * <p>
 * ---------------------------------------------------------
 * Complexity Analysis
 * ---------------------------------------------------------
 * Worst Case Performance   : O(log n)
 * Best Case Performance    : O(1)      (Element found immediately)
 * Average Case Performance : O(log n)
 */
public class BinarySearch {

    /**
     * Searches the array for the key, and gets the index of the key within the array.
     *
     * @param array the array to search for the key in
     * @param key   the key (value) to search for within the array
     * @return the index of the first occurrence of the key within the array.
     * if the key is not in the array, -1 is returned.
     */
    public static int search(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] < key) {
                low = mid + 1;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else {
                return findFirstInstance(array, mid);
            }
        }
        return -1;
    }

    /**
     * A binary search may or may not locate the first occurrence of the key within an array.
     * Because of this, we need to go backwards, ensuring that the located index is the
     * index of the first occurrence of the key.
     * <p>
     * **********************
     *
     * @param array           the array to search in
     * @param identifiedIndex the index that was found in the binary search (may not be the first occurrence of the key)
     * @return the first occurrence of the key within the array
     * @todo instead of linearly searching backwards, make this method perform a reverse exponential
     * @todo search to locate the first occurrence faster. This will maintain O(log n) performance
     * @todo of binary search.
     * **********************
     */
    private static int findFirstInstance(int[] array, int identifiedIndex) {
        int firstInstance = identifiedIndex;
        for (int i = identifiedIndex; i >= 0; i--) {
            if (array[i] == array[identifiedIndex]) {
                firstInstance = i;
            } else
                break;
        }
        return firstInstance;
    }

}
