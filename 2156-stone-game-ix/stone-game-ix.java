class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] count = new int[3];
        for (int i:stones) {
            count[i % 3]++;
        }
        int zero=count[0];
        int one =count[1];
        int two =count[2];
        if (zero% 2== 1) {
            return Math.abs(one- two) >2;
        }

        return one>= 1 && two >=1;
    }
}