import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите бинарное число: ");
        String bin = in.nextLine();
        int a = Integer.parseInt(bin, 2);
        System.out.printf("Десятичный формат вашего числа: %d \n", a);
    }
}