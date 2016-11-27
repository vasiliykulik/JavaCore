package src.m11filesio;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Стрела on 31.10.2016.
 */
public class WorkWithFiles {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Hello", "Bye");
        map.put("salary", "monetary penalty");
        /*try {
            System.out.println(HWController.replacer(map));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*try {
            System.out.println(HWController.fileContentReplacer(map));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*try {
            System.out.println(HWController.fileContentMerger(map));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*try {
            System.out.println(HWController.checkWord("increased"));
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        System.out.println(HWUtils.checkWordResourceTry("increased"));


/*content of file.txt
Hello
we
increased
your
salary*/
    }
}

