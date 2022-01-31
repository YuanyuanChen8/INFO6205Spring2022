import java.util.ArrayList;
import java.util.List;

public class Q5 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<Integer>();
        if(arr == null || arr.length == 0 || k == 0){
            return res;
        }

        int l = 0;
        int r = arr.length-k;
        while(l<r){
            int mid = l+(r-l)/2;
            if(x - arr[mid] > arr[mid+k]-x){
                l = mid+1;
            }else{
                r = mid;
            }
        }

        for(int i = l; i<l+k; i++){
            res.add(arr[i]);
        }
        return res;
    }
}
