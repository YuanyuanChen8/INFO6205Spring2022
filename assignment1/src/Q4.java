import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q4 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums2);
        for(int num : nums1){
            if(bs(nums2, num)) set.add(num);
        }
        int[] res = new int[set.size()];
        int i = 0;
        for(int num : set){
            res[i] = num;
            i++;
        }
        return res;
    }

    private boolean bs(int[] nums, int target){
        int lo = 0, hi = nums.length-1;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(nums[mid] == target) return true;
            else if(nums[mid]<target) lo = mid+1;
            else hi = mid-1;
        }
        return false;
    }
}

