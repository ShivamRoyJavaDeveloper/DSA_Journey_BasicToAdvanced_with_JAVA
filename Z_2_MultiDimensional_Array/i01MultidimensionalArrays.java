package i09MultidimensionalArrays.java;
public class i01MultidimensionalArrays {
    public static void main(String[]args){
//        int [][] grid = new int [4][2];
        int [][] grid={{1,2},{2,3},{3,3},{5,6},{3,7},{2,3}};
//        System.out.println(grid[4][1]);
        int [][] matrix=new int [3][3];
        matrix [0][0]=1;
        matrix [0][1]=2;
        matrix [0][2]=3;
        matrix [1][0]=4;
        matrix [1][1]=5;
        matrix [1][2]=6;
        matrix [2][0]=7;
        matrix [2][1]=8;
        matrix [2][2]=9;
        array(matrix);
    }
    static void array(int[][]arr){
     for(int i=0; i<arr.length;i++){
         for(int j =0; j<arr[0].length;j++){
             System.out.print(arr[i][j]+"  ");
         }
         System.out.println(" ");
     }
    }
}
