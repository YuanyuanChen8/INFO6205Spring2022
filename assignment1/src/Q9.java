import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Q9 {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> numList = new ArrayList(map.keySet());
        Collections.sort(numList, (a, b) -> {
            int cntA = map.get(a), cntB = map.get(b);
            return cntA == cntB ? b - a : cntA - cntB;
        });

        int i = 0;
        for (int num : numList) {
            for (int j = 0; j < map.get(num); j++) {
                nums[i++] = num;
            }
        }
        return nums;
    }
}
