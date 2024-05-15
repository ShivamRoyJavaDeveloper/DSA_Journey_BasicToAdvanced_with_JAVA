package i05LoopPart02;
public class i004practiceZ {
    public static void main(String[]args){
        int x =4,y=0;
        while(x>=0){
            x--;
            y++;
            if(x==y){ continue;}
            else{ System.out.print(x+" "+y);}
                System.out.print("          ");
        }
    }
}
