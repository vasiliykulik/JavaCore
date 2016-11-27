package src.tutor.module11.my.practice;/*
package src.tutor.module11.practice;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

*/
/**
 * Created by Стрела on 31.10.2016.
 *//*

public class GooglePage {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://google.com");
        BufferedReader reader = new BufferedReader (new InputStreamReader(url.openStream()));

        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine())!=null){
            stringBuilder.append(line + System.lineSeparator()); // в  StringBuilder вы можете передать объект - и он будет приведен к String
        }
        reader.close();
        String result = stringBuilder.toString()
                .replaceAll("google","yandex")
                .replaceAll("Google","Yandex");

        try{Writer writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("/Users/file.txt"), StandardCharsets.UTF_8)){
            writer.write(result);
        }

        }catch()

    }
}
*/
