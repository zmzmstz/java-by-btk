public class Main {
    public static void main(String[] args) {
        findNumber(5);
        findNumber(3);
        findNumber(8);
        findNumber(9);
    }
    public static void findNumber(int theNumber){
        int[] numberArray = new int[]{1,2,5,7,9,0};
        boolean isNumber = false;

        for (int number : numberArray){
            if (number == theNumber){
                isNumber = true;
                break;
            }
        }

        if (isNumber){
            giveMessage("This number is including in the array.");
        } else {
            giveMessage("This number is not including in the array.");
        }
    }

    public static void giveMessage(String message){
        System.out.println(message);
    }
}
