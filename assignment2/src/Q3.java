public class Q3 {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            if (nums[start] <= nums[end]) return nums[start];
            int mid  = start + (end - start) / 2;
            if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid;
                start++;
            }
        }
        return 0;
    }
}
