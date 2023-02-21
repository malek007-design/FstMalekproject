public class ReverseEachwordString {
    public static void main(String[] args) {
        String mulwrd =" malek va a lecole pour manger du riz ";
        String reverse="";// to store inversed words
        String[] wrd =mulwrd.split(" "); //to split into individual string
        for (String x:wrd){// loop each word
             String reversewrd=""; //to store each revesed word
             for (int i=x.length()-1;i>=0;i--) //get the lengh of string -1
             {reversewrd=reversewrd+x.charAt(i);// reverse the word
             }
             reverse=reverse+reversewrd+" ";// to write the final staetment

        }
        System.out.println(reverse);// to print the final statement

    }
}
