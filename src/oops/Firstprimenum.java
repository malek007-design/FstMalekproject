package oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Firstprimenum {
    public static void main(String[] args) {
        System.out.println("please enter ur limit number");
        Scanner scanner=new Scanner(System.in);
        int limit=scanner.nextInt();

        List<Integer> PrimeNumbers = new ArrayList<>();
        int numbertocheck=2;

        int count=0;
        while (true){
            boolean isprime = true;
            for (int fact = 2; fact <= numbertocheck / 2; fact++) {
                if (numbertocheck % fact == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                PrimeNumbers.add(numbertocheck);
                count++;
                if (count>=limit){break;}

            }
        }
        numbertocheck++;
        System.out.println("prime number from 1 to limit");
        for (int number:PrimeNumbers ){
            System.out.println(number);
        }
    }
}