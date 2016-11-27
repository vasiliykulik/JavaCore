package src.m8mapgenerics.question_answer;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by Стрела on 11.10.2016.
 */
public class TestDataStructure implements Spliterator {
    @Override
    public Comparator getComparator() {
        return null;
    }

    @Override
    public boolean hasCharacteristics(int characteristics) {
        return false;
    }

    @Override
    public long getExactSizeIfKnown() {
        return 0;
    }

    @Override
    public void forEachRemaining(Consumer action) {

    }

    @Override
    public int characteristics() {
        return 0;
    }

    @Override
    public long estimateSize() {
        return 0;
    }

    @Override
    public Spliterator trySplit() {
        return null;
    }

    @Override
    public boolean tryAdvance(Consumer action) {
        return false;
    }
}
