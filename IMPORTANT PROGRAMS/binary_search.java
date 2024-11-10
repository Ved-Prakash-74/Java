import java.util.*;

public class binary_search {
    static String search(int arr[], int low, int high, int key) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return "Element found";
            }
            if (arr[mid] > key) {
                return search(arr, low, mid - 1, key);
            }
            return search(arr, mid + 1, high, key);
        }

        return "Element not found";
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the size of array");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("\nEnter array elements in sorted order");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nThe array elements are");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        int key;
        System.out.println("\nEnter the key element to be searched");
        key = sc.nextInt();
        sc.close();

        String result = search(arr, 0, arr.length - 1, key);
        System.out.println(result);
    }
}
