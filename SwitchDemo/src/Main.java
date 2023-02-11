public class Main {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A' -> System.out.println("very good: passed");
            case 'B' -> System.out.println("good: passed");
            case 'C' -> System.out.println("not bad: passed");
            case 'D' -> System.out.println("bad: passed");
            case 'F' -> System.out.println("very bad: failed");
            default -> System.out.println("you entered wrong value");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("very good: passed");
                break;
            case 'H': // in this case H and B gives same result
            case 'B':
                System.out.println("good: passed");
                break;
            case 'C':
                System.out.println("not bad: passed");
                break;
            case 'D':
                System.out.println("bad: passed");
                break;
            case 'F':
                System.out.println("very bad: failed");
                break;
            default:
                System.out.println("you entered wrong value");
        }
    }
}