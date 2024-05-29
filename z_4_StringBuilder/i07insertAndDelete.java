package i11StringBuilders;
public class i07insertAndDelete {
    public static void main(String[]args){
        StringBuilder s=new StringBuilder("The String is immutable!");
        System.out.println(s.length());
        s.deleteCharAt(3);
        System.out.println(s.length());
        s.insert(3," ");
        s.insert(8,"sssss");
        System.out.println(s);
        System.out.println(s.length());
        s.delete(8,13);
        System.out.println(s);
        System.out.println(s.length());
        s.insert(3,true);/// we can insert booleans!
        System.out.println(s);
    }
}
