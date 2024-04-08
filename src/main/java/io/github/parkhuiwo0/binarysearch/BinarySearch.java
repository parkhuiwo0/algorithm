package io.github.parkhuiwo0.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int key = 10;

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low+high) / 2;

            int i = array[mid];

            if (i == key) {
                System.out.println("findKey : " + i + " index : " + mid);
                return;
            }

            if (key > i) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("not found");
    }
}
