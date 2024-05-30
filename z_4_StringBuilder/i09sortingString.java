package i11StringBuilders;
import java.util.Arrays;
public class i09sortingString {
    public static void main(String[]args){
        String s="raghpav";
        char [] ch=s.toCharArray();
        Arrays.sort(ch);
        for(char ele:ch){
            System.out.print(ele);
        }
    }
}
