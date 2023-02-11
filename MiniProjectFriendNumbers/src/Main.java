public class Main {
    public static void main(String[] args) {
        /*int number = 17296;
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        int secondSum = 0;
        for (int i = 1; i < sum; i++) {
            if (sum % i == 0) {
                secondSum = secondSum + i;
            }
        }
        if (secondSum == number) {
            System.out.println(number + "'s friend number is " + sum);
        } else {
            System.out.println("This number has not any friend.");
        }*/

        int number1 = 220;
        int number2 = 284;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                sum1 = sum1 + i;
            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                sum2 = sum2 + i;
            }
        }

        if (number1 == sum2 && number2 == sum1) {
            System.out.println("This numbers are friend.");
        } else {
            System.out.println("This numbers are not friend.");
        }
    }
}