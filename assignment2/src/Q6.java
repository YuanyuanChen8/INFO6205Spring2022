import java.util.Arrays;

public class Q6 {
    public int threeSumClosest(int[] nums, int target) {

        int closeTarget = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        int minReduce = Math.abs(closeTarget - target);

        for(int i=0;i<nums.length-2;i++){
            int left = i+1,right = nums.length-1;
            while(left < right){
                int total = nums[left]+nums[right]+ nums[i];
                if(total==target)
                    return target;
                else if(total<target){
                    left++;
                }else
                    right--;

                if(minReduce > Math.abs(total-target)){
                    minReduce = Math.abs(total - target);
                    closeTarget = total;
                }
            }
        }


        return closeTarget;
    }
}
