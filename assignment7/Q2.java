class Solution {
    public int shortestPathLength(int[][] graph) {
        int len = graph.length;
        int dp[][] = new int[len][1<<len];
        LinkedList<Pair> q = new LinkedList<>();
        for(int i = 0;i<len;i++){
            Arrays.fill(dp[i],1<<12);
            dp[i][1<<i] = 0;
            q.add(new Pair(i,1<<i));
        }
        while(!q.isEmpty()){
            Pair cur = q.removeFirst();
            for(int j:graph[cur.a]){
                if(dp[j][1<<j|cur.mark]>dp[cur.a][cur.mark]+1){
                    dp[j][1<<j|cur.mark]=dp[cur.a][cur.mark]+1;
                    q.add(new Pair(j,1<<j|cur.mark));
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0;i<len;i++){
            res = Math.min(res,dp[i][(1<<len)-1]);
        }
        return res;
    }
    class Pair{
        public int mark,a;
        public Pair(int b,int t){
            mark = t;
            a = b;
        }
    }
}
