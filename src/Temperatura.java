import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите целочисленную температуру: ");
        int t = sc.nextInt();

        if (t > -5){
            System.out.println("Тепло");
        }else if (t > -20 && t <= -5){
            System.out.println("Нормально");
        } else System.out.println("Холодно");

    }
}
