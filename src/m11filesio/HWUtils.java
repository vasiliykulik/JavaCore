package src.m11filesio;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Map;

/**
 * ЗАДАНИЕ 1

 You should create method which replace words in the File and returns String with replaced values
 a) read file, save to string var
 b) replace words
 c) return new string
 String replacer(Map<String, String> map)

 */
public class HWUtils {

    public static String replacer(String file, Map<String, String> map) throws IOException {
        String result = readFromFile(file);

        for (String word: map.keySet()){
            result = result.replaceAll(word, map.get(word));
        }
        return result;
    }

    private static String readFromFile(String file) throws IOException {
        StringBuilder sb = new StringBuilder();
        try(FileReader fileReader = new FileReader(new File (file));
        BufferedReader br = new BufferedReader(fileReader)) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    /*ЗАДАНИЕ 2

    You should create method which replace words in the File and rewrite File content with new values
    a) read file, save to string var
    b) replace words
    c) rewrite file with string
    File fileContentReplacer(Map<String, String> map)*/
    public static void fileContentReplacer(String file, Map<String, String> map) throws IOException {
        String result = replacer(file, map);
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(result);
        bw.close();
        fw.close();
    }
/*ЗАДАНИЕ 3

You should create method which replace words in the File and write result to existing File content
a) read file, save to string var
b) replace words
c) add string to the existing file content
File fileContentMerger(Map<String, String> map)*/
    public static void fileContentMerger(String file, Map<String, String> map) throws IOException {
        FileWriter fileWriter = new FileWriter(file, true); // true дописывает в конец файла
        BufferedWriter bw = new BufferedWriter(fileWriter);
        bw.append(System.lineSeparator());
        bw.append(replacer(file, map));
        bw.close();
        fileWriter.close();
    }
/*ЗАДАНИЕ 4

Check if file contains particular word. Pring 0 if no. Print number n which equals number of times it is contained in the file
a) read file, save to string var
b) calculate how many time the word occurs
c) print result
int checkWord(String word)

Write this task with usual try and try with resources (two versions)*/
    public static int checkWord(String file, String word) throws IOException {
        int result1 = 0;
        String result = readFromFile(file);
        String words[] = result.split(System.lineSeparator());
        for(String word1: words){
            if(word1.equals(word)){
                result1++;
            }
        }
        System.out.println(Arrays.deepToString(words));

        return result1;
    }
/*ЗАДАНИЕ 4

Check if file contains particular word. Pring 0 if no. Print number n which equals number of times it is contained in the file
a) read file, save to string var
b) calculate how many time the word occurs
c) print result
int checkWord(String word)

Write this task with usual try and try with resources (two versions)*/
    /*public static int checkWordResourceTry(String word) {
        int result = 0;
        try {
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Стрела\\IdeaProjects\\JavaCore\\src\\m11filesio\\file.txt"))) {
                String line = br.readLine();
                while (line != null) {
                    if (line.equals(word)) {
                        result++;
                    }
                    line = br.readLine();
                }
            }
        } catch (IOException e) {
            System.out.println("IO error" + e);
        }
        return result;
    }
}*/}
