//класс содержащий, метод получения слова рубль в правильном падеже и метод для округления.
public class Formatter {
    public static String Formatter(double a) {
        String outputA = String.format("%.2f", a);
        int naturalOutputA = (int)a;
        int lastDigit = naturalOutputA % 10;
        if (naturalOutputA == 1) {
            outputA += " рубль";
        }
        else if (naturalOutputA == 11) {
            outputA += " рублей";
        }
        else if (naturalOutputA == 0) {
            outputA += " рублей";
        }
        else if (naturalOutputA == 12) {
            outputA += " рублей";
        }
        else if (naturalOutputA < 5) {
            outputA += " рубля";
        }
        else if (lastDigit ==  1) {
            outputA += " рубль";
        }
        else if (lastDigit == 0) {
            outputA += " рублей";
        }
        else if (lastDigit < 5) {
                outputA += " рубля";
        }
        else {
            outputA += " рублей";
        }
        return outputA;
    }
}