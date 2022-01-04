import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền cho vay:");
        double money = scanner.nextDouble();
        System.out.println("Nhập tỉ lệ lãi suất:");
        double interestRate = scanner.nextDouble();
        System.out.println("Nhập tháng:");
        int month = scanner.nextInt();
        double amount = 0;
        for (int i = 0; i < month; i++){
            amount += money * (interestRate/100)/12 * month;
        }
        System.out.println("Số tiền lãi:" + " " + amount);
    }
}
