package i11StringBuilders;
public class i02ChangeEvenIna {
    public static void main(String []args){
        String str="The String is Immutable!";
        int l=str.length();
        String s="";
        for(int i=0;i<l;i++){
            if (i%2==0){
                s+='a';
            }
            else{
                s+=str.charAt(i);
            }
        }
        System.out.println(s);
    }
}
