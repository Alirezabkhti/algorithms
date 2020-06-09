package chapter_1.section_05.quickUnionUF;

class QuickUnionUF {
    private int[] ids;

    QuickUnionUF(int numberOfObjects) {
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

    private int findRoot(int object) {
        int root = ids[object];

        if (object == root)
            return root;
        else
            findRoot(ids[object]);

        return root;
    }

    //While case
    private int findRootUsingWhile(int object) {
        while (object != ids[object]) object = ids[object];
        return object;
    }
}
