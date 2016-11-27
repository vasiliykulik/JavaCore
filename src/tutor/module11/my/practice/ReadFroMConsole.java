package src.tutor.module11.my.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Стрела on 31.10.2016.
 */
public class ReadFroMConsole {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        List<Double> doubles = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        String line = "";
        boolean parsed;

        while(!(line = reader.readLine()).equals("q")) { // reader всегда возвращает String
            try {
                //double res = Double.valueOf(line);
                //doubles.add(res);

                doubles.add(Double.valueOf(line));
            } catch (NumberFormatException e) {
                try {
                    integers.add(Integer.valueOf(line));
                } catch (NumberFormatException e1) {
                    strings.add(line);
                }
            }
        }
        // закрываем reader b выводим списки (или закрываем в конце - без разнице)
        reader.close();

        if (!integers.isEmpty()){
            System.out.println(integers);
        }
        if (!doubles.isEmpty()){
            System.out.println(doubles);
        }
        if (!strings.isEmpty()){
            System.out.println(strings);
        }

    }

}
