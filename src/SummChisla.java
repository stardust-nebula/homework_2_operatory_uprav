import java.util.Scanner;

public class SummChisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите любое положительное целое число: ");
        int chislo = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= chislo; i++){
            sum = sum + i;
        }
        System.out.println("Результат: " + sum);
    }
}
