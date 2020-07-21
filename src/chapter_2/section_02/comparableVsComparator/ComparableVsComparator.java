package chapter_2.section_02.comparableVsComparator;

import java.util.Comparator;

public class ComparableVsComparator implements Comparable<ComparableVsComparator>{
    public static final Comparator<ComparableVsComparator> BY_NAME = new ByName();

    private String name;

    public ComparableVsComparator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(ComparableVsComparator comparableVsComparator) {
        if(comparableVsComparator.getName().compareTo(this.getName()) > 0)
            return 1;
        else if(comparableVsComparator.getName().compareTo(this.getName()) < 0)
            return -1;
        else
            return 0;
    }
    private static class ByName implements Comparator<ComparableVsComparator>{

        @Override
        public int compare(ComparableVsComparator comparableVsComparator, ComparableVsComparator comparableVsComparator_2) {
            return comparableVsComparator.getName().compareTo(comparableVsComparator_2.getName());
        }
    }
}
