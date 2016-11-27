package src.m4polymorphism.webinar4.Figure2;

/**
 * Created by Стрела on 02.09.2016.
 */
public class Circle extends Figure {
    @Override // Переписывание метода - это не Перегрузка
    /*
    в Java есть возможность в классе Б который наследуется от класса А
    написать метод из класса А - и переписать его
    @Override - ничего не делает - просто помечаем что переписываем
     код  парента.
     Появляется метка - которая позволяет перейти к изначальному методу
     в паренте
     Пере
     */
    void drawFigure(){
        System.out.println("Drawing Circle");
    }
}
