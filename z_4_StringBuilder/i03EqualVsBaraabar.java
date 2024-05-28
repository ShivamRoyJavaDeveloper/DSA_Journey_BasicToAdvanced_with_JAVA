package i11StringBuilders;
public class i03EqualVsBaraabar {
    public static void main(String[]args){
        ///see notes!

        System.out.println("Hello");
        String s="abcpqr";
        String ss="abcpqr";
        System.out.println(ss==s);//Why true ! /// it uses precreated String in memory
        ss="abc";
        ss=ss+"pqr";
        System.out.println(ss==s);// Why false !  //// because here creating a new String in memory !

        ss=new String(s);
        boolean k=ss==s;
        System.out.println(k);

        ///// == it check only in memory address same or not!
        ///// equals()  it check exactly every single characters of String same or not!

        System.out.println(ss.equals(s)); /// it will give true!

    }
}
