package i11StringBuilders;
import java.util.Scanner;
public class i12_2MostOccurrance {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str="thestringismutableypoohhg";
        int l=str.length();
        int []c=new int[26];
        for(int i=0;i<l;i++){
            char ch=str.charAt(i);
            int k=(int)ch;
            k-=97;
            c[k]++;
        }
        int mx=0;
     for(int i=0;i<26;i++){
         if(c[i]>mx){
             mx=c[i];
         }
     }
        System.out.println(mx);
        for(int i=0;i<26;i++){
            if(c[i]==mx){
                System.out.println((char)(i+97));
            }
        }
    }
}
