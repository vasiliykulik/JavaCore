package src.m4polymorphism.selfedu4.enumjavahowto;

/**
 * Created by Стрела on 04.09.2016.
 * Enum with additional fields and custom constructor.
 * Enum constructors must be either private or package default,
 * and protected or public access modifier is not allowed.
 * When custom constructor is declared, all elements declaration
 * must match that constructor.
 */
public enum Color2 {
    WHITE(21), BLACK(22), RED(23), YELLOW(24), BLUE(25);

    private int code;

    private Color2(int c) {
        code = c;
    }

    public int getCode() {
        return code;
    }
}