package i08Arrays;
import java.util.Scanner;
public class i01Arrays {
    public static void main(String[]args){
        Scanner d=new Scanner(System.in);
        int n = d.nextInt();
        int k = d.nextInt();

        int [] y ;
        y=new int[4];
        y[1]=84776;
        y[2]=87676;
        y[3]=87776;
        System.out.println(y[3]);
        y[0]=997;
        System.out.println(y[0]);
        y[0]=8776;
        //2
        int []x=new int[n];
        for(int i =0; i<n; i++){
            x[i]=2*i+1;
            System.out.print(x[i]+"  ");
        }
        System.out.println("");

        //3
        int [] arr=new int [k];
        for(int i=0; i<k; i++){
            arr[i]=d.nextInt();
                    }
        System.out.println("");
        for(int i=0; i<k;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println("");
        //4
        int [] a={67,55,553,5646,25,5};
        for(int i=0; i<5; i++){
            System.out.print(a[i]+" ");
        }
    }
}
