package src.m5equalshashcode.practice.Zadacha4_1;

/**
 * Created by Стрела on 12.09.2016.
 * Overiride = через alt insert
 */
public class Apple {
    private int weight;
    public Apple(int weight){
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apple)) return false;

        Apple apple = (Apple) o;

        return weight == apple.weight;

    }

    @Override
    public int hashCode() {
        return weight;
    }
}
