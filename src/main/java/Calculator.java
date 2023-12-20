import java.util.Scanner;

//отдельный класс, содержащий логику добавления и подсчёта товаров.
public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    static String allItems = "";
    static double amountItemsPrice = 0;
    static double itemPrice = 0;
    static String itemPriceString = "";

    static void calculate() {
        while (true) {
            String regex = "(\\d+)?\\.(\\d+)?";
            System.out.println("Введите название совместно купленного товара: ");
            String itemName = scanner.next();
            allItems += itemName + "\n";
            while (true) {
                System.out.println("Введите цену товара <" + itemName + "> в формате <рубли.копейки>:");
                itemPriceString = scanner.next();
                if (itemPriceString.matches(regex)) {
                    itemPrice = Double.parseDouble(itemPriceString);
                    amountItemsPrice += itemPrice;
                    break;
                } else {
                    System.out.println("Некорректно введена цена товара <" + itemName + "> Попробуйте ещё раз.");
                    itemPrice = 0;
                }
            }
            System.out.println("Товар <" + itemName + "> по цене " + Formatter.Formatter(itemPrice) + " добавлен. Общая стоимость всех товаров " + Formatter.Formatter(amountItemsPrice) + ".\nДобавить ещё товар? <любой символ или слово> - добавить ещё товар или <завершить> для окончания ввода: ");
            String userAnswer = scanner.next();
            if (userAnswer.equalsIgnoreCase("завершить")) {
                System.out.println("Ввод товаров завершен. Вы добавили товары на сумму " + Formatter.Formatter(amountItemsPrice));
                break;
            }
        }
    }
}