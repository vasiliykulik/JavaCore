package src.m3_oop_inherit_debug_access_modifiers_employee_student_arithmetic.homework.task4old;

public class User {
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public void paySalary(int i) {
        this.balance = this.balance + i;
        setBalance(this.balance);
    }

    public void withdraw(int summ) {
        int commission;
        double withdrawPlusCommision;
        if (summ < 1000) {
            commission = 5;
        } else {
            commission = 10;
        }
        withdrawPlusCommision = summ / 100 * 10 + summ;
        if (withdrawPlusCommision < this.balance) {
            setBalance(getBalance() - withdrawPlusCommision);
        }
    }

    public void companyNameLenfht(String companyName) {
        int j = 0;
        for (int i = 0; i <= companyName.length() - 1; i++) {
            j++;
        }
        System.out.println(j);


    }

    int monthIncreaser(int addMonth) {
        this.monthsOfEmployment = this.monthsOfEmployment+addMonth;
        setMonthsOfEmployment(this.monthsOfEmployment);

        return 0;
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
