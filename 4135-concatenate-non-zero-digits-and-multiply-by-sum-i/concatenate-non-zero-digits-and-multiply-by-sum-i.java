class Solution {
    public long sumAndMultiply(int n) {
        int num=0;
        while(n!=0){
            int d=n%10;
            if(d!=0){
                num=(num*10)+d;
            }
            n/=10;
        }
        n=0;
        int ans=num;
        while(ans!=0){
            int d=ans%10;
            n=(n*10)+d;
            ans/=10;
        }
        ans=n;
        num=ans;
        int sum=0;
        while(ans!=0){
            int d=ans%10;
            sum+=d;
            ans/=10;
        }
        long nn=num;
        return nn*sum;
    }
}