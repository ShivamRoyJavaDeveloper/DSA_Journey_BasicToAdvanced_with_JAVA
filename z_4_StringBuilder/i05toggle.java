package i11StringBuilders;
public class i05toggle {
    public  static void main(String[]args){
        StringBuilder s=new StringBuilder("The String Is Immutable!");
        int l=s.length();
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            int asc=(int)ch;
            if(asc>=65&&asc<97){
               asc+=32;
               ch=(char)asc;
               s.setCharAt(i,ch);
            }
            else if(asc>=97){
                asc-=32;
                ch=(char)asc;
                s.setCharAt(i,ch);
            }
        }
        System.out.println(s);
    }
}
