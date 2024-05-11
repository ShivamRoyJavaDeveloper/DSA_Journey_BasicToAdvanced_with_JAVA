package i04LoopPart01;
import java.util.Scanner;
public class i03_ForLoops {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        int n = sd.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "  ");
        }
    }
}
