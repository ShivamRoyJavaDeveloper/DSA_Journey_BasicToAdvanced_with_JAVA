package i07Pattern_Printing;
import java.util.Scanner;
public class i02TriangleTypePrinting {
    public static void main(String[]args){
        Scanner f = new Scanner(System.in);
        int n =f.nextInt();
        //Print some Triangle Type pattern
        for(int a = n; a>=1; a--){
            for(int i =a; i>=1;i--) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
        System.out.println(" \n");

        //2
        for(int a = n; a>=1; a--){
            for(int i =a; i>=1;i--) {
                System.out.print(i+"  ");
            }
            System.out.println("");
        }
        System.out.println(" \n");

        // 3
        for(int a = 1; a<=n; a++){
            for(int i =1; i<=a;i++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
        System.out.println(" \n");
        //4
        for(int a = 1; a<=n; a++){
            for(int i =1; i<=a;i++) {
                System.out.print(i+"  ");
            }
            System.out.println("");
        }
        System.out.println(" \n");

        // 5
        int kk=n;
        for(int l = 1; l<=n; l++,kk--){
            kk=kk;
            for(int k = kk-1;k>=1; k--){
                System.out.print("   ");
            }
            for(int i= 1; i<=l; i++ ){
                System.out.print("*  ");
            }
            System.out.println("");
        }
        //6
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print("   ");
            }
            for (int g =1;g<=i; g++ ){
                System.out.print("  "+i);
            }
            System.out.println("");
        }
        //7
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print("   ");
            }
            for (int g =1;g<=i; g++ ){
                System.out.print("  "+g);
            }
            System.out.println("");
        }
        //8
        for(int j = 1; j<=n; j++){
            for(int i=1; i<=j; i++){
                System.out.print((char)(i+64) +"  ");
            }

            System.out.println("   ");
        }
        //9
        for(int j=1; j<=n; j++){
            if(j%2==0){
                for(int i=1; i<=j; i++){
                    System.out.print((char)(i+64)+"  ");
                }
            }
            else{
                for(int i=1; i<=j; i++) {
                    System.out.print(i+"  ");
                }
            }
            System.out.println("   ");
        }


    }
}
