import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Methods {
    //проверяет есть ли совпадение с римскими цифрами
    public static boolean sovRimskoe (String s){
        boolean q = false;
        for (Map.Entry<String, Integer> pair : Figures.dopusk().entrySet()) {
            String key = pair.getKey();                      //ключ
            if (s.equals(key)){
                q = true;
                break;
            }
        }
        return q;
    }
    //переводит римские цифры в арабские
    public static Integer rimVArabskoe(String s){
        Integer q = null;
        for (Map.Entry<String, Integer> pair : Figures.dopusk().entrySet()) {
            String key = pair.getKey();                      //ключ
            Integer value = pair.getValue();                  //значение
            if (s.equals(key)){
                q = value;
                break;
            }
        }
        return q;
    }
    //переводит римские цифры в арабские после конечного результата
    public static String rimVArabskoe2(String s){
        String q = "";
        for (Map.Entry<String, String> pair : Figures.rimskieSlovar().entrySet()) {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            if (s.equals(key)){
                q = value;
                break;
            }
        }
        return q;
    }
    //метод для определения является ли строка числом  в диапозоне от 1 до 10
    public static boolean proverkaArabskoe(String s) throws NumberFormatException {
        try {
            int i = Integer.parseInt(s);
            return i > 0 && i < 11;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    //метод возвращает результат в виде арабских цифр
    public static void rezultatArabskie(Integer numberOne, Integer numberTwo, String znak){
        switch (znak) {
            case ("+") -> System.out.println(numberOne + numberTwo);
            case ("-") -> System.out.println(numberOne - numberTwo);
            case ("*") -> System.out.println(numberOne * numberTwo);
            case ("/") -> System.out.println(numberOne / numberTwo);
        }
    }
    //метод возвращает результат в виде римских цифр
    public static String rezultatRimskie(Integer numberOne, Integer numberTwo, String znak){
        String s = "";
        switch (znak) {
            case ("+") -> s = String.valueOf(numberOne + numberTwo);
            case ("-") -> s = String.valueOf(numberOne - numberTwo);
            case ("*") -> s = String.valueOf(numberOne * numberTwo);
            case ("/") -> s = String.valueOf(numberOne / numberTwo);
        }
        //проверяем является ли число отрицательным
        //для этого помещаем число в массив
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        if (list.remove("-")){
            String s1 = String.join("", list);
            s = "-" + rimVArabskoe2(s1);
        }else if (s.equals("0")){
            s = "Получился 0, но его нет среди римских цифр";
        } else s = rimVArabskoe2(s);
        return s;
    }
}
