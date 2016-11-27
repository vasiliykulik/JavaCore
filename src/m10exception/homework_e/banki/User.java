package src.m10exception.homework_e.banki;

/**
 * Created by Стрела on 06.09.2016.
 */
public class User {
    private long id;
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyname;
    private int salary;
    private Bank bank;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", monthsOfEmployment=" + monthsOfEmployment +
                ", companyname='" + companyname + '\'' +
                ", salary=" + salary +
                ", bank=" + bank +
                '}';
    }
}
