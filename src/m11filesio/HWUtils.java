package src.m11filesio;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.io.*;
import java.nio.Buffer;
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
    public static String replacer(Map<String, String> map) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\Стрела\\IdeaProjects\\JavaCore\\src\\m11filesio\\file.txt");
        BufferedReader br = new BufferedReader(fileReader);
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null) {
            if (map.containsKey(line)) {
                line = map.get(line);
            }
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
        }
        fileReader.close();
        br.close();
        return sb.toString();
    }
/*ЗАДАНИЕ 2

You should create method which replace words in the File and rewrite File content with new values
a) read file, save to string var
b) replace words
c) rewrite file with string
File fileContentReplacer(Map<String, String> map)*/
    public static File fileContentReplacer(Map<String, String> map) throws IOException {
        File file = new File("C:\\Users\\Стрела\\IdeaProjects\\JavaCore\\src\\m11filesio\\file.txt");
        String result = replacer(map);
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(result);
        bw.close();
        fw.close();
        return file;
    }
/*ЗАДАНИЕ 3

You should create method which replace words in the File and write result to existing File content
a) read file, save to string var
b) replace words
c) add string to the existing file content
File fileContentMerger(Map<String, String> map)*/
    public static File fileContentMerger(Map<String, String> map) throws IOException {
        File file = new File("C:\\Users\\Стрела\\IdeaProjects\\JavaCore\\src\\m11filesio\\file.txt");
        FileWriter fileWriter = new FileWriter(file, true); // true дописывает в конец файла
        BufferedWriter bw = new BufferedWriter(fileWriter);
        bw.append(System.lineSeparator());
        bw.append(replacer(map));
        bw.close();
        fileWriter.close();
        return file;
    }
/*ЗАДАНИЕ 4

Check if file contains particular word. Pring 0 if no. Print number n which equals number of times it is contained in the file
a) read file, save to string var
b) calculate how many time the word occurs
c) print result
int checkWord(String word)

Write this task with usual try and try with resources (two versions)*/
    public static int checkWord(String word) throws IOException {
        int result = 0;
        FileReader fileReader = new FileReader("C:\\Users\\Стрела\\IdeaProjects\\JavaCore\\src\\m11filesio\\file.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String line = br.readLine();
        while (line != null) {
            if (line.equals(word)) {
                result++;
            }
            line = br.readLine();
        }
        return result;
    }
/*ЗАДАНИЕ 4

Check if file contains particular word. Pring 0 if no. Print number n which equals number of times it is contained in the file
a) read file, save to string var
b) calculate how many time the word occurs
c) print result
int checkWord(String word)

Write this task with usual try and try with resources (two versions)*/
    public static int checkWordResourceTry(String word) {
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
}
