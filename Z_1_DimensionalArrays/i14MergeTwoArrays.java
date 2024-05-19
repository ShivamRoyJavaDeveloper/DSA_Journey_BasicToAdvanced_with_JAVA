package i08Arrays;
public class i14MergeTwoArrays {
    public static void main(String []args){
        int[] arr1={11,22,33,44,45,46,78};
        int k=arr1.length;
        int[] arr2={1,2,3,4,5,6,7,99};
        int l=arr2.length;
        int[]arr3=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int p=0;
        while(i<k&&j<l){
            if(arr1[i]<arr2[j]){
                arr3[p]=arr1[i];
                i++;
                p++;
            }
            else if(arr1[i]>arr2[j]){
                arr3[p]=arr2[j];
                j++;
                p++;
            }
        }
        if(i==k){
            for(int jj=j;jj<l;jj++){
            arr3[p]=arr2[jj];
            p++;
            }
        }
        else if(j==l){
            for(int jj=i;jj<k;jj++){
                arr3[p]=arr1[jj];
                p++;

            }
        }
        for(int ele:arr3){
            System.out.print(ele+" ");
        }
        System.out.println(p);
    }
}
