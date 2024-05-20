package i09MultidimensionalArrays.java;
import java.util.Scanner;
public class i10SpiralArrays {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of square matrix!");
        int n=sc.nextInt();
        System.out.println("Enter the element of matrix!");
        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int []ele:arr){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        int k=0;
        for(int i=0;i<n/2+1;i++){
            for(int j=k;j<n-k;j++){
                System.out.print(arr[k][j]+" ");
            }
            for(int v=k+1;v<n-k;v++){
                System.out.print(arr[v][n-k-1]+" ");
            }
            for(int s=n-2-k;s>=k;s--){
                System.out.print(arr[n-k-1][s]+" ");
            }
            k++;
            for(int c=n-1-k;c>=k;c--){
                System.out.print(arr[c][k-1]+" ");
            }
            System.out.println();
        }
    }
}
