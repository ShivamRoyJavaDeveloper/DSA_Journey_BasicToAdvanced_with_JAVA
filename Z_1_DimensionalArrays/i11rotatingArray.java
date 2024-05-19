package i08Arrays;
import java.util.Scanner;
public class i11rotatingArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int[] arr={1,2,3,4};
        k=k%arr.length;
        int[] ar=new int[arr.length-k];
        int l=0;
        for(int i=0;i<ar.length;i++){
            ar[l]=arr[l];
            l++;
        }
        for(int i=0;i<k;i++){
            for(int j=0;j<k-i;j++){
                arr[i]=arr[arr.length-j-1];
            }
        }
        int sd=0;
        for(int i=k;i<arr.length;i++){
            arr[i]=ar[sd];
            sd++;
        }
        for(int ele:arr){
            System.out.println(ele);
        }
    }
}
