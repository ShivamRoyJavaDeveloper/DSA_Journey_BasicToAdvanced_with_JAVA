package i08Arrays;
import java.util.Scanner;
public class i05QuestionMaxValues {
    public static void main(String[]args){
        Scanner f=new Scanner(System.in);
//        int n=f.nextInt();
        int [] arr={78,565,44,56,5,4,55,33,3,2,64,98,0,4,-1};
        int mx=arr[0];

        for(int i=1; i<arr.length; i++){
            if (arr[i]>mx){
                mx=arr[i];
            }
        }
        System.out.println("The Max value is:- "+mx);
        int smx=arr[0];
        for(int i =0; i<arr.length; i++){
            if (arr[i]>smx && arr[i]<mx){
                smx=arr[i];
            }
        }
        System.out.println("The second maximum value is:- "+smx);
    }
}
