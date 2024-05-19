package i08Arrays;
public class i15NextGreatestElement {
    public static void main(String []arguments){
        int []arr={155,1,2,15,5,1,2,122,22,1};
        int n=arr.length;
        int []ans=new int[n];
        ans[n-1]=-1;
       int age=arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]=age;
            age=Math.max(age,arr[i]);
        }
        for(int ele:ans){
            System.out.print(ele+"   ");
        }
    }
}
