package Module_7_Searching_Sorting_Complexity;

class Pair {
    int value;
    String id;

    Pair(int value, String id) {
        this.value = value;
        this.id = id;
    }
}

public class SortingStableORUnstable {

    // Bubble Sort (Stable)
    static void bubbleSort(Pair[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j].value > arr[j + 1].value) {

                    Pair temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort (Unstable)
    static void selectionSort(Pair[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j].value < arr[minIndex].value) {
                    minIndex = j;
                }
            }

            Pair temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(Pair[] arr) {
        for (Pair p : arr) {
            System.out.print("(" + p.value + "," + p.id + ") ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Pair[] arr = {
                new Pair(2, "A"),
                new Pair(1, "B"),
                new Pair(2, "C"),
                new Pair(1, "D")
        };

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr);
        System.out.println("After Bubble Sort (Stable):");
        printArray(arr);

        Pair[] arr2 = {
                new Pair(2, "A"),
                new Pair(1, "B"),
                new Pair(2, "C"),
                new Pair(1, "D")
        };

        selectionSort(arr2);
        System.out.println("After Selection Sort (Unstable):");
        printArray(arr2);
    }
}
