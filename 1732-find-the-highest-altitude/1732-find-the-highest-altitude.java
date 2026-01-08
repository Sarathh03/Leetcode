class Solution {
    public int largestAltitude(int[] gain) {
        int curalt = 0;
        int maxalt = 0;
        for(int i=0;i<gain.length;i++){
            curalt+= gain[i];
            maxalt = Math.max(curalt,maxalt);
        }
        return maxalt;
    }
}