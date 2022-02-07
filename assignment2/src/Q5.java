import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Q5 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer temp = map.get(nums[i]);
            if (temp == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], 1 + temp);
            }
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>(k, (a, b) -> (a[1] - b[1]));
        int count = 0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (count < k) {
                queue.offer(new int[]{entry.getKey(), entry.getValue()});
                count++;
            } else if (queue.peek()[1] < entry.getValue()) {
                queue.poll();
                queue.offer(new int[]{entry.getKey(), entry.getValue()});
            }
        }
        int[] res = new int[k];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = queue.poll()[0];
        }
        return res;
    }
}
