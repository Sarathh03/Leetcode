class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        // num.add(k);
        // int n = num.length;
        // for(int i=0;i<n;i++){
        //     num.get(i);
        // }
        // return num;
        int ans = 0;
        int n = num.length;
        for(int i=0;i<n;i++){
            ans = ans*10+ num[i];
        }
        ans += k;
        ArrayList<Integer> list = new ArrayList<>();
        while(ans>0){
            int number  = ans%10;
            list.add(0,number);
            ans = ans/10;
        }
        return list;
    }
}