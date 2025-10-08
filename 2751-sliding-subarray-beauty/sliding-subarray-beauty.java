class Solution {
      int getIndex(int num){ 
            return num + 50;
             }
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int[] freq = new int[101]; // For numbers -50 to 50

        // Function to get index in freq array
      

        // Build first window
        for (int i = 0; i < k; i++) {
            if (nums[i] < 0) freq[nums[i] + 50]++;
        }

        // Helper to find x-th smallest negative
        java.util.function.IntSupplier findXth = () -> {
            int count = 0;
            for (int i = 0; i < 50; i++) { // only negatives (-50 to -1)
                count += freq[i];
                if (count >= x) return i - 50;
            }
            return 0;
        };

        // Slide the window
        for (int i = k; i <= n; i++) {
            ans[i - k] = findXth.getAsInt();

            if (i == n) break;

            // Remove outgoing
            if (nums[i - k] < 0) freq[nums[i - k] + 50]--;
            // Add incoming
            if (nums[i] < 0) freq[nums[i] + 50]++;
        }

        return ans;
    }
}
