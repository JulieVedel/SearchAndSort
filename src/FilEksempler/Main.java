package FilEksempler;

public class Main {

    public static void main(String[] args) {
        String[] array = {"Hej", "Torben" , "Sofus" , "Tumpe" , "Søren" , "Lol" , "kill_Me" , "Enig" , "Nej" , "Hjem" };
        SelectionSort.selectionSort(array);
        InsertionSort.insertionSort(array);
        BubbleSort.bubbleSort(array);
        MergeSort.mergeSort(array);

    }
}
