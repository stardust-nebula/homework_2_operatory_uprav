import java.util.Scanner;

public class TMS_if_else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца от 1 до 12 и нажмите Enter.");

        int month_number = sc.nextInt();

        if (month_number == 12 || month_number == 1 || month_number == 2){
            System.out.println("Это зима.");
        }else if (month_number > 2 && month_number < 6){
            System.out.println("Это весна.");
        }else if (month_number > 5 && month_number < 9){
            System.out.println("Это лето");
        }else if (month_number > 8 && month_number < 12){
            System.out.println("Это осень.");
        }else
            System.out.println("Неправильно введен номер месяца.");
    }
}
