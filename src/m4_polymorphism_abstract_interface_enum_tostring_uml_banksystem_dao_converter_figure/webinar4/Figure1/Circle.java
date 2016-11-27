package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.webinar4.Figure1;

/**
 * Created by Стрела on 02.09.2016.
 */
public class Circle extends Figure {
    @Override // Переписывание метода (используется при наследовании)
        // - это не Перегрузка
    /*
    в Java есть возможность в классе Б который наследуется от класса А
    написать метод из класса А - и переписать его
    @Override - ничего не делает - просто помечаем что переписываем
     код  парента.
     Появляется метка - которая позволяет перейти к изначальному методу
     в паренте
     Перегрузка - используется в рамках одного класса
     */
    void drawFigure(){
        System.out.println("Drawing Circle");
    }
}
