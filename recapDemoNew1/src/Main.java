public class Main {
    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;
        int enBuyuk;

        if (sayi1 > sayi2) {
            if (sayi1 > sayi3) {
                enBuyuk = sayi1;
                System.out.println("En buyuk sayi =" + enBuyuk);
            } else {
                enBuyuk = sayi3;
                System.out.println("En buyuk sayi =" + enBuyuk);
            }
        } else if (sayi2 > sayi3) {
            enBuyuk = sayi2;
            System.out.println("En buyuk sayi =" + enBuyuk);
        } else {
            enBuyuk = sayi3;
            System.out.println("En buyuk sayi =" + enBuyuk);
        }
    }
}