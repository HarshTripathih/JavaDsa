package Arrays;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        int ans  = maximumWealth(accounts);
        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts){
        int sol = Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            int rowSum = 0;
            for(int account=0;account<accounts[person].length;account++){
                rowSum += accounts[person][account];
            }
            if(rowSum > sol){
                sol = rowSum;
            }
        }
        return sol;
    }
}
