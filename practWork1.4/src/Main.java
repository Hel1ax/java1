public class Main {
    public static void main(String[] args) {
        int countNum = 10;

        System.out.println("Первые десять чисел гармонического ряда:");

        for (int i = 1; i <= countNum; i++) {
            double harmonicNumber = 1.0 / i;
            System.out.printf("Число %d: %.3f%countNum", i, harmonicNumber);
        }
    }
}