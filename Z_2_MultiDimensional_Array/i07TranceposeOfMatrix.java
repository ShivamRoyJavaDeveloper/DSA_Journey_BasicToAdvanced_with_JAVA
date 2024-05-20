package i09MultidimensionalArrays.java;
import java.util.Scanner;
public class i07TranceposeOfMatrix {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array of arrays!");
        int n=sc.nextInt();
        System.out.println("enter size of arrays!");
        int m=sc.nextInt();
        int [][] grid =new int [n][m];
        System.out.println("Enter the elements of arrays");

        System.out.println("matrix is:- ");
        taking(grid,n,m,sc);
        System.out.println("Trancepose of matrix is:- ");
        for(int i=0; i<m;i++){
            for(int j=0;j<i;j++){
                int temp=grid[i][j];
                grid[i][j]=grid[j][i];
                grid [j][i]=temp;
            }
            System.out.println();
        }


        for(int []ele:grid){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }


    }
    static void taking(int[][] arr,int a,int b,Scanner sc)
    {
     for(int i=0; i<a;i++){
         for(int j=0;j<b;j++){
             arr[i][j]=sc.nextInt();
         }
     }
     for(int []ele:arr){
         for(int x:ele){
             System.out.print(x+" ");
         }
         System.out.println();
     }
    }
}
