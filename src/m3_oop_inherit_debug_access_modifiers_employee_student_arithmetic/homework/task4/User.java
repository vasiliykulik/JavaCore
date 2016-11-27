package src.m3_oop_inherit_debug_access_modifiers_employee_student_arithmetic.homework.task4;

public class User {
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

/* Если создать пустой конструктор - то инициализации начальными значениями не будет

 */
    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }


    public void paySalary(int i) {
        setBalance(this.balance+i);
    }

    public void withdraw(int summ) {
        int commission;
        double withdrawPlusCommision;
        if (summ < 1000) {
            commission = 5;
        } else {
            commission = 10;
        }
        withdrawPlusCommision = summ / 100 * commission + summ;
        if (withdrawPlusCommision < this.balance) {
            setBalance(getBalance() - withdrawPlusCommision);
        }
        else{
            System.out.println("NO");
        }
    }

    public void companyNameLength(String companyName) {
        System.out.println(companyName.length());
    }

    public void monthIncreaser(int addMonth) {
        setMonthsOfEmployment(this.monthsOfEmployment+addMonth);
    }


    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }


    private void setName(String name) {
        this.name = name;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    private void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    private void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    private void setSalary(int salary) {
        this.salary = salary;
    }

    private void setCurrency(String currency) {
        this.currency = currency;
    }


}
