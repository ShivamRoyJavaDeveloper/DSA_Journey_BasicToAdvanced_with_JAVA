package i08Arrays;
import java.util.Arrays;
public class i12SortTheArraysOf0and1 {
    public static void main(String[]args){
        int [] arr={1,0,0,1,1,0};
        int n=arr.length;
        //1
        Arrays.sort(arr);
        for(int ele:arr) {
            System.out.print(ele + " ");
        }
            System.out.println(" ");

        // 2
        int zero=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
            }
        }
        for(int i=0; i<zero;i++){
            arr[i]=0;
        }
        for(int i=zero;i<n-1;i++){
            arr[i]=1;
        }
        for(int ele:arr) {
            System.out.print(ele + " ");
        }
        System.out.println(" ");

        //     Method 3
            int i=0;
            int j=n-1;
            while(i<j){
                if(arr[i]==0){
                    i++;
                }
                else if(arr[j]==1){
                    j--;
                }
                else if(arr[i]==1&&arr[j]==0){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j--;
                }
            }
        for(int ele:arr) {
            System.out.print(ele + " ");
        }
    }
}
