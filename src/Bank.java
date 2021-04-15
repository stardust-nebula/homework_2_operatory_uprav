import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        float vklad = sc.nextFloat();

        System.out.print("Введите кол-во месяцев: ");
        int kolichestvoMesycev = sc.nextInt();

        for (int i = 0; i < kolichestvoMesycev; i++){
            vklad = (float) (vklad + (vklad * 0.07));
        }
        System.out.print("Конечная сумма вклада: "+ vklad);
    }
}
