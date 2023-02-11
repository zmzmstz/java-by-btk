public class Main {
    public static void main(String[] args) {
        int number = 1;
        boolean isPrime = true;
        if (number<2){
            System.out.println("This is not a prime number");
            return; // 2. satırdaki mainden direkt çıkış sağlar alt satırlarda kalan kodları döndürmez
        }
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("This is not a prime number");
        }
    }
}