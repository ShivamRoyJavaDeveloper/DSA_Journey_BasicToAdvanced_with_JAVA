package i08Arrays;
import java.util.Scanner;
public class i11RotatingArrays {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rotation");
        int k=sc.nextInt();
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        int n=arr.length;
        /*
        1,2,3,4,5,6,7,8, 9,0\
        ---------------- ---
        if k=2 , then
        9,0, 1,2,3,4,5,6,7,8
         */

        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }static void reverse(int arr [],int i,int j) {

        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }

    }
}
