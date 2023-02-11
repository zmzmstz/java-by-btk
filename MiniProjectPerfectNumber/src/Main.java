public class Main {
    public static void main(String[] args) {
        /*for (int number = 1; number > 0; number++) {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == number) {
                System.out.println(number);
            }*/
        int number = 33550336;
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.println("This number is excellently perfect.");
        } else {
            System.out.println("This number is garbage.");
        }
    }
}