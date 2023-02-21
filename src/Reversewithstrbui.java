public class Reversewithstrbui {
    public static void main(String[] args) {
        String name="juba mayas riwan";
        String[] str= name.split("\\s");
        String reverseword="";
        for (String x:str){
            StringBuilder sb=new StringBuilder(x);
            sb.reverse();
            reverseword=reverseword+sb.toString()+"  ";
        }
        System.out.println(reverseword);

    }
}
