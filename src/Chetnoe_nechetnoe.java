import java.util.Scanner;

public class Chetnoe_nechetnoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        int number = sc.nextInt();

        if (number%2 == 0){
            System.out.println("Введенное число четное.");
        } else
        System.out.println("Введенное число нечетное.");

    }
}
