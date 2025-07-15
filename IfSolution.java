import java.util.Scanner;

public class IfSolution {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        Scanner console = new Scanner(System.in);
        System.out.println("Введите температуру:");
        int temperature = console.nextInt();
        if (temperature < 0)
            System.out.println(cold);
        else
            System.out.println(warm);
    }
}
