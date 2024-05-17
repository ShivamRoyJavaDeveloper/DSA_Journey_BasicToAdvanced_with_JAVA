package i08Arrays;
import java.util.Scanner;
public class i04LinearSearch {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the target element!"+"  ");
        int x=sc.nextInt();
        System.out.println("Enter the length of arrays");
        int n=sc.nextInt();
        //1
        int [] arr = new int [n];
        for(int i=0; i<n;i++){
            arr [i]=sc.nextInt();
        }
        int l=0;
        for (int i =0; i<n;i++){
            if (arr[i]%x==0){
                l=1;
            }
        }
        if(l==0){
            System.out.println("Element not found!");
        }
        else{
            System.out.println("Element exist!");
        }
        //2
        System.out.println("Find the max value of array!");

//        int mx=arr[0];
        //OR
        int mx =Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if (arr[i]>mx){
                mx=arr[i];
            }
        }
        System.out.println("The maximum value of Array is "+mx);
    }
}
