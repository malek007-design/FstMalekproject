import java.util.Scanner;

public class Ifpalindrome {

    int a=484;
    int b=46;
    int c=464;


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number");
        int number=input.nextInt();
        int orgnum=number;
        int inversenumber=0;
        while(number!=0)
        {
             inversenumber=inversenumber*10+number%10;
             number=number/10;
        }
          if (inversenumber==orgnum)
          {
              System.out.println(orgnum+" is plaindrome ");
          }
         else {
            System.out.println(orgnum+ " is not palindrome number");
        }
    }
}
