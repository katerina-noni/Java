import java.util.Scanner;

/*
Чтение чисел
*/

public class NumberSolution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число 0:");
        int number0 = console.nextInt();
        System.out.println("Введите число 1:");
        int number1 = console.nextInt();
        System.out.println("Введите число 2:");
        int number2 = console.nextInt();

        System.out.println((number0 + number1 + number2)/3);

    }
}
