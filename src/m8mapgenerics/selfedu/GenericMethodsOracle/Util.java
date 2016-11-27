package src.m8mapgenerics.selfedu.GenericMethodsOracle;

/**
 * Created by Стрела on 13.10.2016.
 */
public class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}

class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    public K getKey()   { return key; }
    public V getValue() { return value; }

    //   The complete syntax for invoking this method would be:
    Pair<Integer, String> p3 = new Pair<>(3, "apple");
    Pair<Integer, String> p4 = new Pair<>(4, "pear");
    boolean same1 = Util.<Integer, String>compare(p3, p4);


    //      The type has been explicitly provided, as shown in bold. Generally, this can be left out and the compiler will infer the type that is needed:
    Pair<Integer, String> p1 = new Pair<>(1, "apple");
    Pair<Integer, String> p2 = new Pair<>(2, "pear");
    boolean same = Util.compare(p1, p2);
}



