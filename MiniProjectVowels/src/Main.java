import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        char vowel = 'e';

        switch (vowel){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("This is a bold vowel.");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("This is a thin vowel.");
                break;
            default:
                System.out.println("UUPS! This is not a vowel.");
        }
    }
}