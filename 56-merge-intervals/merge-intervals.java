class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> ll=new ArrayList<>();
        if(intervals.length==0)return new int[0][2];
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        ll.add(Arrays.asList(intervals[0][0],intervals[0][1]));
        int x=0;
        for(int i=1;i<intervals.length;i++){
            if(ll.get(x).get(1)>=intervals[i][0]){
                ll.add(Arrays.asList (ll.get(x).get(0),
                Math.max(ll.get(x).get(1),intervals[i][1])));
                ll.remove(x);

            }
            else{
                x++;
                ll.add(Arrays.asList(intervals[i][0],intervals[i][1]));

            }
        }   
        int[][] ans = new int[ll.size()][2];

for (int i = 0; i < ll.size(); i++) {
    ans[i][0] = ll.get(i).get(0);
    ans[i][1] = ll.get(i).get(1);
}
return ans;
    }
}