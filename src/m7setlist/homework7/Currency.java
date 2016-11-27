package src.m7setlist.homework7;

/**
 * Created by Стрела on 04.10.2016.
 */
public enum Currency {

    USD(840),
    UAH(980); // Currency.UAH.getNumber()

    private int number;

    Currency(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
