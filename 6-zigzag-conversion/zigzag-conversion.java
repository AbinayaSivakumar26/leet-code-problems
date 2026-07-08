class Solution {
    public String convert(String s, int numRows) {
        int n=s.length();
        if(numRows==1)return s;
        StringBuilder[]sb=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            sb[i]=new StringBuilder();
        }
        boolean change=false;
        int ind=0;
        for(int i=0;i<n;i++){
            sb[ind].append(s.charAt(i));
            if(ind==0||ind==numRows-1){
                change=!change;
            }
            if(change){
                ind++;
            }
            else{
                ind--;
            }  
        }
        StringBuilder ans=new StringBuilder();
        for(StringBuilder ss:sb){
            ans.append(ss);
        }
        return ans.toString();
        
    }
}