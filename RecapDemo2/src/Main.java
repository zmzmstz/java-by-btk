public class Main {
    public static void main(String[] args) {
        // challenge --> write a double array with for and find the sum of the numbers and find the biggest

        // my code
        double[] myList = new double[4];
        myList[0] = 5.6;
        myList[1] = 8.3;
        myList[2] = 7.5;
        myList[3] = 5;

        double biggest = myList[0];

        double sum = 0;

        for (int i = 0; i < myList.length; i++) {
            if (biggest < myList[i]) {
                biggest = myList[i];
            }
            System.out.println(myList[i]);
            sum = sum + myList[i];
        }

        System.out.println("the summation is " + sum);
        System.out.println("the biggest number is " + biggest);

        System.out.println("--------------------------");

        // another way
        double[] yourList = {1.2, 3.4, 5, 6.0};

        double total = 0;
        double max = yourList[0];
        for (double number : yourList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }

        System.out.println("Summation = " + total);
        System.out.println("Maximum = " + max);
    }
}