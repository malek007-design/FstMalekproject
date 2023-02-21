public class Countevenodd {
    public static void main(String[] args) {
       int num=251478993;
        int count_even=0;
        int count_odd=0;
        while(num>0){
          int  remi=num%10;
          if ( remi%2==0){
              count_even++;
          }
          else {
              count_odd++;
            }
          num=num/10;
        }
        System.out.println( "the number of even number is "+count_even);
        System.out.println("the number of odd number is  "+ count_odd);
    }
}
