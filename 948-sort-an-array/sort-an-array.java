class Solution {
    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quicksort(int[] arr, int l, int r) {
        if (l < r) {
            int p = partition(arr, l, r);
            quicksort(arr, l, p - 1);
            quicksort(arr, p + 1, r);
        }
    }

    private int partition(int[] arr, int l, int r) {
        int pivotIndex = l + (r - l) / 2;
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, l);  // move pivot to start

        int i = l + 1;
        int j = r;

        while (i <= j) {
            while (i <= r && arr[i] <= pivot) i++;
            while (j >= l && arr[j] > pivot) j--;

            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, l, j);  // place pivot at correct position
        return j;
    }

    private void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
