package FilEksempler;

import java.util.Arrays;

class InsertionSort {
    /** The method for sorting the numbers */
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            /** insert list[i] into a sorted sublist list[0..i-1] so that
             list[0..i] is sorted. */
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }

            // Insert the current element into list[k+1]
            list[k + 1] = currentElement;
        }
    }

    public static void insertionSort(String[] list) {
        for (int i = 1; i < list.length; i++) {
            String currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k].compareToIgnoreCase(currentElement) > 0; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
        System.out.println(Arrays.toString(list));
    }

    /** A test method */
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
