public class DiagonalSum {
    public static int diagSum(int[][] matrix) {
        int n=matrix.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=matrix[i][i];
            if(i!=n-1-i){ // for proper explanation - refer notes. main main smjhau to i=j ni hone chiye islie ye condition ki
                sum+=matrix[i][n-1-i];  // j is derived from i+j=n-1
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix= {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                        };
        System.out.println(diagSum(matrix));

    }
}
