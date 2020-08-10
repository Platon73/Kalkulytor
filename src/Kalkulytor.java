import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kalkulytor {

    public static void main(String[] args) {
        System.out.print("Введите значение: ");
        String strVvoda = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            strVvoda = reader.readLine(); //получение строки ввода
        } catch (IOException e) {
            System.out.println(e);
        }
        if (strVvoda.isEmpty()){ //если строка пустая
            System.out.println("Вы ввели пустую строку");
        }
        String[] array = strVvoda.split(""); //разделение строки на значения
        String znak = ""; //переменная для знака
        String[] znaki = {"+", "-", "/", "*"};
        for (String s : array) { //проверка присутствуют ли в выражении знаки
            for (String q : znaki) {
                if (s.equals(q)) {
                    znak = q;
                }
            }
        }
        if (znak.equals("")){
            System.out.println("Вы не ввели ниодин из знаков: +, -, /, *");
        }
        array = null; //очистка списка
        array = strVvoda.split("[+\\-*/]"); //разделение строки по знаку
        //работа с числами
        try {
            String pervoe = array[0]; //первая цифра
            String vtoroe = array[1]; //вторая цифра
            //проверяет являются ли оба числа арабскими и значения от 1 до 10
            if(Methods.proverkaArabskoe(pervoe) && Methods.proverkaArabskoe(vtoroe)){
                Methods.rezultatArabskie(Integer.parseInt(pervoe), Integer.parseInt(vtoroe), znak);
            //если числа не арабские то проверяет на совпадения оба числа с римскими
            //и значения от 1 до 10
            } else if (Methods.sovRimskoe(pervoe) && Methods.sovRimskoe(vtoroe)){

                System.out.println(Methods.rezultatRimskie(Methods.rimVArabskoe(pervoe),
                        Methods.rimVArabskoe(vtoroe), znak));
            } else System.out.println("Вы ввели что то не так из цифр");
        }
        catch (ArrayIndexOutOfBoundsException ae){
            //System.out.println(ae);
            System.out.println("Возникла ошибка. Будьте внимателны и попробуйте еще раз");
        }
    }
}