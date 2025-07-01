import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку 0:");
        String str0 = console.nextLine();
        System.out.println("Введите строку 1:");
        String str1 = console.nextLine();
        System.out.println("Введите строку 2:");
        String str2 = console.nextLine();

        System.out.println(str2);
        System.out.println(str1.toUpperCase());
        System.out.println(str0.toLowerCase());
    }
}
