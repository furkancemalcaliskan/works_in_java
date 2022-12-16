public class Main {
    public static void main(String[] args) {
        for(byte i = 0; i < 10; i++) {
            for(byte j = 0; j < i; j++) {
                System.out.print("*"); }
            System.out.println(); }
    }
}