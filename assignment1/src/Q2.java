import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        if(nums == null || nums.length == 0)
            return list;
        int n = nums.length;
        int count = n/3;

        int num1 = nums[0];
        int num2 = nums[0];

        int count1 = 1;
        int count2 = 0;

        for(int i = 1 ; i < n ; i++){
            int temp = nums[i];
            if(temp == num1){
                count1++;
            }else if(temp == num2){
                count2++;
            }else{
                if(count2 == 0){
                    num2 = temp;
                    count2 = 1;
                    continue;
                }
                if(count1 < count2){
                    count1--;
                }else
                    count2--;

                if(count1 == 0){
                    num1 = temp;
                    count1 = 1;
                }
                if(count2 == 0){
                    num2 = temp;
                    count2 = 1;
                }
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == num1)
                count1++;
            if(nums[i] == num2)
                count2++;
        }

        if(count1 > count)
            list.add(num1);
        if(num2 != num1 && count2 > count)
            list.add(num2);

        return list;
    }
}
