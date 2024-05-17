package i08Arrays;
import java.util.Scanner;
public class i03ArrayQuestions {
    public static void main(String[]args){
        Scanner d =new Scanner(System.in);
        int n=d.nextInt();
        //1
        int[] arr =new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=d.nextInt();
        }
        for (int i =0;i<arr.length;i++){
            if(arr[i]<35){
                System.out.print(i+" ");
            }
        }
        //2
        
    }
}
