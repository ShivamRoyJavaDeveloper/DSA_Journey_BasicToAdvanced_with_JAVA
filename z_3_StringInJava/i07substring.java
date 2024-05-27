package i10Sstring;
public class i07substring {
    static void p(StringBuilder str,String s){
        System.out.println(str);

        System.out.println(s);
        s+="789787";
        str.append(8676);

    }
    public static void main(String[]rgs){
        StringBuilder str=new StringBuilder("I am that boy who want to kiss you!");
        String s="String is immutable in java!";
        System.out.println(str);
        System.out.println(s);
        p(str,s);
        System.out.println(str);
        System.out.println(s);

    }
}
