package i04LoopPart01;
import java.util.Scanner;
public class i04_Loop {
    public static void main(String []args){
    Scanner sf = new Scanner(System.in);
    int n = sf.nextInt();
    // print n Even numbers including 0
    for( int i = 1;  i<=n; i++){
        System.out.print((i-1)*2+" ");
      }
    System.out.println("\n");

    // Print all even numbers under 'n' including 0
        for(int i = 0 ; i<=n; i+=2){
//            if(i%2==0){
                System.out.print(i+" ");
//            }
        }
        System.out.println("\n");
        //print odd number under 100 excluded 0
        for(int i=1; i <=n; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\n");
        //2nd way
        for(int i=1; i<=n; i+=2){
            System.out.print(i+" ");
        }

   }
}
