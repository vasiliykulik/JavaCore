package src.m3_oop_inherit_debug_access_modifiers_employee_student_arithmetic.questionanswer.task4.q6.fileSystem;

/**
 * Created by Raketa on 30.08.2016.
 */
public class Main {
    public static void main(String[] args) { //вариантов реализации много - главное понимать как все эти блоки строятся
   // byte     systemCode =64;
    FileSystem fileSystem = new FileSystem((byte) 64,Long.MAX_VALUE,"FilesystemSimple"); // нет автобоксинга ()64, сделали явное приведение

    //Folder folder = new Folder(fileSystem, "C:/Users/test/folderName");

    //File file = new File(256,folder);

        //example
        byte c=100; // тоесть кушает - а в конструкторе не умеет, можно привести к типу - тк компилятор не хавает. восходящее и нисходящее приведение - можно и так назвать

        int a = 1000;
        long b = a;




                //прикольная фишка с конструкторами
        //Парент - и любой child
       // File file1 = new TextFile();
       // File file2 = new


    }
}
