
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("На скольких человек необходимо разделить счёт?");
            String humans = scanner.nextLine();
            String regex = "^\\d+$";
            if (humans.equals("1")) {
                System.out.println("Нет смысла ничего считать и делить на одного человека");
            }
            else if (humans.equals("0")) {
                System.out.println("На ноль делить нельзя.");
            }
            else if (humans.matches(regex)) {
                int humansCounter = Integer.parseInt(humans);
                Calculator.calculate();
                double devidedAmount = (Calculator.amountItemsPrice/humansCounter);
                System.out.println("Добавленные товары:\n" + Calculator.allItems);
                System.out.println("Сумма на каждого " + Formatter.Formatter(devidedAmount) + "." );
                break;
            }
            else {
                System.out.println("Введено некорректное значение. Введите значение арабскими цифрами без пробелов.");
            }
        }
    }
}

