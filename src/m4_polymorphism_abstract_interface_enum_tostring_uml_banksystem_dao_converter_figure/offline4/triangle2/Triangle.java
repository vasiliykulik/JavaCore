package src.m4_polymorphism_abstract_interface_enum_tostring_uml_banksystem_dao_converter_figure.offline4.triangle2;

/**
 * Created by Стрела on 05.09.2016.
 * Grramarly - 2 млн клиентов - переводы
 * Если вы работает в Google - там тоже нужны алгоритмы - что бы ускорить со 100 мсек до 10 мсек
 * Java - открывает вам двери - и дальше вы можете учиться
 */
public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    private double slideAB;
    private double slideBC;
    private double slideCA;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        if (!isTriangle()){
            System.out.println("Is not a triangle");
        }
/*
вот здесь была ошибка
 */
        this.slideAB = getLength(pointA,pointB);
        this.slideBC = getLength(pointB,pointC);
        this.slideCA = getLength(pointC,pointA);
    }
    /*
    Шукаэмо периметр
     */
    private double calculatePerimiter(){
        return slideAB+slideBC+slideCA;
    }

    /*
    робимо print
     */
   public void print(){
       System.out.println("Perimitr:" + calculatePerimiter()+" "+"Area:"+calculateArea());
   }

    private double calculateArea() {
        double halfPerimetr = calculatePerimiter()/2;
        return Math.sqrt((halfPerimetr-slideAB)*(halfPerimetr-slideBC)*(halfPerimetr-slideCA));
    }

    /*
    рахуэмо  - коринь выдняти вид корня и пиднести в квадрат
    pow - степинь
    и терпер треба зробити
    */
    private double getLength(Point pointA, Point pointB) {
        return Math.sqrt(Math.pow(pointA.getX() - pointB.getX(),2)+Math.pow(pointA.getY()+pointB.getY(),2));
    }
    /*
и терпер треба зробити перевирки - чи це э трикутник
берем формулу з инета
до
 */
    private boolean isTriangle(){
        int diff1 = pointA.getX()-pointB.getX();
        int diff2 = pointC.getY()-pointB.getY();
        int diff3 = pointA.getY()-pointB.getY();
        int diff4 = pointA.getX()-pointB.getX();
        return diff1*diff2!=diff3*diff4;
    }
/*
делаем оверрайд - что бы вывод был весь
 */
    @Override
    public String toString() {
        return "Triangle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                ", slideAB=" + slideAB +
                ", slideBC=" + slideBC +
                ", slideCA=" + slideCA +
                '}';
    }
}
