package i10Sstring;
public class i08PrintAllTheSubstringofString {
    public static void main(String[]args){
        String str="string";
        int l=str.length();
        int count=0;
        for(int i=0;i<l;i++){
            String s=str.substring(i);
            System.out.print(s+" ");
            count++;
            for(int j=l-1;j>i;j--){
                String ss=str.substring(i,j);
                System.out.print(ss+" ");
                count++;
            }
        }
        System.out.println(count);
    }
}