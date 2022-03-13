package FilEksempler;

import java.util.Arrays;

class BinarySearchExample2{
    public static void main(String args[]){
        String arr[] = {"abe","giraf","hund","løve","søløve"};
        String key = "giraf";
        int result = Arrays.binarySearch(arr,key);
        if (result < 0)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: "+result);
    }
}
