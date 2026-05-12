public class Solution {
    private int[] x = new int[12];

    private bool place(int k, int i){
        for(int j = 1; j < k; j++){
            if(x[j] == i || Math.Abs(x[j] - i) == Math.Abs(j - k)){
                return false;
            }
        }

        return true;
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

    public int TotalNQueens(int n) {
        int[] count = {0};
        queens(1, n, count);
        return count[0];
    }
}
