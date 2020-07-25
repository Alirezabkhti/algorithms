package chapter_2.section_02.comparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AL_03_ComparableVsComparator {
    public static void main(String[] args) {
        ComparableVsComparator alireza = new ComparableVsComparator("Alireza");
        ComparableVsComparator jack = new ComparableVsComparator("Jack");
        ComparableVsComparator lisa = new ComparableVsComparator("Lisa");

        List<ComparableVsComparator> comparableVsComparators = new ArrayList<>();
        comparableVsComparators.add(lisa);
        comparableVsComparators.add(jack);
        comparableVsComparators.add(alireza);
        //Comparable
        Collections.sort(comparableVsComparators);
        for (ComparableVsComparator s: comparableVsComparators) {
            System.out.print(s.getName()  + "   ");
        }
        System.out.println();
        //Comparator
        comparableVsComparators.sort(ComparableVsComparator.BY_NAME);
        for (ComparableVsComparator s: comparableVsComparators) {
            System.out.print(s.getName()  + "   ");
        }

    }
}
