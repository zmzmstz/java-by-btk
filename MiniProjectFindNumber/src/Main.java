public class Main {
    public static void main(String[] args) {
        int[] numberArray = new int[]{1,2,5,7,9,0};
        int theNumber = 4;
        boolean isNumber = false;

        for (int number : numberArray){
            if (number == theNumber){
                isNumber = true;
                break;
            }
        }

        if (isNumber){
            System.out.println("This number is including in the array.");
        } else {
            System.out.println("This number is not including in the array.");
        }
    }
}