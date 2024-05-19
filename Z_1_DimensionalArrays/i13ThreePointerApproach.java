package i08Arrays;
import java.util.Arrays;
public class i13ThreePointerApproach {
    public static void main(String[]args){
        int []arr={0,0,1,1,0,1,0,2,0,1,2,2,1,0,2,1};
        //1
        Arrays.sort(arr);
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
        //2
        int []ar={0,0,1,1,0,1,0,2,0,1,2,2,1,0,2,1};
        int n=ar.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(ar[mid]==0){
                int temp=ar[low];
                ar[low]=ar[mid];
                ar[mid]=temp;
                low++;
                mid++;
            }
            else if (ar[mid]==1){
                mid++;
            }
            else if(ar[mid]==2){
                int temp=ar[mid];
                ar[mid]=ar[high];
                ar[high]=temp;
                high--;
            }
        }
        for (int ele:ar){
            System.out.print(ele+" ");
        }
    }
}
