package FilEksempler;

import java.util.Arrays;

class HeapSort {
    /** Heap sort method */
    public static <E extends Comparable<E>> void heapSort(E[] list) {
        // Create a Heap of integers
        Heap<E> heap = new Heap<>();

        // Add elements to the heap
        for (int i = 0; i < list.length; i++)
            heap.add(list[i]);

        // Remove elements from the heap
        for (int i = list.length - 1; i >= 0; i--)
            list[i] = heap.remove();
        System.out.println(Arrays.toString(list));
    }

    public static void heapSort(String[] list) {
        StringHeap stringHeap = new StringHeap();

        for (int i = 0; i < list.length; i++) {
            stringHeap.add(list[i]);
        }

        for (int i = list.length - 1; i >= 0; i--) {
            list[i] = stringHeap.remove();
        }
        System.out.println(Arrays.toString(list));
    }

    /** A test method */
    public static void main(String[] args) {
        Integer[] list = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
        heapSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
