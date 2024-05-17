//Referernce variable can pass in Methods.    like arrays[]
// value can not be changed rather than reference.   like int float long etc
package i08Arrays;
public class i06PassingfArraysInMethods {
    public static void main(String[]args){
        //1
        int x=5;
        System.out.println(x);
        change(x);
        System.out.println(x);
//2
        chang d=new chang();
        int s=d.change();
        System.out.println(s);
//3
        int [] arr={1,5,5,6,7,4};
        Arrays p=new Arrays();
        p.change(arr);
        System.out.println(arr[0]);
//4
        arra o=new arra();
        o.Change(arr);
        System.out.println(arr[0]);
    }
    //1
    //kabhi bhi value return hone ke baad main function ki value hi show karti hai
//    method ki value ni jayegi.
    static int change(int x){
        System.out.println(x);
        x=10;
        System.out.println(x);
        return x;
    }
}
//2
class chang{
     int change(){
         int x=9;
         x=10;
        return x;
    }
}
//3
class Arrays{
    int x;
    int change(int []arr){

        arr [0]=9;
//        System.out.println(arr[0]);
        return x;
    }
}
//4
class arra{
    void Change(int [] arr){
        arr [0]=3;
    }
}
