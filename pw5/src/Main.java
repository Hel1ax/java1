import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для определения факториала: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Введены неправильные параметры.");
            System.exit(-1);
        }
        int number = scanner.nextInt();
        long factorial = calculateFactorial(number);

        System.out.println("Факториал числа " + number + " равен " + factorial);
    }


    public static long calculateFactorial(int n) {
        if (n < 1) {
            System.out.println("Введены неправильные параметры.");
            System.exit(-1);
        }
        if (n == 1) {
            return 1;
        }

        return n * calculateFactorial(n - 1);
    }
}