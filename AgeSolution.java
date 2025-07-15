import java.util.Scanner;

public class AgeSolution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        Scanner console = new Scanner(System.in);
        System.out.println("Введите свое имя:");
        String name = console.nextLine();
        System.out.println("Введите свой возраст:");
        int age = console.nextInt();
        if (age >= 18 && age <= 28)
        {
            System.out.println(name + militaryCommissar);
        }
    }
}
