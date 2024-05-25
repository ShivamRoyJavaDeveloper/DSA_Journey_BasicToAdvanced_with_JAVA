package i10Sstring;
import java.util.Scanner;
public class i05LowerCaseUpperCaseConcate {
    public static void main (String[]args){
        // just revise your notes
        // And find rest of 8 videos notes !
        String str="The boys are looking at you!";
        String st=str.toLowerCase();
        String sst=str.toUpperCase();

        System.out.println(sst+""+st);
        st+="sss";     // Remind why it is wrost method in the world!
        System.out.println(st);

        String kk=st.concat(sst); ////Adding two string
        System.out.println(kk);
    }
}