package chapter_1.section_05.weightedQuickUnionPathComparisonUF;

class WeightedQuickUnionPathComparisonUF {
    private int[] ids;
    private int[] size;

    WeightedQuickUnionPathComparisonUF(int numberOfObjects) {
        ids = new int[numberOfObjects];
        size = new int[numberOfObjects];

        for (int i = 0; i < numberOfObjects; i++) {
            ids[i] = i;
        }
    }

    void union(int firstObject, int secondObject) {
        int firstObjectRoot = findRoot(firstObject);
        int secondObjectRoot = findRoot(secondObject);
        if (firstObject == secondObjectRoot) return;
        else if (size[firstObject] <= size[secondObject]) {
            ids[firstObject] = secondObjectRoot;
            size[secondObject] += size[firstObject];
        } else {
            ids[secondObject] = firstObjectRoot;
            size[firstObject] += size[secondObject];
        }
    }

    boolean isConnected(int firstObject, int secondObject) {
        return findRoot(firstObject) == findRoot(secondObject);
    }

    int findRoot(int object) {
        while (object != ids[object]) {
            //Change grand parent to root
            ids[object] = ids[ids[object]];
            object = ids[object];
        }
        return object;
    }
}
