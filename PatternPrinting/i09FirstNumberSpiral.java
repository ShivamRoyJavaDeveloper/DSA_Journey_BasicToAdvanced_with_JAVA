package i07Pattern_Printing;
import java.util.Scanner;
class i09FirstNumberSpiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //1st term
        for(int i=n;i>=1;i--){
            for(int j=n;j>=1;j--){
                if(i<j){
                    System.out.print(j+"   ");
                }
                if(i>=j){
                    System.out.print(i+"   ");
                }
            }
            for(int j=2;j<=n;j++){
                if(i<=j){
                    System.out.print(j+"   ");
                }
                if(i>j){
                    System.out.print(i+"   ");
                }
            }
            System.out.println();
        }
        //2nd term
        for(int i=2;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(i>=j){
                    System.out.print(i+"   ");
                }
                if(i<j){
                    System.out.print(j+"   ");
                }
            }
            for(int j=2;j<=n;j++){
                if(i>=j){
                    System.out.print(i+"   ");
                }
                if(i<j){
                    System.out.print(j+"   ");
                }
            }
            System.out.println();
        }
    }
}
