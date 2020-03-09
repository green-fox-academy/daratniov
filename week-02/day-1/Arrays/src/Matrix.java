public class Matrix {
    public static void main(String[] args) {
        int[][] twoDimensonalArray=new int[4][4];
        for (int i = 0; i <twoDimensonalArray.length ; i++) {
            for (int j = 0; j < twoDimensonalArray[i].length; j++) {
                if (i == j) twoDimensonalArray[i][j] = 1;
                else twoDimensonalArray[i][j] = 0;
            }
        }
        for (int[] row: twoDimensonalArray) {
            for (int num: row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}