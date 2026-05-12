class Solution {
    private int[] x = new int[15];

    private boolean place(int k, int i){
        for(int j = 1; j < k; j++){
            if(x[j] == i || Math.abs(x[j] - i) == Math.abs(j - k)){
                return(false);
            }
        }

        return(true);
    }

    private void queens(int k, int n, int[] count){
        for(int i = 1; i <= n; i++){
            if(place(k, i)){
                x[k] = i;
                if(k != n){
                    queens(k + 1, n, count);
                }
                else{
                    count[0]++;
                }
            }
        }
    }

    public int totalNQueens(int n) {
        int[] count = {0};
        queens(1, n, count);
        return(count[0]);
    }
}
