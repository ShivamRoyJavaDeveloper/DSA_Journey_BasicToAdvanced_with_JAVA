package i11StringBuilders;
public class i08reverseEachWord {
   public static void main(String[]args){
        System.out.println("The String is immutable!");
        StringBuilder s=new StringBuilder("The     StringBuilder is     mutable!");
        int i=0;
        int l=s.length()-1;
        int j=0;
       System.out.println(s);
      while(j<l){
          if(s.charAt(j)!=' '){
              j++;
          }
         else if(s.charAt(j)==' '){
             man(s,i,j-1);
             i=j;
             for(int k=i;k<l;){
                 i++;
                 if(s.charAt(i)!=' '){
                     break;
                 }
             }
             j=i;
         }
      }
       man(s,i,j);
       System.out.println(s);
   }
    static void man(StringBuilder s,int i,int j){
      while(i<j){
          char ch= s.charAt(i);
          s.setCharAt(i,s.charAt(j));
          s.setCharAt(j,ch);
          i++;
          j--;
      }
    }
}
