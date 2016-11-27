package src.m4polymorphism.webinar4.Figure2;

/**
 * Created by Стрела on 02.09.2016.
 */
public class Main {


    static void draw(Figure figure){
        /*
        //Хороший полиморф код (если бы не  писали бы if )
        // Проблема в том если добавятся фигуры - прийдется переписывать код
C полиморфизмом все красиво

 */
        figure.drawFigure(); // код не меняется - полиморфизм - объект может принимать несколько. 2.
    }

    public static void main(String[] args) {

        Figure circle = new Circle();

        Figure square = new Squre();
        Figure triangle = new Triangle();

        draw(triangle);
    }
}
