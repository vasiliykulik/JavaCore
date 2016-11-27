package src.m7setlist.questions;

import java.util.Comparator;

public class SortMessages implements Comparator<Message> {
    @Override
    public int compare(Message o1, Message o2) {
        return o1.getDeviceName().compareTo(o2.getDeviceName());
    }
}
