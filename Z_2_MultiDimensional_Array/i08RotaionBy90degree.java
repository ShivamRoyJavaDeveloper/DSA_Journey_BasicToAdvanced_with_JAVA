package i09MultidimensionalArrays.java;
//import java.util.Scanner;
public class i08RotaionBy90degree {
    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the orde of square matrix!");
//        int n=sc.nextInt();
        int arr[][]={{1,2,3,1,2},{4,5,6,1,2},{7,8,9,1,2},{1,2,3,1,2},{1,2,3,1,2}};
        int l=arr.length;
        System.out.println("Matrix arr");
        for(int []ele:arr){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        for (int i=0;i<l;i++){
            for(int j=0;j<i;j++){
               int temp=arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]=temp;
            }
            }
        System.out.println("TransposeOfMatrix arr");
        for(int []ele:arr){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        for (int i=0; i<l;i++){
            int k=l-1;
            for(int j=0;j<l/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][k];
                arr[i][k]=temp;
                k--;
            }
        }
        System.out.println("Rotating the matrix by 90 degree!");
        for(int[] ele:arr){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
