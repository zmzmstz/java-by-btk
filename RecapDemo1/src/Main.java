public class Main {
    public static void main(String[] args) {
        int number1, number2, number3;
        number1 = 20;
        number2 = 25;
        number3 = 2;
        int biggestNumber = number1;

        if (biggestNumber < number2) {
            biggestNumber = number2;
        }
        if (biggestNumber < number3) {
            biggestNumber = number3;
        }
        System.out.println("Biggest number is " + biggestNumber);
    }
}