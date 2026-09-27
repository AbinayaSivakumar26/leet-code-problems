class Solution {
    public int minimumMoves(String s) {
        char arr[]=s.toCharArray();
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='O'){
                continue;
            }
            c++;
            i+=2;
        }
        return c;
    }
}