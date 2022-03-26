import java.util.ArrayList;
import java.util.Arrays;

public class Q4 {
    public int[][] merge(int[][] intervals){
        Arrrays.sort(intervals,new comparator<int[]>(){
            @override
            public int compare(int[]a1, int[]a2){
                return a1[0] - a2[0];
            }
        });
        list <int[]> list = new ArrayList<>();
        for( int i = 0, i < intervals.length;i++){
            int start = intervals[i][0];
            int end = intervals[i][i];
            while( i < intervals.length-1 &&intervals[i+1][0]<= end){
                end = math.Max(end, intervals[i+1][i]);
                i++;
            }
            list.add(new int[]{start, end});

        }
        return list.toArray(new int[0][0]);

    }
}
