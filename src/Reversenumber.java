public class Reversenumber {

    public static void main(String[] args) {
        int number=412658;
        int reverseint=0;
        for(;number!=0;number=number/10) {
            int reminder=number%10;
            reverseint=reverseint*10+reminder;
        }
        System.out.println("the reverse number of number is  "+reverseint);
    }

}



