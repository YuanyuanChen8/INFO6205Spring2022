import java.util.ArrayList;
import java.util.List;

public class Q7 {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int start = newInterval[0];
        int end = newInterval[1];
        List<int[]> l = new ArrayList<>();
        List<int[]> r = new ArrayList<>();
        for(int[] interval:intervals){
            if(interval[1] < start){
                l.add(interval);
            }else if(end < interval[0]){
                r.add(interval);
            }else{
                start = Math.min(start, interval[0]);
                end = Math.max(end, interval[1]);
            }
        }
        l.add(new int[]{start, end});
        l.addAll(r);
        return l.toArray(new int[l.size()][]);
    }
}
