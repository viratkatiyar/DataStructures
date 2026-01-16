package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {

    public static void main(String[] args) {
        float[] arr = {0.5f, 0.4f, 0.3f, 0.2f, 0.1f};
        bucketSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }

    static void bucketSort(float[] arr) {
        // create buckets
        ArrayList<Float>[] buckets = new ArrayList[arr.length];

        for (int i = 0; i < arr.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        // distribute elements into buckets
        for (float v : arr) {
            int bucketIndex = (int) (v * arr.length);
            if (bucketIndex >= arr.length) {
                bucketIndex = arr.length - 1;
            }
            buckets[bucketIndex].add(v);
        }

        // sort individual buckets
        for (ArrayList<Float> bucket : buckets) {
            Collections.sort(bucket);
        }

        // merge buckets
        int index = 0;
        for (ArrayList<Float> bucket : buckets) {
            for (float val : bucket) {
                arr[index++] = val;
            }
        }
    }
}