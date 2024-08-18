package i11StringBuilders;
public class i11StringArrays {
    public static void main(String[] args) {
        String[] a = {"The", "String", "is", "immutable", "but", "StringBuilder", "is", "mutable", "so", "always", "try", "to", "make", "SB", "not", "always!"};
        String str="";///first you have to initiate and then
        for (String ele : a) {
            System.out.print(ele + " ");
            str = "The String is immutable. The StringBuji ";/// then you can add something new String!
        }
        System.out.println(str);
    }
}
