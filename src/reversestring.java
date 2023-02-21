public class reversestring {

    public static void main(String[] args) {
        String a="malek";
        String  reverse="";
        int len=a.length();
        for(int i=len-1;i>=0;i--){
            reverse=reverse+a.charAt(i);
        }
        System.out.println("the reverse of a is "+reverse);
    }
}
