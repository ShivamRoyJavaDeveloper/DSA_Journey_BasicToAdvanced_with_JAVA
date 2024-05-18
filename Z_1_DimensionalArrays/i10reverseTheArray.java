package i08Arrays;
import java.util.Arrays;
public class i10reverseTheArray {
    public static void main(String[]args){
        //1
        int []arr ={10,20,30,40,50,60,70,80,90};
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println("");
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[arr.length-j-1]+" ");
            }
        System.out.println("");
        System.out.println("The number of element in array arr :- "+arr.length);
        //2
        Arr j=new Arr();
        j.array();
        System.out.println(" ");

        //3
        int[]ar={3,4,5,6,7,8,89};
        int i=0;
        int m=ar.length-1;
        while(i<=m){
            ae g=new ae();
            g.array(ar,i,m);
            i++;
            m--;
        }
        for(int ele:ar){
            System.out.print(ele+" ");
        }
        }
    }
    //2
class Arr{
    void array(){
      int [] arr ={1,2,3,4,5,6,7,8,9,10,000,20,19,18,17,16,15,14,13,12,11,12};
//      Arrays.sort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
        for(int i=0;i<=arr.length/2;i++){
            int j=arr[i];
          arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=j;

        }
        System.out.println("");
        for(int ele:arr){
            System.out.print(ele+" ");
         }
       }
    }
//3
    class ae{
    void array(int []arr,int i,int j){
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;

    }
    }


