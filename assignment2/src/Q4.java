import java.util.Arrays;

public class Q4 {
    public int minMeetingRooms(int[][] intervals) {
        int n = intervals.length;
        if(n<=1){
            return n;
        }
        int[] left = new int[n];
        int[] right = new int[n];
        for(int i=0; i<n; i++){
            left[i] = intervals[i][0];
            right[i] = intervals[i][1];
        }
        Arrays.sort(left);
        Arrays.sort(right);
        int max = 1, cur=0;
        int i=0, j=0;
        while(i<n){
            if(left[i] < right[j]){
                cur++;
                max = Math.max(max, cur);
                i++;
            }else if(left[i] > right[j]){
                cur--;
                j++;
            }else{
                i++;
                j++;
            }
        }
        return max;
    }
}
