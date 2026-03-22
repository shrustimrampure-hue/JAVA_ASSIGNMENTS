package Module_7_Searching_Sorting_Complexity;

import java.util.Arrays;

public class SortingComparison {

    // Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Selection Sort
    static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int minIndex = i;

            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort
    static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }

    // Merge Sort
    static void mergeSort(int[] arr, int left, int right){
        if(left < right){

            int mid = (left + right)/2;

            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);

            merge(arr,left,mid,right);
        }
    }

    static void merge(int[] arr,int left,int mid,int right){

        int n1 = mid-left+1;
        int n2 = right-mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0;i<n1;i++)
            L[i] = arr[left+i];

        for(int j=0;j<n2;j++)
            R[j] = arr[mid+1+j];

        int i=0,j=0,k=left;

        while(i<n1 && j<n2){
            if(L[i] <= R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }

    // Quick Sort
    static void quickSort(int[] arr,int low,int high){

        if(low < high){

            int pi = partition(arr,low,high);

            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    static int partition(int[] arr,int low,int high){

        int pivot = arr[high];
        int i = low-1;

        for(int j=low;j<high;j++){
            if(arr[j] < pivot){

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void main(String[] args) {

        int[] original = {9,5,1,4,3};

        int[] arr1 = Arrays.copyOf(original, original.length);
        int[] arr2 = Arrays.copyOf(original, original.length);
        int[] arr3 = Arrays.copyOf(original, original.length);
        int[] arr4 = Arrays.copyOf(original, original.length);
        int[] arr5 = Arrays.copyOf(original, original.length);

        long start, end;

        start = System.nanoTime();
        bubbleSort(arr1);
        end = System.nanoTime();
        System.out.println("Bubble Sort Time: " + (end-start));

        start = System.nanoTime();
        selectionSort(arr2);
        end = System.nanoTime();
        System.out.println("Selection Sort Time: " + (end-start));

        start = System.nanoTime();
        insertionSort(arr3);
        end = System.nanoTime();
        System.out.println("Insertion Sort Time: " + (end-start));

        start = System.nanoTime();
        mergeSort(arr4,0,arr4.length-1);
        end = System.nanoTime();
        System.out.println("Merge Sort Time: " + (end-start));

        start = System.nanoTime();
        quickSort(arr5,0,arr5.length-1);
        end = System.nanoTime();
        System.out.println("Quick Sort Time: " + (end-start));
    }
}
