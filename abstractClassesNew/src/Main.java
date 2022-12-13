public class Main {
    public static void main(String[] args) {
        WomenGameCalculator womanGameCalculator = new WomenGameCalculator();
        womanGameCalculator.calculate();
        womanGameCalculator.gameOver();

        GameCalculator gameCalculator = new WomenGameCalculator();
        gameCalculator.calculate();
    }
}