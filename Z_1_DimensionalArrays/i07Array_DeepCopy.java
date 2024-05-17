package i08Arrays;
import java.util.Arrays;
public class i07Array_DeepCopy {
    public static void main(String[]args){
//       int [] arr={65,7,23,56,78,75,46,78,654,46};
//     for(int x:arr){
//         System.out.print(x+" ");
//     }
//     Arrays.sort(arr);
//        System.out.println(" ");
//        for(int x:arr){
//            System.out.print(x+" ");
//            //2
//            System.out.println(" ");
             int [] a={33,5,66,77,4,57,6};
            j(a);
        System.out.println(a[0]);//shallow copy//there is pass by reference.
        //3
        //deep copy
        int [] brr=Arrays.copyOf(a,a.length);
        brr[0]=7;
        System.out.println(a[0]);//there is pass by values.//after changing to 7 .it still sows 1.
        System.out.println(brr[0]);
        System.out.println(brr[2]);
        }
//    }
    //2
    static void j(int [] a){

        for(int t:a){
            System.out.print(t+" ");
        }
        System.out.println("\n");
        int[]num=a;
        num[0]=1;
        System.out.print(a[0]);//shallow copy//there is pass by reference.
    }
}
