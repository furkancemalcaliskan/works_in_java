public class Main {
    public static void main(String[] args) {

        String ogrenci1 = "Furkan";
        String ogrenci2 = "Cemal";
        String ogrenci3 = "Caliskan";
        String ogrenci4 = "Furkan Cemal";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("--------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = ogrenci1;
        ogrenciler[1] = ogrenci2;
        ogrenciler[2] = ogrenci3;
        ogrenciler[3] = ogrenci4;

        /*for (int i = 0; i < ogrenciler.length; i++ ){
            System.out.println(ogrenciler[i]);
        }*/

        for(String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}