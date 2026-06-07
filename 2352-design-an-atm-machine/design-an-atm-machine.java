class ATM {
    long[] notes;
    int[] value = {20,50,100,200,500};
    public ATM() {
         notes = new long[5];
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i=0;i<5;i++){
            notes[i] += banknotesCount[i]; 
        }
    }
    
    public int[] withdraw(int amount) {
        long[] used = new long[5];
        for(int i=4;i>=0;i--){
            long take = Math.min(notes[i],amount/value[i]);
            used[i] = take;
            amount -= value[i]*take;
        }
        if(amount!=0){
            return new int[]{-1};
        }
        for(int i=0;i<5;i++){
            notes[i] -= used[i];
        }
        int[] ans = new int[5];
        for(int i=0;i<5;i++){
            ans[i] += (int)used[i];
        }

    return ans;
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */