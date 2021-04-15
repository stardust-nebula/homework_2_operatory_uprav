public class DesyatPervyhChisel {
    public static void main(String[] args) {
         int number = 0;


        for (int i = 0; i < 10; i++){
            System.out.println(number);
            number = number - 5;
        }

// Попробовала вариант с do-while
/*

        int counter = 0;
        do {
            System.out.println(number);
            number = number - 5;
            counter = counter + 1;
        } while (counter < 10);

*/

    }
}
