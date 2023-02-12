public class Main {
    public static void main(String[] args) {
        // void methodları işlem yapabilir, veri tabanını değiştirebilir ama bir şey return etmez
        // Java BTK Akademi 8.2
        /* String yeniMesaj = ekle();
        mesela bu örnekte ekle void olduğu ve bir değer return etmediği için
        yeniMesaj değeri ekleye eşitlenemez çünkü ekle değersiz */
        /* void fonksiyonlarında return kullanılırsa
        return;
        fonksiyonu bitirir ama bir şey döndürmez */


        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = mesaj.substring(0, 2);
        System.out.println(yeniMesaj);

        String dogrusu = String.valueOf(topla(8, 9));
        System.out.println(dogrusu);

        // String hatalıOrnek = topla(5,7); doğrusu --> String dogrusu = String.valueOf(topla(8,9));
        // yani string bir değişkene int değer atanamaz

        int toplam = topla2(2, 3, 4, 5, 6, 7, 8, 9, 10, 1);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void güncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla(int number1, int number2) {
        return number1 + number2;
    }

    public static int topla2(int... numbers) { // alınan argümanlar array e çevrilerek kullanılır
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

    public static String sehirVer() {
        return "Ankara";
    }
}