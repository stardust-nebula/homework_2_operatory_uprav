import java.util.Scanner;

public class TMS_switch {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца от 1 до 12 и нажмите Enter.");

        int month_number = sc.nextInt();

        switch (month_number){
            case 1:
                System.out.println("Зима");
                break;

            case 2:
                System.out.println("Зима");
                break;

            case 3:
                System.out.println("Весна");
                break;

            case 4:
                System.out.println("Весна");
                break;

            case 5:
                System.out.println("Весна");
                break;

            case 6:
                System.out.println("Лето");
                break;

            case 7:
                System.out.println("Лето");
                break;

            case 8:
                System.out.println("Лето");
                break;

            case 9:
                System.out.println("Осень");
                break;

            case 10:
                System.out.println("Осень");
                break;

            case 11:
                System.out.println("Осень");
                break;

            case 12:
                System.out.println("Зима");
                break;

            default:
                System.out.println("Неправильно введен номер месяца.");

        }
    }
}
