package i08Arrays;

public class i09Arrays {
    public static void main(String[]args){
        //1
//        WAP for x=9
        int []arr=new int [8];
        arr[0]=7;
        arr[1]=2;
        arr[2]=9;
        arr[3]=0;
        arr[4]=8;
        arr[5]=1;
        arr[6]=10;
        arr[7]=-1;
        int x=9;
        int y=0;
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    System.out.print(arr[i]+"&"+arr[j]+"  ");
                    y++;
                }
            }
        }
        System.out.println(" \n");
        System.out.println("The no. of doublet is : "+y);
    }
}
