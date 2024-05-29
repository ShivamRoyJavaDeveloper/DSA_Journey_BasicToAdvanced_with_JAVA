package i11StringBuilders;
public class i08Reverse {
    public static void main(String[]args){
        String s="ShivamRoy";
        StringBuilder ss=new StringBuilder("ShivamRoy");
        System.out.println(s.charAt(3));
        int i=0;
        int j=s.length()-1;
        int k=s.length()-1;
        String st="";
        while(j>=0){
            st += s.charAt(j);
            i++;
            j--;
        }
        System.out.println(st);
        j=s.length()-1;
        reverse(ss,k);
    }
    static void reverse(StringBuilder ss , int j){
        int i=0;
        while(i<=j){
            char ch=ss.charAt(i);
            ss.setCharAt(i,ss.charAt(j));
            ss.setCharAt(j,ch);
            i++;
            j--;
        }
        System.out.println(ss);
    }
}
