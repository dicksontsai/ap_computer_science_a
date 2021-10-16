package algos;

import java.util.Arrays;

/**
 * A conceptually simple implementation of Mergesort. For educational purposes
 * only.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3 };
        printArr(mergeSort(arr));

        int[] arr2 = { 75, 23, 36, 8, 9 };
        printArr(mergeSort(arr2));
    }

    /**
     * Returns a sorted copy of the given array. A more efficient sorting algorithm
     * would sort the array in place.
     * 
     * @param arr The array to sort.
     * @return A sorted copy of the given array.
     */
    public static int[] mergeSort(int[] arr) {
        // If your array is just length 1, then you just return that array. It's already
        // sorted. This is important for recursion since it serves as the "base case" to
        // stop the recursion.
        if (arr.length == 1) {
            return arr;
        }

        // Split into two halves.
        int arrPtr = 0;
        int[] partOne = new int[arr.length / 2];
        for (int i = 0; i < partOne.length; i++) {
            partOne[i] = arr[arrPtr++];
        }
        int[] partTwo = new int[arr.length / 2 + arr.length % 2];
        for (int i = 0; i < partTwo.length; i++) {
            partTwo[i] = arr[arrPtr++];
        }

        // Sort the two halves recursively.
        int[] partOneSorted = mergeSort(partOne);
        int[] partTwoSorted = mergeSort(partTwo);

        return merge(partOneSorted, partTwoSorted);
    }

    /**
     * Merge two sorted arrays.
     * 
     * @param first  A sorted array
     * @param second A sorted array
     * @return A new array that merges first and second in sorted order.
     */
    private static int[] merge(int[] first, int[] second) {
        int[] output = new int[first.length + second.length];
        int firstPtr = 0;
        int secondPtr = 0;
        int outputPtr = 0;
        while (firstPtr < first.length && secondPtr < second.length) {
            int firstElem = first[firstPtr];
            int secondElem = second[secondPtr];
            if (firstElem < secondElem) {
                output[outputPtr++] = firstElem;
                firstPtr++;
            } else {
                output[outputPtr++] = secondElem;
                secondPtr++;
            }
        }
        while (firstPtr < first.length) {
            output[outputPtr++] = first[firstPtr++];
        }
        while (secondPtr < second.length) {
            output[outputPtr++] = second[secondPtr++];
        }
        return output;
    }

    /**
     * Print the given array.
     * 
     * @param arr The array to print.
     */
    private static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
