public class Main {
    public static void main(String[] args) {

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mukemmel");
                break;
            case 'B':
                System.out.println("Cok Iyi");
                break;
            case 'C':
                System.out.println("Iyi");
                break;
            case 'D':
                System.out.println("Orta");
                break;
            case 'F':
                System.out.println("Kaldiniz");
                break;
            default:
                System.out.println("Hatali Ifade");
        }
    }
}