import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет,я считаю сумму введённых тобой чисел до а10, введи число");
        int number;
        int counter = 0;
        try {
            number = scanner.nextInt();
        while (counter <= 10) {
            number += number + counter;
            counter++;}
        System.out.println("Сумма чисел равна"+ number);
        }catch (Exception ex){
            System.out.println("Ты ввёл что то не так");
        }
    }
}