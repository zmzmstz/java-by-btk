public class Main {
    // referance types ve value types --> python final output question

    // classes are 'referance types'
    public static void main(String[] args) {
        CustomerManager customerManager2 = new CustomerManager();
        CustomerManager customerManager;
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
        // steck; heap; garbageManager;

        /* referance types dolaylı olarak değer alıyo gibi
        value types direkt değer, instant assign alıyo */

        // primitive types are 'value types'
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        String kelime1 = "10";
        String kelime2 = "20";
        kelime2 = kelime1;
        kelime1 = "30";
        System.out.println(kelime2);

        // ----------------------

        // arrays are referance types
        int[] sayilar1 = new int[]{0,1,2};
        int[] sayilar2 = {3,4,5};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);

        /* şimdiii primitive typelar yalue type olduğu için değişkenlerin değerleri
         değişkenlerle birlikte tutuluyor ama primitive typların dışında kalan
         typlar(array, class vs) referance type olarak geçtiği için değerleri
         kendileriyle beraber değilde kendi üstlerinde yazan başka bir adreste
         tutuluyor, e adrese gittiğinizde de haliyle güncellenmiş olanı buluyosunuz */
    }
}