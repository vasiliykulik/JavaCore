package src.m3oop.homework.task3;

public class Main {
    public static void main(String[] args) {

        Course mentor = new Course(24, "Vasiliy", "Andrey Poleshchyk");
        Course javaCore = new Course(40, "Vasiliy", "Andrey Mudrevskiy");
        Course javaEe = new Course(50, "Vasiliy", "Sergei Nemchinsky");
        Course softSkills = new Course(20, "Vasiliy", "Anna Lavrova");
        Course english = new Course(6, "Vasiliy", "Tony Bler");

        Student vasiliyKulik = new Student("Vasiliy","Kulik",4);
        Student vasiliyKulik1 = new Student("Kulik",new Course[]{javaCore,javaEe} );

        CollegeStudent vasiliyKulik2 = new CollegeStudent("Vasiliy","Kulik",4);
        CollegeStudent vasiliyKulik3 = new CollegeStudent("Kulik",new Course[]{javaCore,javaEe});
        CollegeStudent vasiliyKulik4 = new CollegeStudent("Vasiliy", "Kulik",4, "GoIT", 25, 480123);

        SpecialStudent vasiliyKulik5 = new SpecialStudent("Vasiliy", "Kulik",4, "GoIT", 25, 480123);
        SpecialStudent vasiliyKulik6 = new SpecialStudent("Vasiliy","Kulik",4);
        SpecialStudent vasiliyKulik7 = new SpecialStudent("Vasiliy", "Kulik",4, "GoIT", 25, 480123,112233,"detroit@ua.fm");

    }
}
