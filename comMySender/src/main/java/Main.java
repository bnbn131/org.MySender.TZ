
import java.net.URL;

public class Main {

    public static final String WEATHER_URL = "http://main3.mysender.ru/persons.json";

    public static void main(String[] args) {
        // создаем URL из строки
        URL url = JsonUtils.createUrl(WEATHER_URL);

        // загружаем Json в виде Java строки
        String resultJson = JsonUtils.parseUrl(url);
       // System.out.println("Полученный JSON:\n" + resultJson);

        // парсим полученный JSON и печатаем его на экран
        JsonUtils.parsePersonsJson(resultJson);


    }
}
