import java.util.Arrays;
import java.util.Comparator;

public class Q8 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0)
            return 0;

        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] intervals1, int[] intervals2){
                return intervals1[1] - intervals2[1];
            }
        });
        int right = intervals[0][1];
        int num = 1;

        for(int i = 1; i < intervals.length; i++){
            if(right <= intervals[i][0]){
                num++;
                right = intervals[i][1];
            }
        }
        return intervals.length - num;
    }
}
