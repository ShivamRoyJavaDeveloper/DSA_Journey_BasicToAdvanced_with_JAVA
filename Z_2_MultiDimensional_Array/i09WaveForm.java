package i09MultidimensionalArrays.java;
//import java.util.Scanner;
public class i09WaveForm {
    public static void main(String[]args){
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        for(int i=0;i<n;i++){
           if(i%2!=0){
               int k=n-1;
               for(int j=0;j<n/2;j++){
                   int temp=arr[i][j];
                   arr[i][j]=arr[i][k];
                   arr[i][k]=temp;
                   k--;
               }
           }
        }
        for(int []ele:arr){
            for(int x:ele){
                System.out.print(x+" ");
            }
        }
    }
}
