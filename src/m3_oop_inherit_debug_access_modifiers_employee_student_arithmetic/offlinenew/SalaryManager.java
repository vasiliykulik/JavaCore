package src.m3_oop_inherit_debug_access_modifiers_employee_student_arithmetic.offlinenew;

/**
 * Created by Стрела on 31.08.2016.
 */
public class SalaryManager {

    public static void main(String[] args) {

        Employee[] array = new Employee[10]; // контейнер employee

        array[0] = new Employee(true, "John1",329, "pavlov1", "44a",3500);
        array[1] = new Employee(true, "John2",328, "pavlov2", "44a",1500);
        array[2] = new Employee(true, "John3",327, "pavlov3", "44a",3500);
        array[3] = new Employee(true, "John4",326, "pavlov4", "44a",9500);
        array[4] = new Employee(true, "John5",325, "pavlov5", "44a",3500);
        array[5] = new Employee(true, "John6",324, "pavlov6", "44a",6500);
        array[6] = new Employee(true, "John7",323, "pavlov78", "44a",3530);
        array[7] = new Employee(true, "John8",322, "pavlov8", "44a",3540);
        array[8] = new Employee(true, "John9",321, "pavlov0", "44a",3500);
        array[9] = new Employee(true, "John9",321, "pavlov0", "44a",3500);

        int sum=0;
        for (int i=0;i< array.length ;i++){

            sum +=array[i].getSalary();

        }
        System.out.println(sum);
        }
    }

/*
array[0] = employee;
        array[1] = employee;
        array[2] = employee;
        array[3] = employee;
        array[4] = employee;
        array[5] = employee;
        array[6] = employee;
        array[7] = employee;
        array[8] = employee;
        array[9] = employee;*/