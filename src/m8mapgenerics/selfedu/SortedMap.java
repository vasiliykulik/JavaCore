package src.m8mapgenerics.selfedu;

import java.util.Comparator;
import java.util.Map;

/**
 * Created by Стрела on 12.10.2016.
 */
public interface SortedMap<K, V> extends Map<K, V> {
    Comparator<? super K> comparator();
    SortedMap<K, V> subMap(K fromKey, K toKey);
    SortedMap<K, V> headMap(K toKey);
    SortedMap<K, V> tailMap(K fromKey);
    K firstKey();
    K lastKey();
}
