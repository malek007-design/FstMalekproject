import java.util.Scanner;

public class Ifpalindromestring {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a string" );
        String str=sc.next();
        String orgstr=str;
        String rev="";
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(rev.equals(orgstr))
        {
            System.out.println(orgstr +" is plaindorme ");}
        else{
            System.out.println(orgstr+" is not palindorme");}
    }
}
