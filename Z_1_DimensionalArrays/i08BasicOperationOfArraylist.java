package i08Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class i08BasicOperationOfArraylist {
    public static void main(String[]args){
        List<Integer> arr=new  ArrayList<>();
        arr.add(30);
        arr.add(3);
        arr.add(340);
        arr.add(305);
        arr.add(3230);
        System.out.println(arr.get(0));        //before set
        System.out.println(arr.size());
        arr.add(97);
        System.out.println(arr.size());
        arr.set(0,67);
        System.out.println(arr.get(0));       //after set the value

        System.out.print(arr+" ");            //Before removing the 3rd index.
        System.out.println(" ");

        arr.remove(3);                  // after removing the 3rd index.
        System.out.println(arr);

    }
}
