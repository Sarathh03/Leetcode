class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rowincrement = new int[m];
        int[] colincrement = new int[n];
        int s = indices.length;
        for(int[] index : indices){
            rowincrement[index[0]]++;
            colincrement[index[1]]++;
        }
        int count =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((rowincrement[i]+colincrement[j])%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}