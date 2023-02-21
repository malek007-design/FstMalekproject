public class Swapping2number {
    public static void main(String[] args) {
        // swap with third variable same for int and strings
        int a=35 ,b=25;
       // String name ="malek";
        //String lastname="saci";
        //System.out.println("before swapping "+ name+ "  "  + lastname);
        //int x=a; a=b; b=x;
        //String othername=name;
             //  name=lastname;
             //  lastname=othername;
        System.out.println(" after swapping " + b + "  "  + a);
      //  System.out.println("after swapping "+ name +"   "  +lastname);//
        a=a+b;
        a=a-b;
        b=a-b;
        System.out.println(" after swapping " + b + "  "  + a);

    }
}
