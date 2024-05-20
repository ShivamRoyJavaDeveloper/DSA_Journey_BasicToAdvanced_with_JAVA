package i09MultidimensionalArrays.java;
import java.util.Scanner;
public class i02TakingInput {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no. of raw!");
        int n=sc.nextInt();
        System.out.println("Enter the no. of coloumn!");
        int m=sc.nextInt();
        int [][]grid=new int [n][m];
        System.out.println("Enter the elements of grid");
        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        array(grid,n,m);
        if(n==m) {
            System.out.println("It is a square matrix!");
        }
        else {
            System.out.println("It is not a square matrix!");
        }
    }
    static void array(int[][]arr,int a ,int b){
        for(int i=0; i<a;i++){
            for(int j =0; j<b;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println(" ");
        }
    }
}
