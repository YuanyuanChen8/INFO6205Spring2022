import java.util.ArrayList;
import java.util.List;

public class Q8 {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for(int i = arr.length; i > 1; i --) {
            int idx = findMax(arr, i);
            if(idx == i - 1) {
                continue;
            }
            if(idx != 0) {
                swap(arr, idx + 1);
                result.add(idx + 1);
            }
            result.add(i);
            swap(arr, i);
        }
        return result;
    }

    private int findMax(int[]a, int last) {
        int max = -1;
        int idx = 0;
        for(int i = 0; i < last; i ++) {
            if(a[i] > max) {
                max = a[i];
                idx = i;
            }
        }
        return idx;
    }

    private void swap(int[]a, int last) {
        for(int i = 0; i < last / 2; i ++) {
            int temp = a[i];
            a[i] = a[last - 1 - i];
            a[last - 1 - i] = temp;
        }
    }
}
