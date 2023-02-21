import java.util.Scanner;

public class Countnbrstring {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.println("enter a string");
        String name = m.nextLine();
        int count = 1;
        for (int i = 0; i <= name.length() - 1; i++) {
            if ((name.charAt(i) == ' ') && (name.charAt(i + 1) != ' ')) count++;

        }
            System.out.println("the number of string is " + count);
        }
    }
