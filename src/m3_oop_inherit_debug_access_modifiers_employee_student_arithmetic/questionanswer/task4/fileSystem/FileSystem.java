package src.m3_oop_inherit_debug_access_modifiers_employee_student_arithmetic.questionanswer.task4.fileSystem;

/**
 * Created by Raketa on 30.08.2016.
 */
public class FileSystem {
    private byte systemCode;
    private long capacityInBytes;
    private String name;
    private int foldersCount;
    private int filesCount;

    // обычный простой конструктор и два сеттера
    public FileSystem(byte systemCode, long capacityInBytes, String name) {//модифицируем
        this.systemCode = systemCode;
        this.capacityInBytes = capacityInBytes;
        this.name = name;
        this.foldersCount=0;// this объект на себя только изнутри - поле именно моего класса иницилиазируй
        this.filesCount=0;
        //this.foldersCount=0;
        //this.filesCount = 0;
    }

    public void setFoldersCount(int foldersCount) {
        this.foldersCount = foldersCount;
    }

    public void setFilesCount(int filesCount) {
        this.filesCount = filesCount;
    }
}


