public class SearchInSortedMatrix {
    public static boolean StaircaseSearch(int[][] matrix, int key) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) { // means it will start from (0,3)
            if(matrix[row][col]==key){
                System.out.println("found key at ("+row+","+col+")");
                return true;
            }

            else if(key<matrix[row][col]){ // going left
                col--;
            }
            else row++; //going bottom

        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key=33;
        StaircaseSearch(matrix,key);

    }
}