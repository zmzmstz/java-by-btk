public class Main {
    public static void main(String[] args) {
        // for
        for (int i = 2; i < 12; i += 2) {
            System.out.println(i);
        }
        System.out.println("For loop finished");

        //while
        int i = 24;
        while (i < 32) {
            System.out.println(i);
            i++;
        }
        System.out.println("While loop finished");

        //while ve doWhile arasındaki fark compiler satır satır okuduğu için doWhile şart
        //sağlanmasa bile en az bir kere çalışır ama while şart sağlanmazsa döngüye hiç girmez
        //şartlar sağlanıyorsa aralarında hiç bir fark yok

        //do while
        int j = 1;
        do {
            System.out.println(j);
            j += 3;
        } while (j < 17);
        System.out.println("DoWhile loop finished");
    }

}