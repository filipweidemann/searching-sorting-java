/**
 * Import this class into your project's source and access
 * it's methods by calling e.g SimpleSearches.linSearch(parameters).
 * */

public class SimpleSearches {

    /**
     * Performs a linear search on the input array for the desired value.
     *
     * We're dealing with Object Arrays here, so this algorithm can
     * search for every value which is (or inherits from) the Object class.
     * @param input
     *      the array in which to search for a specific object or value.
     * @param value
     *      the desired value we're looking for in 'input'.
     * @return
     *      this function returns an int array with 2 indices:
     *      - index 0 contains the index of 'input' in which the
     *        value has been found,
     *      - index 1 contains the value in that slot once again.
     *
     *      If the input array doesn't contain the value, the array
     *      gets returned with predefined values of -1 on both indices.
     *      So if you need to check whether you actually found the
     *      value, just check for '!= -1' and you're golden!
     * */
    public static Object[] linSearch(Object[] input, Object value){
        int i = 0;
        int n = input.length;
        Object[] returns = new Object[] {-1, -1};
        boolean done = false;

        do {
            if(input[i] == value){
                done = true;
                returns[0] = i;
                returns[1] = value;
            } else {
                i++;
                if(i == n){
                    done = true;
                }
            }
        } while(!done);

        return returns;

    }


    /**
     * Performs a linear search within the specified bounds on the input array for the desired value.
     *
     * We're dealing with Object Arrays here, so this algorithm can
     * search for every value which is (or inherits from) the Object class.
     * @param input
     *      the array in which to search for a specific object or value.
     * @param value
     *      the desired value we're looking for in 'input'.
     * @param lb
     *      the lower bound (aka starting point for the search)
     * @param ub
     *      the upper bound (aka ending point for the search)
     * @return
     *      this function returns an int array with 2 indices:
     *      - index 0 contains the index of 'input' in which the
     *        value has been found,
     *      - index 1 contains the value in that slot once again.
     *
     *      If the input array doesn't contain the value, the array
     *      gets returned with predefined values of -1 on both indices.
     *      So if you need to check whether you actually found the
     *      value, just check for '!= -1' and you're golden!
     * */
    public static Object[] linSearchInBounds (Object[] input, int lb, int ub, Object value) {
        Object[] output = new Object[] {-1, -1};
        for(int i = lb; i <= ub; i++) {
            if(input[i] == value) {
                output[0] = i;
                output[1] = value;
                return output;
            }
        }
        return output;
    }


    /**
     * Performs a binary search on the input int array for the desired value.
     *
     * This only makes sense if you're using sorted int arrays as inputs, so if
     * the state of your input is unknown, use one of the sorting algorithms below
     * and use the returned array as new input.
     *
     * @param input
     *      the int array on which the binary search gets performed
     * @param value
     *      the value to search for in the input
     * @return
     *      this function's return is exactly as the ones of the
     *      linear search algorithms.
     *
     *      The difference is a much better performance for big and sorted arrays.
     *      However, for a hit in the first few indices this method is slightly
     *      slower than classic linear searches.
     * */
    public static int[] binSearch(int[] input, int value){
        int n = input.length;
        int i = 0, j = n - 1, mid;
        int[] returns = new int[] {-1, -1};
        boolean done = false;
        do {
            mid = (i+j)/2;
            if (value < input[mid]) {
                j = mid - 1;
            } else {
                if (value > input[mid]) {
                    i = mid + 1;
                } else {
                    done = true;
                    returns[0] = mid;
                    returns[1] = value;
                }
            }
        } while(i <= j && !done);
        return returns;
    }


    /**
     * Performs a binary search on the input int array for the desired value.
     *
     * This only makes sense if you're using sorted int arrays as inputs, so if
     * the state of your input is unknown, use one of the sorting algorithms below
     * and use the returned array as new input.
     *
     * @param input
     *      the int array on which the binary search gets performed
     * @param value
     *      the value to search for in the input
     * @param lb
     *      the lower bound (aka starting point for the search)
     * @param ub
     *      the upper bound (aka ending point for the search)
     * @return
     *      this function's return is exactly as the ones of the
     *      binary search algorithms.
     * */
    public static int[] binSearchInBounds(int[] input, int lb, int ub, int value){
        int n = ub-lb;
        int i = lb, j = ub, mid;
        int[] returns = new int[] {-1, -1};
        boolean done = false;
        do {
            mid = (i+j)/2;
            if (value < input[mid]) {
                j = mid - 1;
            } else {
                if (value > input[mid]) {
                    i = mid + 1;
                } else {
                    done = true;
                    returns[0] = mid;
                    returns[1] = value;
                }
            }
        } while(i <= j && !done);
        return returns;
    }

}
