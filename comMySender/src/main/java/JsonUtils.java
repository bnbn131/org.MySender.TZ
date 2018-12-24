
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import java.io.*;

public class JsonUtils {


    public static String parseUrl(URL url) {
        if (url == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()))) {

            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                stringBuilder.append(inputLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }



    public static void parsePersonsJson(String resultJson) {
        try {

            JSONObject personsJsonObject = (JSONObject) JSONValue.parseWithException(resultJson);
            JSONArray personsArray = (JSONArray) personsJsonObject.get("persons");
            JSONObject personsData0 = (JSONObject) personsArray.get(0);
            FileWriter writer = new FileWriter("text.txt");
            String lineSeparator = System.getProperty("line.separator");
            writer.write(" " + personsData0.get("city"));
            writer.write(" " + personsData0.get("name"));
            writer.write(" " + personsData0.get("age")+lineSeparator);

            System.out.print(" " + personsData0.get("city"));
            System.out.print(" " + personsData0.get("name"));
            System.out.print(" " + personsData0.get("age"));
            System.out.println();

            JSONObject personsData1 = (JSONObject) personsArray.get(1);

            writer.write(" " + personsData1.get("city"));
            writer.write(" " + personsData1.get("name"));
            writer.write(" " + personsData1.get("age")+lineSeparator);


            System.out.print(" " + personsData1.get("city"));
            System.out.print(" " + personsData1.get("name"));
            System.out.print(" " + personsData1.get("age"));
            System.out.println();
            JSONObject personsData2 = (JSONObject) personsArray.get(2);

            writer.write(" " + personsData2.get("city"));
            writer.write(" " + personsData2.get("name"));
            writer.write(" " + personsData2.get("age")+lineSeparator);


            System.out.print(" " + personsData2.get("city"));
            System.out.print(" " + personsData2.get("name"));
            System.out.print(" " + personsData2.get("age"));
            System.out.println();
            JSONObject personsData3 = (JSONObject) personsArray.get(3);

            writer.write(" " + personsData3.get("city"));
            writer.write(" " + personsData3.get("name"));
            writer.write(" " + personsData3.get("age")+lineSeparator);


            System.out.print(" " + personsData3.get("city"));
            System.out.print(" " + personsData3.get("name"));
            System.out.print(" " + personsData3.get("age"));
            System.out.println();
            JSONObject personsData4 = (JSONObject) personsArray.get(4);

            writer.write(" " + personsData4.get("city"));
            writer.write(" " + personsData4.get("name"));
            writer.write(" " + personsData4.get("age")+lineSeparator);


            System.out.print(" " + personsData4.get("city"));
            System.out.print(" " + personsData4.get("name"));
            System.out.print(" " + personsData4.get("age"));


            writer.close();

        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    // создаем объект URL из указанной в параметре строки
    public static URL createUrl(String link) {
        try {
            return new URL(link);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
