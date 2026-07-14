class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean ans=false;
        if(n==1)return true;
        for(int i=0;i<n;i++){
            long p=(long)Math.pow(2,i);
            if(p==n){
                ans=true;
            }
            else if(p>n)break;
        }
        return ans;
    }
}