package src.m11filesio;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.io.*;
import java.nio.Buffer;
import java.util.Map;

/**
 * Created by Стрела on 05.11.2016.
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


    /*public static String base(Map<String, String> map) {
        String result = null;
        StringBuilder sb = new StringBuilder();
        try {
            FileReader filereader = new FileReader("C:\\Users\\Стрела\\IdeaProjects\\JavaCore\\src\\m11filesio\\file.txt");// read file
            BufferedReader br = new BufferedReader(filereader);
            try {
                String line = br.readLine();
                while (line != null) {
                    if (map.containsKey(line)) {
                        line = map.get(line);
                    }
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                filereader.close();
                br.close();
            } catch (IOException e) {
                System.err.println("work (reading) with file error " + e);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found when reading");
        }
        try {
            result = sb.toString();
            FileWriter fileWriter = new FileWriter("C:\\Users\\Стрела\\IdeaProjects\\JavaCore\\src\\m11filesio\\file.txt");
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write(result);
            bw.close();
        } catch (IOException e) {
            System.out.println("file not found when writing" + e);
        }
        return result;
    }*/
}
