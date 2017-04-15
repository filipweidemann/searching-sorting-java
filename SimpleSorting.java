/**
 * Two very basic but well known algorithms to rearrange chaotic fields.
 * This class provides selection sort, as well as bubble sort.
 * Both of them have Ascending and Descending methods, so you can
 * use these algorithms for sorting in both directions.
 *
 * Import this class into your project's source and access
 * it's methods by calling e.g SimpleSorting.selectionSort(field).
 * */
public class SimpleSorting {

    /**
     * Rearranges an integer array's elements in ascending order using
     * selection sort to iterate over the field.
     * worst-case-runtime: O(n^2)
     *
     * @param field
     *      the array to sort
     * @return
     *      the sorted array
     * */
    public static int[] selectionSortAscending(int[] field) {
        for (int i = 0; i < field.length - 1; i++) {
            for (int j = i + 1; j < field.length; j++) {
                if (field[i] > field[j]) {
                    int temp = field[i];
                    field[i] = field[j];
                    field[j] = temp;
                }
            }
        }
        return field;
    }

    public static int[] selectionSortDescending(int[] field) {
        for (int i = 0; i < field.length - 1; i++) {
            for (int j = i + 1; j < field.length; j++) {
                if (field[i] < field[j]) {
                    int temp = field[i];
                    field[i] = field[j];
                    field[j] = temp;
                }
            }
        }
        return field;
    }


    /**
     * Rearranges an integer array's elements in ascending order using
     * bubble sort to iterate over the field.
     * worst-case-runtime: O(n^2)
     *
     * @param field
     *      the array to sort
     * @return
     *      the sorted array
     * */
    public static int[] bubbleSortAscending(int[] field) {
        int temp;
        for(int i = 1; i < field.length; i++) {
            for(int j = 0; j < field.length - i; j++) {
                if(field[j] > field[j+1]) {
                    temp = field[j];
                    field[j] = field[j+1];
                    field[j+1] = temp;
                }
            }
        }
        return field;
    }

    public static int[] bubbleSortDescending(int[] field) {
        int temp;
        for(int i = 1; i < field.length; i++) {
            for(int j = 0; j < field.length - i; j++) {
                if(field[j] < field[j+1]) {
                    temp = field[j];
                    field[j] = field[j+1];
                    field[j+1] = temp;
                }
            }
        }
        return field;
    }

}
