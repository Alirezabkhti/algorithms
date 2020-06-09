package chapter_1.section_05.quickUnionPathComparisonUF;

public class QuickUnionPathComparisonUF {
    private int[] ids;

    QuickUnionPathComparisonUF(int numberOfObjects) {
        ids = new int[numberOfObjects];
        for (int i = 0; i < numberOfObjects; i++) {
            ids[i] = i;
        }
    }

    void union(int firstObject, int secondObject) {
        int firstObjectRoot = findRoot(firstObject);
        int secondObjectRoot = findRoot(secondObject);
        ids[firstObjectRoot] = secondObjectRoot;
    }

    boolean isConnected(int firstObject, int secondObject) {
        return findRoot(firstObject) == findRoot(secondObject);
    }

    /*void printIds() {
        for (int i = 0; i < ids.length; i++) {
            System.out.println("value of " + i + " is " + ids[i]);
        }
    }*/

    //While case
    private int findRoot(int object) {
        while (object != ids[object]) {
            //Change grand parent root
            ids[object] = ids[ids[object]];
            object = ids[object];
        }
        return object;
    }
}
