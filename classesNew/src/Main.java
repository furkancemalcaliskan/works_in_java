public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        int[] sayilar = new int[]{1,2,3};
        int[] sayilar1 = new int[]{4,5,6};
        sayilar1 = sayilar;
        sayilar[0] = 10;
        System.out.println(sayilar1[0]);
    }
}