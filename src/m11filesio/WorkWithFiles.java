package src.m11filesio;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Стрела on 31.10.2016.
 */
public class WorkWithFiles {
    public static void main(String[] args) {
        String fileAdress = "C:\\Users\\Стрела\\IdeaProjects\\JavaCore\\src\\m11filesio\\file.txt";
        Map<String, String> map = new HashMap<>();
        // CTRL + / !!!!! !!!!!!!
        map.put("Hello", "Bye");
//          map.put("Bye", "Hello");
       map.put("salary", "monetary penalty");
//           map.put("monetary penalty", "salary");

        try {
            System.out.println(HWUtils.replacer(fileAdress,map));
        } catch (IOException e) {
            e.printStackTrace();
        }


        /*try {
            HWUtils.fileContentReplacer(fileAdress,map);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*try {
            HWUtils.fileContentMerger(fileAdress, map);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*try {
            System.out.println(HWUtils.checkWord(fileAdress,"increased"));
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*System.out.println(HWUtils.checkWordResourceTry("increased"));
        System.out.println();*/


/*content of file.txt
Hello
we
increased
your
salary*/
    }
}

