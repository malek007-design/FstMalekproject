import java.util.Scanner;

public class Revstr {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("please enter ur name" );
        String name = sc.next(); // user input into scanner

    String rev = "";
    int i =1;
            for (i = 0; i < name.length();  i++) {
        rev = name.charAt(i) +   rev;
    }
            System.out.println(rev);
}
}