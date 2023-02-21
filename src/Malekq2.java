import java.util.Scanner;

public class Malekq2 {


        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("please entrer ur level in java");
            int level =sc.nextInt();
            switch(level) {

                case 25:
                    System.out.println("very low man");
                    break;
                case 35:
                    System.out.println("it will take u time");
                    break;
                case 60:
                    System.out.println("not bad");

                    break;
                default:
                    System.out.println("java is not for u sorry");
                    break;

            }

        }

    }


