import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q10 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3;i++)
        {
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            for(int j = i + 1; j < nums.length - 2;j++)
            {
                if(j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                int left = j + 1;
                int right = nums.length -1;
                while(left < right)
                {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target)
                    {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        if(!list.contains(temp))
                            list.add(temp);
                        right--;
                        left++;
                    }
                    else if(sum > target)
                        right--;
                    else
                        left++;
                }
            }
        }
        return list;
    }
}
