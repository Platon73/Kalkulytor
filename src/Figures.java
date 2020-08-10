import java.util.HashMap;
import java.util.Map;
//словарь где содеражаться списки и словарь арбских и римских цифр
public class Figures {
    //массив с арабскими цифрами
    public static String[] arab(){
        return new String[]{"1","2","3","4","5","6","7","8","9","10",
                "11","12","13","14","15","16","17","18","19","20",
                "21","22","23","24","25","26","27","28","29","30",
                "31","32","33","34","35","36","37","38","39","40",
                "41","42","43","44","45","46","47","48","49","50",
                "51","52","53","54","55","56","57","58","59","60",
                "61","62","63","64","65","66","67","68","69","70",
                "71","72","73","74","75","76","77","78","79","80",
                "81","82","83","84","85","86","87","88","89","90",
                "91","92","93","94","95","96","97","98","99","100",};
    }
    //массив с римскими цифрами
    public static String[] rome(){
        return new String[]{"I","II","III","IV","V","VI",
                "VII","VIII","IX","X","XI","XII","XIII","XIV","XV",
                "XVI","XVII","XVIII","XIX","XX","XXI","XXII","XXIII",
                "XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX",
                "XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII",
                "XXXVIII","XXXIX","XL","XLI","XLII","XLIII","XLIV",
                "XLV","XLVI","XLVII","XLVIII","XLIX","L","LI","LII",
                "LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX","LXI",
                "LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII",
                "LXIX","LXX","LXXI","LXXII","LXXIII","LXXIV","LXXV",
                "LXXVI","LXXVII","LXXVIII","LXXIX","LXXX","LXXXI","LXXXII",
                "LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII",
                "LXXXIX","XC","XCI","XCII","XCIII","XCIV","XCV","XCVI",
                "XCVII","XCVIII","XCIX","C",};
    }
    //словарь арабские : римские цифры (в виде строк)
    public static Map<String, String> rimskieSlovar() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < arab().length; i++){
            map.put(arab()[i], rome()[i]);
        }
        return map;
    }
    //словарь с арабскими и римскими цифрами
    public static Map<String, Integer> dopusk() {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("II", 2);
        map.put("III", 3);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("VI", 6);
        map.put("VII", 7);
        map.put("VIII", 8);
        map.put("IX", 9);
        map.put("X", 10);
        return map;
    }
}
