import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("Пожалуйста, введи 10 чисел и я найду их сумму");
            int sum = 0;
            int num;
            int count = 0;
            while (count <= 9) {
                num = scanner.nextInt();
                sum += num;
                count++;
            }
        System.out.println("Сумма чисел:" + sum);
    }catch (Exception ex) {
        System.out.println("Ты ввёл что-то не так");}
    }
}