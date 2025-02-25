package Function;

import java.util.*;

public class practiceFun {
    public static void maxHeap(int arr[], int size, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeap(arr, size, largest);
        }
    }

    public static void buildHeap(int arr[], int size) {
        for (int i = (size - 1) / 2; i >= 0; i--) {
            maxHeap(arr, size, i);
        }
    }

    public static void insertHeap(int arr[], int size, int val) {
        size++;
        int idx = size - 1;
        arr[idx] = val;

        while (idx > 0) {
            int parent = (idx - 1) / 2;
            if (arr[parent] < arr[idx]) {
                int temp = arr[parent];
                arr[parent] = arr[idx];
                arr[idx] = temp;
                idx = parent;
            }

            else {
                break;
            }
        }

    }

    public static void display(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            insertHeap(arr, i, ele);

        }

        buildHeap(arr, n);

        display(arr, n);

        sc.close();

    }
}
