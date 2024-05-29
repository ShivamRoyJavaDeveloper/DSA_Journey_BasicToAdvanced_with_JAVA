package i11StringBuilders;
public class i06append {
    public static void main(String[]args){
        StringBuilder s=new StringBuilder();
        s.append("ssssss");
        s.append("ssssss");
        s.append("ssssss");
        s.append("ssssss");
        int l=s.length();
        System.out.println(s.capacity());
        System.out.println(s);
        System.out.println(l);
    }
}
