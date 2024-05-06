package i01primitiveDataType;
public class type_casting {
    public static void main(String[]args){
        int a;
        a=3;
        System.out.println(a);
        float b,c;
        b =7.78f;
//        Before typecasting
        System.out.println(b); // it will give 7.78

        b=a;
        //        After implicit typrcasting
        System.out.println(b); // it will print 3.0 because of implicit typecasting.
        c=8.09f;
        System.out.println(c);

        // Before typecasting
        System.out.println(a);

        // After typecasting
        a=(int)c;
        System.out.println(a); // it will print 8 only because of explicit type casting.

    }
}
