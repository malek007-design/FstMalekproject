public class Vowels {
    public static void main(String[] args) {
        int i=0;
      char letter = 'z';
        switch (letter)
        {

            case 'a':
            case 'e':
            case 'o':
            case 'u':
            case 'i':
                i++;
        }
            if (i==1)
    {
        System.out.println("the letter "+letter+" is vowel");
    }
     else {
        System.out.println("the letter is consonant");
        }
    }
}