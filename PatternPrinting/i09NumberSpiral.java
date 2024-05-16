package i07Pattern_Printing;
import java.util.Scanner;
public class i09NumberSpiral {
    public static void main(String[]main){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char [][]arr=new char[n][n];
        int k=0;
        for(int i=0;i<n/2+1;i++){
            if(i%2==0) {
                for (int j = k; j < n - k; j++) {
                    arr[k][j]='*';
                    System.out.print(arr[k][j] + " ");
                }
                for (int v = k + 1; v < n - k; v++) {
                    System.out.print(arr[v][n - k - 1] + " ");
                    arr[v][n - k - 1]='*';
                }
                for (int s = n - 2 - k; s >= k; s--) {
                    System.out.print(arr[n - k - 1][s] + " ");
                    arr[n - k - 1][s]='*';
                }
                k++;
                for (int c = n - 1 - k; c >= k; c--) {
                    System.out.print(arr[c][k - 1] + " ");
                    arr[c][k - 1]='*';
                }
                System.out.println();
            }
            else{
                for (int j = k; j < n - k; j++) {
                    System.out.print(arr[k][j] + " ");
                    arr[k][j]='#';
                }
                for (int v = k + 1; v < n - k; v++) {
                    System.out.print(arr[v][n - k - 1] + " ");
                    arr[v][n - k - 1]='#';
                }
                for (int s = n - 2 - k; s >= k; s--) {
                    System.out.print(arr[n - k - 1][s] + " ");
                    arr[n - k - 1][s]='#';
                }
                k++;
                for (int c = n - 1 - k; c >= k; c--) {
                    System.out.print(arr[c][k - 1] + " ");
                    arr[c][k - 1]='#';
                }
                System.out.println();
            }
        }
        for(char []ele:arr){
            for(char x:ele){
                System.out.print(x+"  ");
            }
            System.out.println("");
        }
    }
}
