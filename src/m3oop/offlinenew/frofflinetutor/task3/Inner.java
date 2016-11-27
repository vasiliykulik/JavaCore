package src.m3oop.offlinenew.frofflinetutor.task3;

/**
 * Created by zetokz on 31.08.16.
 */
class Inner {


    public static void main(String[] args) {

        Employee employee1 = new Employee("Vasya", "Pupkin", true, 30, "Kyiv", 5250);
        Employee employee2 = new Employee("Vasya", "Pupkin", true, 30, "Kyiv", 5250);
        Employee employee3 = new Employee("Vasya", "Pupkin", true, 30, "Kyiv", 5250);
        Employee employee4 = new Employee("Vasya", "Pupkin", true, 30, "Kyiv", 5250);
        Employee employee5 = new Employee("Vasya", "Pupkin", true, 30, "Kyiv", 5250);
        Employee employee6 = new Employee("Vasya", "Pupkin", true, 30, "Kyiv", 5250);
        Employee employee7 = new Employee("Vasya", "Pupkin", true, 30, "Kyiv", 5250);
        Employee employee8 = new Employee("Vasya", "Pupkin", true, 30, "Kyiv", 5250);
        Employee employee9 = new Employee("Vasya", "Pupkin", true, 30, "Kyiv", 5250);

        Employee[] employees = new Employee[10];
        employees[0] = employee1;
        employees[1] = employee1;
        employees[2] = employee1;
        employees[3] = employee1;
        employees[4] = employee1;
        employees[5] = employee1;
        employees[6] = employee1;
        employees[7] = employee1;
        employees[8] = employee1;
        employees[9] = employee1;

        int salaries = 0;
        for (Employee employee : employees) {
            salaries += employee.getSalary();
        }

        System.out.println(salaries);

        int salariesFromList = 0;

        Employee[] employeesList = new Employee[10];
        for (int i = 0; i < 10; i++) {
            employeesList[i] = new Employee("Vasya" + i, "Pupkin" + i, true, 30, "Kyiv", 5250 + (i * 100));
        }

        for (int i = 0; i < employeesList.length; i++) {
            salariesFromList += employeesList[i].getSalary();
        }
        System.out.println(salariesFromList);
    }

}
