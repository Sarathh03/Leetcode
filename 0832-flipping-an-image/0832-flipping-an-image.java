class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        ArrayList<ArrayList<Integer>>list  = new ArrayList<>();
        for(int row =0;row<image.length;row++){
            ArrayList<Integer>currentlist  = new ArrayList<>();
            for(int col = 0; col<image.length;col++){
                currentlist.add(image[row][col]);
            }
            Collections.reverse(currentlist);
            for(int i=0;i<image.length;i++){
                currentlist.set(i,currentlist.get(i) == 0? 1:0);
            }
            list.add(currentlist);
        }
       int[][] res = new int[image.length][image.length];
       for(int i=0;i<image.length;i++){
        for(int j=0;j<image.length;j++){
            res[i][j] = list.get(i).get(j);
        }
       }
       return res;
    }
}