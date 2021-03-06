public class Q2 {
    public int singleNonDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while(l < r){
            int mid = l + (r - l) / 2;
            if(mid % 2 == 1){
                mid--;
            }

            if(nums[mid] != nums[mid + 1]){
                r = mid;
            }else{
                l = mid + 2;
            }
        }

        return nums[l];
    }
}
