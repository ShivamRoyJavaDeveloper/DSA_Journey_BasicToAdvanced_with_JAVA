package i10Sstring;
import java.util.Scanner;
public class i03CountingVowelsInString {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string!");
        String str=sc.nextLine();
        int l=str.length();
        int count =0;
        System.out.print("The give vowels are:- ");
     for(int i=0; i<l;i++){
        count=reverse(str,i,count);
     }
        System.out.println();
        System.out.println(count);
    }
    static int reverse(String str ,int i ,int count){

     if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U'){
         System.out.print(str.charAt(i));
         count++;
     }
     return count;
    }
}
