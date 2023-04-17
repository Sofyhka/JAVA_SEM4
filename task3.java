import java.util.Scanner;
// В калькулятор добавьте возможность отменить последнюю операцию.

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;
        double previousResult = 0;

        while (true) {
            if (result == 0) {
                System.out.print("Введите первое число: ");
                result = sc.nextDouble();
            }

            System.out.print("Введите операцию (+, -, *, /, =, c): ");
            char operator = sc.next().charAt(0);

            if (operator == 'c') {
                result = previousResult;
                continue;
            }

            if (operator == '=') {
                System.out.println("Результат: " + result);
                previousResult = result;
                result = 0;
                continue;
            }

            System.out.print("Введите второе число: ");
            double num2 = sc.nextDouble();

            switch (operator) {
                case '+':
                    result += num2;
                    break;
                case '-':
                    result -= num2;
                    break;
                case '*':
                    result *= num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Ошибка: деление на ноль");
                        continue;
                    }
                    result /= num2;
                    break;
                default:
                    System.out.println("Ошибка: некорректная операция");
                    continue;
            }
            System.out.println(result + " " + operator + " " + num2 + " = " + result);
        }
    }
}
