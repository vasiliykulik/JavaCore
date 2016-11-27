package src.m5equalshashcode.practice.Zadacha4_Next;

public abstract class Bank {
    private long ID;
    private Currency currency;
    private int totalCapital;
    private double rating;
    private String name;

    public Currency getCurrency() {
        return currency;
    }

    abstract int getCommission(int summ);

    abstract int getLimitOfWithdrawal();

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "currency=" + currency +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //if (o == null || getClass() != o.getClass()) return false;

        Bank bank = (Bank) o;

        if (ID != bank.ID) return false;
        if (totalCapital != bank.totalCapital) return false;
        if (Double.compare(bank.rating, rating) != 0) return false;
        if (currency != bank.currency) return false;
        return name != null ? name.equals(bank.name) : bank.name == null;

    }

    @Override
    public int hashCode() {
        return 0;
    }
}
