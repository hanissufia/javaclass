public class TwoDimension {
    public static void main (String[]args){
        int [][] matrix = new int [3][4];

        matrix [0][0] = 1;matrix [0][1] = 2;matrix [0][2] = 3;matrix [0][3] = 4;
        matrix [1][0] = 5;matrix [1][1] = 6;matrix [1][2] = 7;matrix [1][3] = 8;
        matrix [2][0] = 1;matrix [2][1] = 2;matrix [2][2] = 3;matrix [2][3] = 12;

        int [][] arrays = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        //for (int row = 0; row <matrix.length; col++){
        //    for(int col=0; col <matrix[row].length; col++){
        //        System.out.println(matrix[row][col]);
        //    }
        // }

        for (int []array: arrays){
            for (int number:array){
                System.out.println(number);
            }
        }
    
    }
}