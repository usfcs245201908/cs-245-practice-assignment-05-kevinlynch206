public class QuickSort implements SortingAlgorithm {
    public void sort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    void quickSort(int[] a, int left, int right) {
        if (left < right) {
            int mid = partition(a, left, right);
            quickSort(a, left, mid);
            quickSort(a, mid + 1, right);
        }

    }
    
       int partition(int[] arr, int left, int right) {
            int i = left + 1;
            int j = right;
            int pivot = left;
            while (i <= j) {
                while (arr[i] <= arr[pivot] && i <= j) {
                    i++;
                }
                while (arr[j] >= arr[pivot] && i <= j) {
                    j--;
                }
                if (i < j) {
                    swap(arr, i, j);
                }
            }
            swap(arr, j, pivot);
            return j;
        }
}